package oops;

abstract class shape
{
	abstract void area();
}

class circle extends shape
{

	@Override
	void area() {
		// TODO Auto-generated method stub
		int a=10;
		int area=a*a;
		System.out.println("area of sqare"+a+"*"+a+"="+area);
		
	}
	
}
class rectangle extends shape
{

	@Override
	void area() {
		// TODO Auto-generated method stub
		int l=12;
		int b=3;
		int area=l*b;
		System.out.println("Area of rectangle is "+l+"*"+b+"="+area);
		
	}
	
}
public class Abstract_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.area();
		circle s=new circle();
		s.area();

	}

}
