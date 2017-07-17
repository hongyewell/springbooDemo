package com.geekymv.springboot_demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.geekymv.springboot_demo.service.SampleService;
import com.geekymv.springboot_demo.service.impl.SampleServiceImpl;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		 ApplicationContext ctx = new SpringApplicationBuilder()  
						         .sources(App.class)  
						         .web(false)  
						         .run(args);  
		 SampleService sampleService = ctx.getBean(SampleServiceImpl.class);
		 sampleService.doSomething();
	}
}
