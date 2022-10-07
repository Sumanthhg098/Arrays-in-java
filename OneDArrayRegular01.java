// 1D regular Array approach using float data type 
import java.util.Scanner;

public class OneDArrayRegular01 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int m = a.nextInt();
		float arr[]=new float[m];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the "+(i+1)+" row value :");
			arr[i]=a.nextFloat();
		}
		System.out.println(" the elements in arrays are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		a.close();
	}
}
//Enter the Row Size
//3
//Enter the 1 row value :
//5.5
//Enter the 2 row value :
//3.3
//Enter the 3 row value :
//2.2
// the elements in arrays are : 
//5.5 3.3 2.2 