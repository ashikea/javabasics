package Task;

public class Fibannaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1;
		System.out.println("Fibonnaccci series upto 10");
		for(int i=0;i<=10;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
