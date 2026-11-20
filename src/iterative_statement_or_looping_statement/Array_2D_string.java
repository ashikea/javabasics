package iterative_statement_or_looping_statement;

import java.util.Scanner;

public class Array_2D_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of 2D array");
		System.out.println("Enter the size of row : ");
		int r=sc.nextInt();
		System.out.println("Enter the size of column : ");
		int c=sc.nextInt();
		
		String a[][]=new String[r][c];
		
		System.out.println("Enter your Elements ");
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter the string in row "+i);
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.next();
			}
		}
		
		System.out.println("The out put is ");
		
		for(String x[]:a)
		{
			for(String y:x)
			{
				System.out.print(y+"\t ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
