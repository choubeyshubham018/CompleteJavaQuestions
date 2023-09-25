package in.ineuron.service;

import in.ineuron.dao.IUserDao;
import in.ineuron.daofactory.UserDaoFactory;
import in.ineuron.model.User;

public class UserServiceImpl implements IUserService {

	private IUserDao dao;
	
	public UserServiceImpl() {
		dao=UserDaoFactory.getDaoUserImpl();
	}
	@Override
	public String insertUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public User selectUser(Integer id) {
		return dao.getUser(id);
	}

	@Override
	public String updateUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public String deleteUser(Integer id) {
		return dao.deleteUser(id);
	}

}
