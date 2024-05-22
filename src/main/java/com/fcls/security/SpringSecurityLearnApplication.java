package com.fcls.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringSecurityLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLearnApplication.class, args);
	}

}
