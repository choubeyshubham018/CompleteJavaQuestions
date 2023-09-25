package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.controller.UserController;
import in.ineuron.model.User;

@SpringBootApplication
public class Ques22UserOrderDetailApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ques22UserOrderDetailApplication.class, args);
	    
		UserController user = context.getBean(UserController.class);
	
		//String status = user.saveUsers();
		//System.out.println(status);
		
		System.out.println(user.getUser(1));
	
		
	//	 user.getAllUser().forEach(System.out::print);
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
