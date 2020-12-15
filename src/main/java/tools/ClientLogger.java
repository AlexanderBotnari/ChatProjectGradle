package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ClientLogger {

	@Before("execution(void run())")
	public void logBeforeRun() {
		System.out.println("Client Starting!!!");
	}
	
	@After("execution(void run())")
	public void logAfterRun() {
		System.out.println("Client Ending!!!");
	}
	
	
}
