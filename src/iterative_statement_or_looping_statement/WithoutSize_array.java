package iterative_statement_or_looping_statement;

public class WithoutSize_array {

	public static void main(String[] args) {
		
		//one dimentional
//		int a[]= {2,3,1,4,6,5};
//		for(int i=0;i<6;i++)
//		{
//			System.out.println(a[i]);
//		}

		//Two dimentional
		int a[][]= {{1,2},{2,1},{3,1}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
