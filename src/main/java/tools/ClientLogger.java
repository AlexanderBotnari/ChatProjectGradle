package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ClientLogger {

	@Before("execution(public * client.ChatApplication.*(..))")
	public void logBeforeMain() {
		System.out.println("Client Starting!!!");
	}
	
	@After("execution(public * client.ChatApplication.*(..))")
	public void logAfterMain() {
		System.out.println("Client Ending!!!");
	}
	
	
}
