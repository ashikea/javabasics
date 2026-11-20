package oops;

interface Bank1
{
	abstract void Accountdetails1();
	abstract void Savingdetails1();
}
interface Bank2
{
	abstract void Accountdetails2();
	abstract void Savingdetails2();
}

class Icic implements Bank1,Bank2
{

	@Override
	public void Accountdetails2() {
		// TODO Auto-generated method stub
		System.out.println("Bank1 Account info");
		
	}

	@Override
	public void Savingdetails2() {
		// TODO Auto-generated method stub
		System.out.println("Bank2 Savings");
		
	}

	@Override
	public void Accountdetails1() {
		// TODO Auto-generated method stub
		System.out.println("Bank2 Account info");
		
	}

	@Override
	public void Savingdetails1() {
		// TODO Auto-generated method stub
		System.out.println("Bank2 Saving ");
		
	}
	
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icic i=new Icic();
		i.Accountdetails1();
		i.Savingdetails1();
		i.Accountdetails2();
		i.Savingdetails2();
		

	}

}
