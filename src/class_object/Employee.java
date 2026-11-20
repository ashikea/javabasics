package class_object;

public class Employee {
	
	int empid;
	String name;
	int age;
	String division;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(age);
		System.out.println(division);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.empid=1;
		e.name="Ashik";
		e.age=24;
		e.division="MCA";
		e.display();

	}

}
