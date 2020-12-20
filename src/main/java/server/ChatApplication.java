package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lib.Action;
import lib.Connection;
import lib.Message;
import lib.Operation;
import lib.User;

public class ChatApplication {

	private static Map<Socket,User> users = new HashMap<>(); 
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
//     	System.out.println("Server Starting!!!");
		
			ServerSocket serverSocket = new ServerSocket(7777);
			Connection con = new Connection(serverSocket.accept());
		  
			Action action  = (Action) con.fetch();
			
			System.out.println("Server >> client sent : "+ action);
	
			if(action.getType() == Operation.SIGNIN) {
     			users.put(con.getSocket(), (User) action.getTarget());
				con.send(new Action(Operation.SUCCES));
			}
			
// 			users.put(new Socket(), new User("Vanea"));
// 			users.put(new Socket(), new User("Jora"));

			 action = (Action) con.fetch();
			 
			if(action.getType() == Operation.USERLIST) {
				Object[] values = users.values().toArray();
				con.send(new Action(Operation.SUCCES,values));			
			}
			
//		Message msg = new Message("Hello Back!");
//		msg.setFrom(new User("Mister Printer"));
//		msg.setTo(new User("Mister Reader"));
		
//		System.out.println("Server Ending!!!");
			}

}
