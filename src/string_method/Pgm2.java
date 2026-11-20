package string_method;



public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String io="Java language is platform independent";
		
		System.out.println(io.contains("language"));
		boolean x;
		x=io.contains("language");
		if(x==true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Not present");
		}
	}

}
