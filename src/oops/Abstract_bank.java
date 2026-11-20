package oops;

abstract class bankaccount
{
	abstract void calculateinterst();
}

class Savings_Account extends bankaccount {

	@Override
	void calculateinterst() {
		// TODO Auto-generated method stub
		int p = 10000;
		int r = 9;
		int t = 12;
		int si=p*r*t;
		System.out.println(si);
		
	}
	
}

class current_Account extends bankaccount
{

	@Override
	void calculateinterst() {
		// TODO Auto-generated method stub
		int p = 20000;
		int r = 9;
		int t = 12;
		int si=p*r*t;
		System.out.println(si);
		
	}
	
}



public class Abstract_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		current_Account ca=new current_Account();
		ca.calculateinterst();
		Savings_Account sa=new Savings_Account();
		sa.calculateinterst();
	}

}
