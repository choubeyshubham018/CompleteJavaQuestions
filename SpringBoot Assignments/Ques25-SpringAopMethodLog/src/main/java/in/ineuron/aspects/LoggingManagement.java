package in.ineuron.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingManagement {

	Logger log=LoggerFactory.getLogger(LoggingManagement.class);
	@Pointcut("execution(public * in.ineuron.service.ServiceImpl.saveData())")
     public void p1() {}
	
	@Pointcut("execution(public * in.ineuron.service.*.updateData(..))")
	public void p2() {}
	
	@Pointcut("execution(public * in.ineuron.service.*.removeData(..))")
	public void p3() {}
	
	@Pointcut("@annotation(in.ineuron.annotation.MyLogger)")
	public void p4() {}
	
	
	@Before("p1()")
	public void startMethod() {
		log.info("Controls Enters the Save DataMethod");
	}
	@After("p1()")
	public void exitMethod() {
		log.info("Control completed the execution of save Method  and exiting from it");
	}
	
	@Around("p2()")
	public void updateDataMethod(ProceedingJoinPoint jp) {
		log.info("Controls enter the updateData()");
		try {
			 jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Control exit the updateData()");
		
	}
	@Around("p3()")
	public void deleteDataMethodStart(ProceedingJoinPoint jp) {
		log.info("Controls enter the removeData()");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Control exit the removeData()");
		
	}

	@Around("p4()")
	public void searchDataMethodStart(ProceedingJoinPoint jp) {
		log.info("Controls enter the searchData()");
		try {
			 jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Control exit the searchData()");
		
	}
	
}
