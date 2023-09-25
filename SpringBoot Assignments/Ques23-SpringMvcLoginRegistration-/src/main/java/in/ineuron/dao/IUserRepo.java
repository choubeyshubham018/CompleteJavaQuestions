package in.ineuron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.User;

public interface IUserRepo extends JpaRepository<User, String> {

}
