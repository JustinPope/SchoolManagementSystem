package textgui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int option;
		int number1, number2;
		while(true) {
			System.out.println("Enter your choice. 1: Addition 2: Subtraction 3: Division 4: Multiplication");
			option = Integer.parseInt(in.next());
			if(option == 1) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				int number3 = number1 + number2;
				System.out.println("The Sum Is " + number3);
			} else if(option == 2) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				int number3 = number1 - number2;
				System.out.println("The Difference Is " + number3);
			} else if(option == 3) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				int number3 = number1 / number2;
				System.out.println("The Sum Is " + number3);
			} else if(option == 4) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				int number3 = number1 * number2;
				System.out.println("The Sum Is " + number3);
			}
		}
		
	}
	
	public static void askForNumbers() {
		System.out.println("Enter 2 numbers");
	}
	
}
