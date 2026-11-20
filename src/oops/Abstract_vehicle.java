package oops;
abstract class vehicle
{
	abstract void start();
	void stop()
	{
		System.out.println("This vehicle can stop");
	}
}
class car extends vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("This car start at 12:00");
		
	}
	
}
class bike extends vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("This bike start st 12:13");
		
	}
	
}
public class Abstract_vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b=new bike();
		b.start();
		b.stop();
		car c=new car();
		c.start();
		c.stop();

	}

}
