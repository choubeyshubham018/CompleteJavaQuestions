package in.ineuron.daofactory;

import in.ineuron.dao.BlogDaoImpl;
import in.ineuron.dao.IBlogDao;

public class BlogDaoFactory {
    
	private static IBlogDao dao;

	public static IBlogDao getDao() {
	if(dao==null) {
		dao=new BlogDaoImpl();
	}
	  return dao;
	}
}
