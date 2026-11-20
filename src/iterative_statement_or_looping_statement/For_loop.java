package iterative_statement_or_looping_statement;

public class For_loop {

	public static void main(String[] args) {
		
		//1.for loop :-Entry controlled
		
//		for(int i=1;i<10;i++)
//		{
//			System.out.println("Ashik E A");
//		}
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=1;i<=10;i++)
//		{
//			int j=5;
//			int k=i*j;
//			System.out.println(+i+"*"+j+"="+k);
//		}

//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			sum=sum+i;
//		}
//		System.out.println(sum);
		
		//2.while  :-Entry controlled
		
//		int i=1;
//		while(i<=10)
//		{
//		System.out.println(i);
//		i++;
//		}
		
//		int i=1;
//		while(i<10)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//3.do while :- exit controlled
//		int i=1;
//		do
//		{
//			System.out.println(i);
//			i++;
//		}
//		while(i<=10);
		
		int i=1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i<10);
	}

}
