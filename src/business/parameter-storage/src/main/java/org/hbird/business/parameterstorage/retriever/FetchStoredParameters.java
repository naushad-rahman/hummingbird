/**
 * Licensed under the to the Apache License, Version 2.0. You may obtain a copy of 
 * the License at http://www.apache.org/licenses/LICENSE-2.0 or at this project's root.
 */

package org.hbird.business.parameterstorage.retriever;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.camel.Body;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * Fetches the stored parameters from the database and sends them to a 
 * destination specified in the messages Header.
 * 
 */
public class FetchStoredParameters {
	private Connection connection;
	private String destination;

	@Autowired
	protected ProducerTemplate producer = null;

	@Autowired
	protected CamelContext retrieverContext = null;

	/*
	 * Constructor. Extracts the connection to the database from
	 * the DataSource.
	 * 
	 * IN-param:
	 *   DataSource		dataSource
	 *   	The database to retrieve the parameters from.
	 *   String 		destination
	 *   	Name of the destination to send the retrieved parameters to, 
	 * 		e.g. 'activemq:queue:replay'.
	 */
	public FetchStoredParameters(DataSource dataSource, String destination) {
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.destination = destination;
	}

	/*
	 * Method to fetch the parameters from the database and send them to a 
	 * specified destination.
	 * 
	 * IN-param:  
	 * 		String[]	sqlQuery 		(Is automatically extracted from body) 
	 * 			Array with 2 SQL Queries, e.g. 
	 * 			'select * from ... where timestamp > t1 and timestamp <= t2-1000;
	 * 			 select * from ... where timestamp > t2-1000 and timestamp <= t2;' 
	 */
	public void fetchParameters(@Body String[] sqlQuery) {
		try {
			//Run statements, save results in a ResultSet and call 'createExchangesFromResultset 
			//to process it.
			ResultSet rs;

			Statement statement = connection.createStatement();

			rs = statement.executeQuery(sqlQuery[0]);
			sendParameters(rs);

			rs = statement.executeQuery(sqlQuery[1]);
			sendParameters(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Runs through a complete ResultSet, and creates and sends a message
	 * for every row in the dataset. 
	 * IN-param
	 * 		ResultSet	rs
	 * 			The resultsets that contains all the stored parameters that now 
	 * 			shall be restored and send to a queue/topic.
	 */ 
	private void sendParameters(ResultSet rs) {
		Exchange exchange;

		try {
			//As long as datasets exist in the ResultSet, create a new exchange
			while (rs.next()) {
				exchange = new DefaultExchange(retrieverContext);
//				exchange.getIn().setHeader("Value", rs.getString(2));
//				exchange.getIn().setHeader("Name", parameterName);
//				exchange.getIn().setHeader("Timestamp", rs.getString(1));
				exchange.getIn().setBody(rs.getString(4));
				
				//Send the created exchange
				producer.send(destination, exchange);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
