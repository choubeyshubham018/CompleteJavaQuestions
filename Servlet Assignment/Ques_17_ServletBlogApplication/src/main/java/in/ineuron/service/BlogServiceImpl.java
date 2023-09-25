package in.ineuron.service;

import java.util.List;

import in.ineuron.dao.IBlogDao;
import in.ineuron.daofactory.BlogDaoFactory;
import in.ineuron.dto.Blog;
import in.ineuron.servicefactory.BlogServiceFactory;

public class BlogServiceImpl implements IBlogService {

	private IBlogDao dao;
	public BlogServiceImpl() {
		dao=BlogDaoFactory.getDao();
	}
	@Override
	public String saveBlog(Blog blog) {
      
		return dao.saveBlog(blog);
	}

	@Override
	public List<Blog> getBlog() {
		return dao.getBlog();
	}

}
