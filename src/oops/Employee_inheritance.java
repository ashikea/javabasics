package oops;


class Member
{
	String name;
	int age;
	String Address;
	int Salary;
	
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(Address);
		System.out.println(Salary);
	}
}

class Worker extends Member
{
	String specialization;
	
}

class Manager extends Member
{
	String department;
}

public class Employee_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w=new Worker();
		w.name="Ashik";
		w.age=24;
		w.Address="Kunnamkulam,Thrissur";
		w.Salary=300000;
		w.specialization="Software testing";
		w.printdetails();
		System.out.println(w.specialization);
		
		Manager m=new Manager();
		m.name="hari";
		m.age=34;
		m.Address="thrissur";
		m.Salary=40000;
		m.department="MBA";
		m.printdetails();
		System.out.println(m.department);

	}

}
