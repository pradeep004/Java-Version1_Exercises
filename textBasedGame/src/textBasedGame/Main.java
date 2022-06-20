package textBasedGame;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = null,catchPhrase = null;
		int health = 0;
		boolean correctValue = false;
		while(!correctValue) {
			try {
				
				System.out.println("Please the charecter name :");
				name = sc.nextLine();
				System.out.println("Please the enter the health of the character :");
				health = Integer.parseInt(sc.nextLine());
				System.out.println("please enter the characte's favorite line:");
				catchPhrase = sc.nextLine();
				correctValue= true;
				break;
			}catch(NumberFormatException|InputMismatchException ex) {
				System.out.println("Error try again:");
				sc.nextLine();
			}
			
		}
		
		Characters ch = new Characters(name, health,catchPhrase);
		ch.getInfo();
		
		
		int X = 0;
		int Y = 0;
		
		while(!correctValue) {
			try {
				System.out.print("Enter the map size ofvalue X:");
				X = sc.nextInt();
				System.out.print("Enter the  map size Y:");
				Y =sc.nextInt();
				correctValue = true;
				break;
				
			}catch(NumberFormatException |InputMismatchException ex) {
				System.out.println("Error");
				sc.nextLine();
			}
		}
		
		Random rand = new Random();
		int currentX = rand.nextInt(X+1);
		int currentY = rand.nextInt(Y+1);
		
		map m = new map(X, Y, currentX,currentY);
		m.getInfo();
		
		int winX = rand.nextInt(X+1);
		int winY = rand.nextInt(Y+1);
		System.out.println("the winning points are:"+ winX +","+ winY);
		
		String direction;
		while(m.getCurrentX() != winX || m.getCurrentY() != winY) {
			try {
				System.out.print("Please enter a direction N, E, S, or W:");
				direction = sc.nextLine();
				m.move(direction);
				m.getInfo();	
			}catch (InputMismatchException ex){
				System.out.println("Enter the given direction: ");
				direction = sc.nextLine();
				
			}			
		}
		System.out.println("You've reached your destination");
		
	}

}
