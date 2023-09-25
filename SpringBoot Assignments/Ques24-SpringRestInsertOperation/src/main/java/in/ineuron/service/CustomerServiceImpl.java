package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Customer;
import in.ineuron.repo.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String saveCustomer(Customer customer) {
	   Integer custId = repo.save(customer).getCustId();	
		return "Customer Data is saved with ID :: "+custId;
	}

}
