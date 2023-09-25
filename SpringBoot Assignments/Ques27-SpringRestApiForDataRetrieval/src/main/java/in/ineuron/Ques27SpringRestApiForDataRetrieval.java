package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class Ques27SpringRestApiForDataRetrieval {

	public static void main(String[] args) {
		SpringApplication.run(Ques27SpringRestApiForDataRetrieval.class, args);
	}

}
