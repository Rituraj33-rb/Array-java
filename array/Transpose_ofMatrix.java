package array;

import java.util.Scanner;

public class Transpose_ofMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows & colums in the 1st matrix=");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		
		System.out.println("Enter the values of the matrix");
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
		}
		int b[][]=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("transpose matrix is....");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
sc.close();

	}

}
