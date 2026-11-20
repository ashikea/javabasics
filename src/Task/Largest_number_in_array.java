package Task;

public class Largest_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,7,9,4,5};
		
		int largest=a[0];
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("The largest number in array is : "+largest);

	}

}
