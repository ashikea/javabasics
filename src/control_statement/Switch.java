package control_statement;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=1;
		switch(ch)
		{
		case 1:
			System.out.println("Good");
			break;
		case 2:
			System.out.println("average");
			break;
		case 3:
			System.out.println("below average");
			break;
		case 4:
			System.out.println("bad");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
