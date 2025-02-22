package br.com.microservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceConfigServerApplication.class, args);
	}

}
