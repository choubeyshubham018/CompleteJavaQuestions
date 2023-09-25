package in.ineuron.servicefactory;

import in.ineuron.service.IUserService;
import in.ineuron.service.UserServiceImpl;

public class UserServiceFactory {

	private static IUserService service;
	
	public static IUserService getUserService() {
		if(service==null) {
			service=new UserServiceImpl();
		}
		return service;
	}
	
}
