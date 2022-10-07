// 1D regular Array approach using Integer data type 
import java.util.Scanner;
public class OneDArrayRegular03 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int m = a.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the "+(i+1)+" row value :");
			arr[i]=a.nextInt();
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
//4
//Enter the 1 row value :
//1
//Enter the 2 row value :
//2
//Enter the 3 row value :
//3
//Enter the 4 row value :
//4
//the elements in arrays are : 
//1 2 3 4