// 1D regular Array approach using String data type 
import java.util.Scanner;

public class OneDArrayRegular02
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int m = a.nextInt();
		String arr[]=new String[m];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the "+(i+1)+" row value :");
			arr[i]=a.nextLine();
		}
		System.out.println(" the elements in arrays are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		a.close();
	}
}
