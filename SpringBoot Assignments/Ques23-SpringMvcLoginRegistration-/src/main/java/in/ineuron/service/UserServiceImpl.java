package in.ineuron.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IUserRepo;
import in.ineuron.model.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepo repo;
	
	@Override
	@Transactional
	public String saveUser(User user) {
		 User u = repo.save(user);
		 System.out.println(u);
		return "User Registered Succesfully";
	}

	@Override
	public String loginUser(String userId, String password) {
		Optional<User> user = repo.findById(userId);
		if(user.get().getUserId().equals(userId)) {
			if(user.get().getPassword().equals(password)) {
				return "User Logged In SuccesFully";
			}
			else
				return "Invalid Password ,TryAgain with Valid Password";
		}
		
		return "Invalid User ID, Try Agin with Valid User ID";
	}

}
