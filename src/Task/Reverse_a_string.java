package Task;

import java.util.Scanner;

public class Reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String name=sc.next();
		int n=name.length();
		System.out.println(n);
		
		String rev=" ";
		
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

	}

}
