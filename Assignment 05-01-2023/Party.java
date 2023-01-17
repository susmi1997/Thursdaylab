package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of T: ");
		int t=sc.nextInt();
		int entry[]=new int[t]; //array containing number of entries in a given time
		int exit[]=new int[t];  //array containing number of exits in a given time
		int temp[]=new int[t+1];//temporary array to store entry-exit in a particular time
		System.out.println("enter number of entries in time "+t);
		for(int i=0;i<5;i++)
			entry[i]=sc.nextInt();
		System.out.println("enter number of exits in time "+t);
		for(int i=0;i<5;i++)
			exit[i]=sc.nextInt();
		
		System.out.println("Max number of guest within "+t+" hour");
		
		for(int i=0;i<t;i++)
		{
			temp[i+1]=temp[i]+entry[i]-exit[i];
		}
//		for(int i=0;i<t+1;i++)
//		{
//			System.out.println(temp[i]);
//		}
		
		Arrays.sort(temp);
		System.out.println(temp[t]);
		
		

	}

}
