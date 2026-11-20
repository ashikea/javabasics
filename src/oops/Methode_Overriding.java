package oops;

class A
{
	void m1()
	{
		int a=10;
		System.out.println(a);
	}
}
class B extends A
{
	void m1()
	{
		int b=20;
		System.out.println(b);
//		super.m1(); /*using supper it give opt of class a*/
	}
}
public class Methode_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.m1();

	}

}
