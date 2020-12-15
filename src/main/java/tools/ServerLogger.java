package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServerLogger {
	
	@Before("execution( void start())")
    public void logBeforeStart() {
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
	
	@After("execution( void start())")
	public void logAfterStart() {
		System.out.println("Server Ending!");
	}

}
