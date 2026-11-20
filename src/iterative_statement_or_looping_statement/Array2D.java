package iterative_statement_or_looping_statement;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of row : ");
		int i=sc.nextInt();
		System.out.println("Enter the size of column : ");
		int j=sc.nextInt();
		
		int a[][]=new int[i][j];
		System.out.println("2-D array");
		System.out.println("Enter the array elements : ");
		for(int r=0;r<i;r++)
		{
			System.out.println("Enter the elements in row "+r);
			for(int c=0;c<j;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		
		System.out.println("The 2-Dimentional array "+i+"*"+j);
		for(int r=0;r<i;r++)
		{
			for(int c=0;c<j;c++)
			{
				System.out.print(" "+a[r][c]);
			}
			System.out.println();
		}
		sc.close();
	}

}
