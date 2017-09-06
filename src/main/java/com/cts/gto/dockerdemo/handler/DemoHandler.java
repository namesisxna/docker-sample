package com.cts.gto.dockerdemo.handler;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DemoHandler extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:getText").setBody(constant("hello world"));
	}

}
