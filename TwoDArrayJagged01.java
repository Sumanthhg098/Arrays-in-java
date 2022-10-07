import java.util.Scanner;

public class TwoDArrayJagged01 
{
	public static void main(String[] args)
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the row size : ");
		int m=abc.nextInt();
		int arr[][]= new int[m][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the "+(i+1)+"row colum size");
			int n=abc.nextInt();
			arr[i]= new int[n];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the "+(i+1)+" row "+(j+1)+" colum value : ");
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
//****************************************************************************
//enter the row size : 
//3
//enter the 1row colum size
//2
//enter the 2row colum size
//3
//enter the 3row colum size
//1
//enter the 1 row 1 colum value : 
//1
//enter the 1 row 2 colum value : 
//2
//enter the 2 row 1 colum value : 
//3
//enter the 2 row 2 colum value : 
//4
//enter the 2 row 3 colum value : 
//5
//enter the 3 row 1 colum value : 
//6
//the values present in the array are : 
//1 2 
//3 4 5 
//6 
