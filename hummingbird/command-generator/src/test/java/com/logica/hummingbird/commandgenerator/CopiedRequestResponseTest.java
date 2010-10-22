package com.logica.hummingbird.commandgenerator;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.test.CamelTestSupport;

public class CopiedRequestResponseTest extends CamelTestSupport {

	   public void testConsumerTemplate() throws Exception {
	        template.sendBodyAndHeader("activemq:queue:consumer", "Message1", "SIZE_NUMBER", 1505);
	        template.sendBodyAndHeader("activemq:queue:consumer", "Message3", "SIZE_NUMBER", 1300);
	        template.sendBodyAndHeader("activemq:queue:consumer", "Message2", "SIZE_NUMBER", 1600);

	        // process every exchange which is ready. If no exchange is left break
	        // the loop
	        while (true) {
	            Exchange ex = consumer.receiveNoWait("activemq:queue:consumer?selector=SIZE_NUMBER<1500");
	            if (ex != null) {
	                Message message = ex.getIn();
	                int size = message.getHeader("SIZE_NUMBER", int.class);
	                assertTrue("The message header SIZE_NUMBER should be less than 1500", size < 1500);
	                assertEquals("The message body is wrong", "Message3", message.getBody());
	            } else {
	                break;
	            }
	        }

	    }
	
}
