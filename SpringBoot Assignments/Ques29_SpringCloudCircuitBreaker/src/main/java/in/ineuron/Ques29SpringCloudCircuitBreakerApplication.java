package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@SpringBootApplication
@EnableCircuitBreaker
public class Ques29SpringCloudCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ques29SpringCloudCircuitBreakerApplication.class, args);
	}

}
