package in.ineuron.repo;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;


@Repository
public class StudentDaoImpl implements IStudentDao {

	private Transaction transaction;
	private Session session;

	@Override
	public String saveStudents(Student student) {
		String res="";
		Integer sid = null;
	    Boolean status=false;
	try {
		session = HibernateUtil.getSession();
	
		if(session!=null)
		transaction=session.beginTransaction();
		
		if(transaction!=null) {
			  sid=(Integer) session.save(student);
		}
		res="Record is saved by Id :: "+ sid ;
       status=true;
	}catch (HibernateException he) {
		he.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(status) {
			transaction.commit();
		}else {
			transaction.rollback();
		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	return res;
	}
	@Override
	public Student fetchStudentById(Integer id) {
		 session = HibernateUtil.getSession();
		 Student student=null;
        try {
		 if(session!=null) {
		  student = session.get(Student.class, id);
          }
        }catch (HibernateException he) {
    		he.printStackTrace();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> fetchAllStudents() {
		session = HibernateUtil.getSession();
		List<Student> list=null;
	try {
		if(session!=null) {
			Query<Student> query = session.createQuery("From in.ineuron.model.Student");
			 list = query.list();
		}
	}catch (HibernateException he) {
		he.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}	finally {
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}
	
	return list;
	}

}
