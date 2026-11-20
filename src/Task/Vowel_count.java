package Task;

public class Vowel_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String n="aeroplane";
		String v="aeiou";
		char o[]=v.toCharArray();
		char c[]=n.toCharArray();
		for(char i:c)
		{
			for(char j:o)
			{
				if(i==j)
				{
					count++;
				}
		
			}
			
		}
		System.out.println("Total no.of vowels is : "+count);

	}

}
