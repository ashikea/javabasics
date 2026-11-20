package oops;


public class Method_Overloading2 {
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading2 m=new Method_Overloading2();
		m.add();
		m.add(20, 30);
		m.add(20, 30, 40);

	}

}
