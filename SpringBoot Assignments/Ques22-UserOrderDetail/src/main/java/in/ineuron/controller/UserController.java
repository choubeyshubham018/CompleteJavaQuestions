package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.model.Orders;
import in.ineuron.model.User;
import in.ineuron.service.IUserService;

@Component
public class UserController {

	@Autowired
	private IUserService service;
	
	public String saveUsers() {
		User u1 = new User("Sachin","MI");
		Orders o1 = new Orders("Watch",2550.045d);
		Orders o2 = new Orders("Laptop",45050.85d);
		u1.setOrders(List.of(o1,o2));
		User u2 = new User("Rohit","MI");
		Orders o3 = new Orders("Iphone",145050.5d);
		Orders o4 = new Orders("HeadPhone",5080.15d);
		u2.setOrders(List.of(o3,o4));
		
		return service.saveUsers(List.of(u1,u2));
		
	}
	
	public User getUser(Integer id) {
		return service.fetchUser(id);
	}
	
   	public List<User> getAllUser(){
   		return service.fetchAllUser();
   	}
	
}
