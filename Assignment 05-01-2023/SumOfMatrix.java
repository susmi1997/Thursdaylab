package Array;

import java.util.Scanner;

public class SumOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the coloumns: ");
		int col=sc.nextInt();
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		int res[][]=new int[row][col];
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat1[i][j]=++count;
			}
		}
		count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat2[i][j]=++count;
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
