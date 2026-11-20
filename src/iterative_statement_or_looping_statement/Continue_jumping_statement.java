package iterative_statement_or_looping_statement;

public class Continue_jumping_statement {
	public static void main(String [] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
