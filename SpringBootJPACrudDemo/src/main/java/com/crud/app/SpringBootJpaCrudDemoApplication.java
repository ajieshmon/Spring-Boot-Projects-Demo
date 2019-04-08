package com.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.crud")
@EnableJpaRepositories(basePackages = {"com.crud.repository"})
@EntityScan(basePackages = {"com.crud.model"})
public class SpringBootJpaCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaCrudDemoApplication.class, args);
	}

}
