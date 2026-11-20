package exception_handeling;

public class Exception_pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started");
		try
		{
			int i=10;
			System.out.println(i/0);
		}
		catch(Exception e)
		{
			System.out.println("Arithematic exception");
//			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is finally");
		}
		System.out.println("stopped");

	}

}
