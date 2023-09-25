package in.ineuron.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.service.IService;
@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private IService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(Arrays.asList(args));
		
		System.out.println("*******************************");
		 service.saveData();
		 
		System.out.println("**********************************");
		service.updateData(Integer.parseInt(args[1]));
		
		System.out.println("************************************");
		service.removeData(Integer.parseInt(args[2]));
		
		System.out.println("************************************");
        service.searchData(Integer.parseInt(args[3]));
	}

}
