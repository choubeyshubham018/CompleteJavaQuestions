package in.ineuron.service;

import java.util.List;

import in.ineuron.model.User;

public interface IUserService {
	
	public String saveUsers(List<User> users);
	
	public User fetchUser(Integer id);
	public List<User> fetchAllUser(); 

}
