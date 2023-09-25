package in.ineuron.dao;

import in.ineuron.model.User;

public interface IUserDao {

	public String addUser(User user);
	
	public User getUser(Integer id);
	
	public String updateUser(User user);
	
	public String deleteUser(Integer id);
}
