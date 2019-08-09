package com.cisco.helloworldkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloWorldKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldKubernetesApplication.class, args);
	}

	@GetMapping("/greeting")
	public String getGreeting() {
		return "hello world";
	}


}
