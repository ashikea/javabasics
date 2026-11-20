package constructor1;

public class EmployeeConstructor {
	
	int empid;
	int salary;
	String designation;
	
//	public EmployeeConstructor(int empid,int salary,String designation)
//	{
//		this.empid=empid;
//		this.salary=salary;
//		this.designation=designation;
//	}
	
//	public void display()
//	{
//		System.out.println(empid);
//		System.out.println(salary);
//		System.out.println(designation);
//	}
	
	public EmployeeConstructor()
	{
		empid=1;
		salary=20000;
		designation="QA";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EmployeeConstructor emp=new EmployeeConstructor(1,10000,"QA");
		EmployeeConstructor emp=new EmployeeConstructor();
//		emp.display();
		System.out.println(emp.empid);
		System.out.println(emp.salary);
		System.out.println(emp.designation);
		

	}

}
