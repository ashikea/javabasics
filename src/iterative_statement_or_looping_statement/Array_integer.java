package iterative_statement_or_looping_statement;

import java.util.Scanner;

public class Array_integer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter numbers up to "+n);
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Entered numbers are ");
		
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
	//for(datatype tempvar:arrayname)
//		{
//			
//		}
		for(int j:a)
		{
			System.out.println(j);
		}
		sc.close();

	}

}
