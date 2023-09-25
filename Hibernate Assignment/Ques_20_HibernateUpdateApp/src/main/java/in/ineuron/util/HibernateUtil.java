package in.ineuron.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.ineuron.model.Players;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;
	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Players.class).buildSessionFactory();
	}
	private HibernateUtil() {
	}
	
	public static Session getSession() {
		if(sessionFactory!=null) {
		 session = sessionFactory.openSession();
		}
		return session;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	

}
