package Array;

import java.util.Scanner;

public class Rat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter r: ");//total number of rats
		int r=sc.nextInt();
		System.out.println("enter unit: ");//unit of food consumed by each rat
		int unit=sc.nextInt();
		System.out.println("enter n: ");

		int n=sc.nextInt();
		int arr[]=new int[n];//array containing food  
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("======");
		int total_con=r*unit;//total consumption of all rats 
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum>=total_con) //when sum exceeds total consumption it will print the number of house which can fulfill the total consumption
			{
				System.out.println(i+1);
				break;
			}
			else if(i==n) //if after traversing the whole array, sum remains less than total consumption it will print 0
			{
				if(sum<total_con)
				System.out.println(0);
			}
			
		}

	}

}
