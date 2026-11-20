package oops;


public class Method_Overloading {

	public void add(int a,double b)
	{
		double value=a+b;
		System.out.println(value);
	}
	public void add(double a,int b,int c)
	{
		double value=a+b+c;
		System.out.println(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading m=new Method_Overloading();
		m.add(2, 3);
		m.add(3.2, 4, 6);

	}

}
