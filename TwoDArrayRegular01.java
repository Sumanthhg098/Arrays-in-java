import java.util.Scanner;
public class TwoDArrayRegular01 
{
	public static void main(String[] args) 
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the row size : ");
		int m=abc.nextInt();
		System.out.println("enter the coloum size : ");
		int n =abc.nextInt();
		int arr[][]= new int[m][n];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the "+(i+1)+" row "+(j+1)+" coloum value : ");
				arr[i][j]=abc.nextInt();
			}
		}
		System.out.println("the values present in the array are : ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		abc.close();
	}
}
//******************************************************************************
//enter the row size : 
//3
//enter the coloum size : 
//2
//enter the 1 row 1 coloum value : 
//1
//enter the 1 row 2 coloum value : 
//2
//enter the 2 row 1 coloum value : 
//3
//enter the 2 row 2 coloum value : 
//4
//enter the 3 row 1 coloum value : 
//5
//enter the 3 row 2 coloum value : 
//6
//the values present in the array are : 
//1 2 
//3 4 
//5 6 
