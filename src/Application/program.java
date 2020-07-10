package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class program {

	public static void main(String[] args) {
		Rooms[] rooms = new Rooms[10];
		//instance of scanner
		Scanner sc = new Scanner(System.in);
		
		//get rent quantity
		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		System.out.println();
		
		
		for(int i = 1 ; i<= rent; i++) {
			
			//get info name
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			//get info email
			System.out.print("Email: ");
			String email = sc.next();
			
			
			//get info room
			System.out.print("Room:");
			int room = sc.nextInt();
			
			//Reserve room
			rooms[room] = new Rooms(name, email);
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0;i<10;i++) {
			if(rooms[i] != null) {
				System.out.println(i+": "+rooms[i]);
			}
		}
		
	
		
		sc.close();

	}

}
