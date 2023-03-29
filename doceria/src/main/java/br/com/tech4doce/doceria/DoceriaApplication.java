package br.com.tech4doce.doceria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DoceriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoceriaApplication.class, args);
	}

}
