package Task;

import java.util.Scanner;

public class Matrix3x3_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix Addition");
		
		int r=3;
		int c=3;
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int k[][]=new int[r][c];
		System.out.println("Enter the 1 . array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the 2 . array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				k[i][j]=a[i][j]+b[i][j];
			}
		}
		

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}

	}
}
