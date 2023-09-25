package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.User;
import in.ineuron.repo.IUserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepo repo;
	@Override
	public String saveUsers(List<User> users) {
		repo.saveAll(users);
		return "All record saved Succesfully";
	}

	@Override
	public User fetchUser(Integer id) {
		Optional<User> user = repo.findById(id);
		return user.get();
	}

	@Override
	public List<User> fetchAllUser() {
		return repo.findAll();
	}

}
