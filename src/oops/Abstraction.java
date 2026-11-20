package oops;

abstract class Phone
{
	abstract void camera();//abstract class
	public void call()//non abstract class
	{
		System.out.println("You are calling same specification ");
	}
}
class Iphone extends Phone  //place the cusor and select unimplemented method click it
{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("Iphone");
		System.out.println("The camera is 48MP telephoto ");
		
	}
	
}





class Samsung extends Phone
{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("samsung");
		System.out.println("The camera is 200MP telephoto");
		
	}
	
}




public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone i=new Iphone();
		i.camera();
		i.call();
		Samsung s=new Samsung();
		s.camera();
		s.call();
		

	}

}
