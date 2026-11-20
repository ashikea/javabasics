package practice;


class Employee2
{
	int no;
	String name;
	int age;
	String course;
	Employee2(int no,String name,int age,String course)
	{
		this.no=no;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public void display()
	{
		System.out.println(no);
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
	}
}

public class Parametrized_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e=new Employee2(101,"Ashik",21,"BCA");
		e.display();
		
	}

}
