package string_method;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="Seleinum webdriver is used for webapplication testing";

		
		String a[]=s3.split(" ");
		
//		for(String i:a)
//		{
//			System.out.println(i);
//		}
		
		for(String j:a)
		{
			boolean check=j.contains("webapplication");
			System.out.println(j);
			if(check==true)
			{
				break;
			}
		}

	}

}
