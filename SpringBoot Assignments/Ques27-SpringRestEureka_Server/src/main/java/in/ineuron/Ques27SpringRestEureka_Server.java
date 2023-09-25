package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ques27SpringRestEureka_Server {

	public static void main(String[] args) {
		SpringApplication.run(Ques27SpringRestEureka_Server.class, args);
	}

}
