package top.oyoung.cloudapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiDemoApplication.class, args);
	}
}
