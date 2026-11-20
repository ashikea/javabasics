package Task;

interface basicalanimal 
{
	void cat();
	void sleep();
}


class monkey
{
	void jump()
	{
		System.out.println("Monkey will jump");
	}
	void bite()
	{
		System.out.println("Monkey will bite");
	}
}

class human extends monkey implements basicalanimal
{

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("The cat ");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("the sleep");
		
	}
	public void speak()
	{
		System.out.println("The speak");
	}
	
}

public class Interface_Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h=new human();
		h.cat();
		h.sleep();
		h.speak();
		h.jump();
		h.bite();
	}

}
