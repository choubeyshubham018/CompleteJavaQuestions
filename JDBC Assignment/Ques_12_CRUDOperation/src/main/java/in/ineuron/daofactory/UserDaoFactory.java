package in.ineuron.daofactory;

import in.ineuron.dao.IUserDao;
import in.ineuron.dao.UserDaoImpl;

public class UserDaoFactory {
	
	private static IUserDao dao;
	
	public static IUserDao getDaoUserImpl() {
		if(dao==null) {
			dao=new UserDaoImpl();
		}
		return dao;
	}

}
