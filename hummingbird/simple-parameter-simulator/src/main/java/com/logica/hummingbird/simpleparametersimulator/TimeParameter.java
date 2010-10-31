package com.logica.hummingbird.simpleparametersimulator;

import java.util.Date;

import org.apache.camel.Exchange;

import com.logica.hummingbird.jmshelper.ExchangeFormatter;

public class TimeParameter extends BaseParameter {

	public TimeParameter(String name) {
		super(name);
	}

	@Override
	protected void process(Exchange arg0) {
		arg0.setIn(ExchangeFormatter.createParameterMessage(name, Long.class.toString(), ((new Date()).getTime())));		
	}
}
