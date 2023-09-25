package in.ineuron.service;

import in.ineuron.model.User;

public interface IUserService {

	public String insertUser(User user);
	
	public User selectUser(Integer id);
	
	public String updateUser(User user);
	
	public String deleteUser(Integer id);
}
