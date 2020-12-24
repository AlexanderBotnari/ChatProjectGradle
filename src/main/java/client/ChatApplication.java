package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lib.Action;
import lib.Connection;
import lib.Message;
import lib.Operation;
import lib.User;

public class ChatApplication {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IOException, ClassNotFoundException {
//		System.out.println("Client Starting!!!");
		
			Connection con = new Connection("localhost",7777);
			
			
			Scanner in = new Scanner(System.in);
			System.out.print("Enter user name >> ");
			
			con.send(new Action(Operation.SIGNIN,new User(in.nextLine())));
			
			do {
			Action action = (Action) con.fetch();
			
			System.out.println("Client >> server sent back : "+ action);
			
			if(action.getType() == Operation.SUCCES) {
				System.out.println("Signed In");
			}else {
				System.err.println(Operation.FAILURE);
			}
			
			con.send(new Action(Operation.USERLIST));
			
			action =  (Action) con.fetch();
			
			if(action.getType() == Operation.SUCCES) {
				Object[] targets = (Object[]) action.getTarget();
				System.out.println("User list : ");
				for (Object target : targets) {
					System.out.println(target);
				}
			}else {
				System.err.println(Operation.FAILURE);
			}
			}while(true);
		
//		System.out.println("Client Ending!!!");
	}

}
