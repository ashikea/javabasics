package method_argument2;

public class Circle_with_parameter_with_return {
	
	
	
	public double circle(double r)
	{
		double a=3.14*r*r;
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle_with_parameter_with_return c=new Circle_with_parameter_with_return();
		System.out.println(c.circle(5));
		

	}

}
