package control_statement;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21,weight=50;
		if(age>=18)
		{
			if(weight<=55)
			{
				System.out.println("You are eligible");
			}
			else
			{
				System.out.println("You are not eligible due to weight");
			}
		}
		else
		{
			System.out.println("You are not not eligible due to age");
		}

	}

}
