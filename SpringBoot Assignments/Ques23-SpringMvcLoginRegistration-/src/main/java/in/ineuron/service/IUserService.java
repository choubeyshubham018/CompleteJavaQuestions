package in.ineuron.service;

import in.ineuron.model.User;

public interface IUserService {

	String saveUser(User user);
	
	String loginUser(String userId,String password);
}
