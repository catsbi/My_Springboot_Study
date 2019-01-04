package com.bit.codesquare.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MariaDbTestApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MariaDbTestApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MariaDbTestApplication.class, args);
	}

}

