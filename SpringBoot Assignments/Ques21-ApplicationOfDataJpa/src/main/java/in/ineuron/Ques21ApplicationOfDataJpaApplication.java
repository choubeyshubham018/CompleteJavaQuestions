package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.controller.StudentController;

@SpringBootApplication
public class Ques21ApplicationOfDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ques21ApplicationOfDataJpaApplication.class, args);
	     StudentController controller = context.getBean(StudentController.class);
	    
	   //  controller.saveStudent();
	     controller.saveStudentList();
	     ((ConfigurableApplicationContext) context).close();
	}

}
