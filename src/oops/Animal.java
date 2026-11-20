package oops;


//class Dog
//{
//	public void barking()
//	{
//		System.out.println("The dog is barking ");
//	}
//}
//
//class Cat extends Dog
//{
//	public void sleeping()
//	{
//		System.out.println("The cat is sleeping");  /*Single Inheritance*/
//	}
//}
//
//class Lion extends Cat
//{
//	public void roar()
//	{
//		System.out.println("The lion is roaring");
//	}
//}
/*multilevel inheritance*/
class Dog
{
	public void type()
	{
		System.out.println("It is labour dog");
	}
}
class Feature1 extends Dog
{
	public void color()
	{
		System.out.println("It is Ivory");
	}
}
class Feature2 extends Dog
{
	public void weight()
	{
		System.out.println("It is 37 kg");
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*single inheritance*/
//		Lion l=new Lion();
//		l.barking(); 
//		l.sleeping();
//		l.roar();
		
		/*multilevel inheritance*/
		
		Feature1 f1=new Feature1();
		f1.type();
		f1.color();
		
		Feature2 f2=new Feature2();
		f2.type();
		f2.weight();
		

	}

}
