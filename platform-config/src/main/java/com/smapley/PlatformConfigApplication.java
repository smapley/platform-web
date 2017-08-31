package com.smapley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PlatformConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformConfigApplication.class, args);
	}
}
