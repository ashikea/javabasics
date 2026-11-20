package Task;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to check armstrong or not");
		int n=sc.nextInt();
		int count=0,arm=0;
		int temp=n,n2=n;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		while(n2!=0)
		{
			int digit=n2%10;
			int p=1;
			
			for(int i=0;i<count;i++)
			{
				p=p*digit;
				
			}

			arm=arm+p;
			
			n2=n2/10;
		}
		
		if(arm==temp)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}

	}

}
