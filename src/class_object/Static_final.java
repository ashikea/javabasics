package class_object;

class SchoolDetails{
	final String schoolname="Luminar";
	static String department="Software testing";
	
}
public class Static_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SchoolDetails.department);
		System.out.println(SchoolDetails.department="Django developer");
		System.out.println(SchoolDetails.department);
//		System.out.println(Schooldetails.);
		
		SchoolDetails sf=new SchoolDetails();
		
		System.out.println(sf.schoolname);
//		System.out.println(sf.schoolname="abc");

	}

}
