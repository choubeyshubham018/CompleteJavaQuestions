package in.ineuron.service;

import org.springframework.stereotype.Service;

import in.ineuron.annotation.MyLogger;

@Service
public class ServiceImpl implements IService {

	@Override
	public void saveData() {
		System.out.println("Data Saved Succesfully");
	}

	@Override
	public void removeData(Integer id) {
		System.out.println( "Data is Removed Succesfully for given ID :: "+id);
	}

	@Override
	public void updateData(Integer id) {
		System.out.println( "Data Updated Succesfully for ID :: "+id);
	}

	@Override
	@MyLogger
	public void searchData(Integer id) {
		
		System.out.println("Data is found for Given Id :: "+id);
	}

}
