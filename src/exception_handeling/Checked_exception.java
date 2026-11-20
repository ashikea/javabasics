package exception_handeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_exception {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("E://Data.xlsx");
		System.out.println("Started");
		Thread.sleep(5000);
		System.out.println("Stopped");

	}

}
