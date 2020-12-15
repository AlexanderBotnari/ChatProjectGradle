package client;

import java.io.IOException;
import java.net.UnknownHostException;

import enums.Actions;
import lib.Action;
import lib.Connection;
import lib.Message;
import lib.User;

public class ChatApplication {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
//		System.out.println("Client Starting!!!");
		
         run();

//		System.out.println("Client Ending!!!");
	}
	
	public static void run() {
		
		try {
			Connection con = new Connection("localhost",7777);
			
			con.send(new Action(Actions.SIGNIN));
			
			System.out.println("Client >> server sent back : "+con.fetch());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Message msg = new Message("Hello Server!");
//		msg.setFrom(new User("Mister Writer"));
//		msg.setTo(new User("Mister Reader"));
	}
}
