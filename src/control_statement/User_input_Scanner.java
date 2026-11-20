package control_statement;

import java.util.Scanner;

public class User_input_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Roll No:");
		int No=sc.nextInt();
		
		System.out.print("\nEnter your name : ");
		String name=sc.next();
		
		System.out.print("\nEnter a charcter");
		char c=sc.next().charAt(0);
		
		System.out.print("\n Your Roll No:"+No+ "\n Name : "+name+"\n Character "+c);
		
		sc.close();
	}

}
