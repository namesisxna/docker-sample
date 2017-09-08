package com.cts.gto.dockerdemo.controller;

import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration().component("jetty").host("localhost").port(80).bindingMode(RestBindingMode.off);
		rest("/dockerdemo")
		.get("/getText").to("direct:getText");
	}

}
