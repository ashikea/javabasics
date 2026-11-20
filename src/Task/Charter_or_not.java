package Task;

public class Charter_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean count = false;
		String s1="ashik@!@";
		String s2="ashik";
		String al="qwertyuiopsdfghjklzxcvbnm";
		char c[]=s1.toCharArray();
		char d[]=al.toCharArray();
		for(char i:c)
		{
			for(char j:d)
			{
				if(i==j)
				{
					count=true;
					break;
				}
				else
				{
					count=false;
				}
			}
		}
		if(count==true)
		{
			System.out.println("It is  charater type");
		}
		else
		{
			System.out.println("It is contains special character type");
		}
		
		
		

	}

}
