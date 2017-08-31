package com.smapley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class PlatformZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformZuulApplication.class, args);
	}
}
