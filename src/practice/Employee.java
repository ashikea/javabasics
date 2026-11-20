package practice;

public class Employee {
	
	int Employee_id;
	String name;
	int age;
	String Division;
	
	void display()
	{
		System.out.println(Employee_id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(Division);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.Employee_id=101;
		e.name="Ashik";
		e.age=24;
		e.Division="B1";
		e.display();

	}

}
