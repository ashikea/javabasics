package Task;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean isTrue = true;

		for (int i = 2; i <= n / 2; i++) {
		    if (n % i == 0) {   // check divisibility
		        isTrue = false; // not prime
		        break;          // exit loop early
		    }
		}

		if (isTrue && n > 1) {
		    System.out.println(n + " is prime.");
		} else {
		    System.out.println(n + " is not prime.");
		}

		
	}

}
