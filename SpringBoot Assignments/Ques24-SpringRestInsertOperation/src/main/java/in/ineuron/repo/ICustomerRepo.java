package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import in.ineuron.model.Customer;


public interface ICustomerRepo extends JpaRepository<Customer, Integer>{

}
