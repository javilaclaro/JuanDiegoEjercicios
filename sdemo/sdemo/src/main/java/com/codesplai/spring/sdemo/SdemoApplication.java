package com.codesplai.spring.sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.codesplai.spring.demo.controllers" })
@EnableJpaRepositories(basePackages = "com.codesplai.spring.demo.repositories")
@EnableTransactionManagement
@EntityScan(basePackages = "com.codesplai.spring.demo.models")

public class SdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdemoApplication.class, args);
	}

}
