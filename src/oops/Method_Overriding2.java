package oops;


class Parent
{
	String name="Abc";
	void phone()
	{
		
		System.out.println("Nokia");
	}
}
class Child extends Parent
{
	void phone()
	{
		System.out.println("Iphone");
		System.out.println(super.name);
		super.phone();
		
	}
}
public class Method_Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.phone();

	}

}
