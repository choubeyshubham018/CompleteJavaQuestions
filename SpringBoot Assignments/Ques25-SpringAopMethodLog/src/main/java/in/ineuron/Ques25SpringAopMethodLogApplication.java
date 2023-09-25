package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ServiceImpl;

@SpringBootApplication
public class Ques25SpringAopMethodLogApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ques25SpringAopMethodLogApplication.class, args);
//		ServiceImpl service = context.getBean(ServiceImpl.class);
//		System.out.println(service.saveData());
	}

}
