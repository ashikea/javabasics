package iterative_statement_or_looping_statement;

public class Revese_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int rev=0,r;
		while(n>0)
		{
		r=n%10;//12345%10=5 1234%10=4 123%10=3
		rev=rev*10+r;//0=0+5 5=5*10+4=54
		n=n/10;//12345 removed last digit 6
		}
		System.out.println(rev);
	}
	

}
