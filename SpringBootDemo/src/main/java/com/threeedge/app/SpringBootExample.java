package com.threeedge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;  
  
@SpringBootApplication
@ComponentScan(basePackages="com.threeedge")
public class SpringBootExample {
//public class SpringBootExample extends SpringBootServletInitializer {  
	
	/*@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringBootExample.class);
	}*/
	 
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootExample.class, args);  
    }  
}
