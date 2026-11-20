package practice;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=33;
		if(age>=1 && age<=18)
		{
			System.out.println("You are a minor");
		}else if(age>=18 && age<=24)
		{
			System.out.println("You are eligible");
		}else
		{
			System.out.println("You are not eligible");
		}

	}

}
