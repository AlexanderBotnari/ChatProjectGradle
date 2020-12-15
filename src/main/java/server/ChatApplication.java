package server;

import java.io.IOException;
import java.net.ServerSocket;

import enums.Actions;
import lib.Action;
import lib.Connection;
import lib.Message;
import lib.User;

public class ChatApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//     	System.out.println("Server Starting!!!");
		
		
		start();
		
//		System.out.println("Server Ending!!!");
	}
	
public static void start() {
		
		try {
			ServerSocket serverSocket = new ServerSocket(7777);
			Connection con = new Connection(serverSocket.accept());
			
			System.out.println("Server >> client sent : "+ con.fetch());
		    con.send(new Action(Actions.CONFIRMED));
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
//		Message msg = new Message("Hello Back!");
//		msg.setFrom(new User("Mister Printer"));
//		msg.setTo(new User("Mister Reader"));

   }
}
