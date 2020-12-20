package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServerLogger {
	
	@Before("execution( public * server.ChatApplication.*(..))")
    public void logBeforeMain() {
		System.out.println("Server Starting!!!");
	}
	@Before("call( * accept())")
    public void logBeforeAccept() {
		System.out.println("Wait Client!");
	}
	
	@After("call( * accept())")
	public void logAfterAccept() {
		System.out.println("Client Accepted!");
	}
	
	@After("execution( public * server.ChatApplication.*(..))")
	public void logAfterMain() {
		System.out.println("Server Ending!");
	}

}
