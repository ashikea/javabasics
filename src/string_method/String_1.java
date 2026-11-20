package string_method;

public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		string s="arc"-String literal
//		string s=new string("arc")-by new keyword
		
		String a="Luminar";
		String b="  technolab";
		
		System.out.println(a.concat(b));//to join two string
		
		System.out.println(a+1+2);//join word with number
		System.out.println(1+2+a);//add the number and join with the word
		
		System.out.println(a.length());//to see length
		System.out.println(a.toUpperCase());//to capitalize
		System.out.println(a.toLowerCase());//to make small letter
		
		System.out.println(a.startsWith("m"));//to check it starts with "m" and gives result t/f
		System.out.println(a.endsWith("r"));//to check it ends with the charter"r" and gives t/f
		
		System.out.println(a.contains("n"));//to check weather it have the word
		System.out.println(a.replace("nar", "ny"));//to replace the word
		
		System.out.println(a.charAt(5));//to give the character in that index value
		
		System.out.println(b);
		System.out.println(b.trim());//remove the space
		
		//sub string
		
		String y="welcome";
		System.out.println(y.substring(3));//give out start with index=3
		System.out.println(y.substring(0,4));//give out start with index =0 upto 4
		
		String s1="ABC";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String x="welcome to thrissure";
		String arr[]=x.split(" ");//gives the one by one word
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		char r[]=y.toCharArray();
		for(char j:r)
		{
			System.out.println(j);
		}
		
		

	}

}
