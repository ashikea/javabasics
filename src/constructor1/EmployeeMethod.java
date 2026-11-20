package constructor1;

public class EmployeeMethod {
	
	int empid;
	int salary;
	String designation;
	
//	public void setvalues(int empid,int salary,String designation)
//	{
//		this.empid=empid;
//		this.salary=salary;
//		this.designation=designation;
//	}
	
	public void setvalues(int id,int sal,String des)
	{
		empid=id;
		salary=sal;
		designation=des;
	}
	
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(designation);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeMethod emp=new EmployeeMethod();
		emp.setvalues(1, 10000, "BCA");
		emp.display();
	}

}
