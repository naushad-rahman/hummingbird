package org.hbird.command.task;

import java.util.Date;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import org.hbird.formatter.HeaderFields;

@ContextConfiguration (locations={"/CommandExecutorTest-context.xml"})
public class CommandExecutorTest extends AbstractJUnit38SpringContextTests  {

	@Produce(uri = "direct:start")
    protected ProducerTemplate template;
	
	@Autowired
    protected CamelContext context;
	
	@DirtiesContext
	@Test
	public void testReceive() {
		DummyTask task = new DummyTask();
		task.deltaTime = 1000;
		
		sendExchange(task, ((new Date()).getTime() + 1000));
		sendExchange(task, 0);
	}
	
	public void sendExchange(DummyTask task, long delay) {
		Exchange exchange = new DefaultExchange(context);
		exchange.getIn().setBody(task);
		exchange.getIn().setHeader(HeaderFields.EXECUTIONTIME, delay);

		template.send(exchange);

		assertTrue(task.executeCalled == true);
		task.executeCalled = false;		
	}
}
