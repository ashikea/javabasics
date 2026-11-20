package oops;

class Car
{
	void speed()
	{
		System.out.println("BMW POWER_________--------");
	}
	void power()
	{
		System.out.println("Power*******");
	}
}

class Bmw extends Car
{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Sportzzz");
		super.speed();
	}

	@Override
	void power() {
		// TODO Auto-generated method stub
		System.out.println("Engine");
		super.power();
	}
	
}
public class Method_Overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw c=new Bmw();
		c.speed();
		c.power();

	}

}
