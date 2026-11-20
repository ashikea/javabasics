package practice;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=19;
			System.out.println(i/0);
		}
		catch(Exception e)
		{
//			System.out.println("Arithematic expression");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is final");
		}
	}

}
