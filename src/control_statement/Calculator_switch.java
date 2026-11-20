package control_statement;

import java.util.Scanner;

public class Calculator_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.print("\nSelect your option in number :\n");
		int ch=sc.nextInt();
		if(ch<=4&&ch>0)
		{
		System.out.println("Enter value to a :");
		int a=sc.nextInt();
		System.out.println("Enter value to b :");
		int b=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			int ad=a+b;
			System.out.println("Addition result "+a+"+"+b+" = "+ad);
			break;
		case 2:
			int sub=a-b;
			System.out.println("Subtraction ressult "+a+"-"+b+" = "+sub);
			break;
		case 3:
			int mul=a*b;
			System.out.println("Multiplication result "+a+"*"+b+" = "+mul);
			break;
		case 4:
			int div=a/b;
			System.out.println("Div result "+a+"/"+b+" = "+div);
			break;
		default:
			System.out.println("invalid choice");
		}
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		sc.close();
				
	}
		

}
