package com.smapley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PlatformAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformAuthApplication.class, args);
	}
}
