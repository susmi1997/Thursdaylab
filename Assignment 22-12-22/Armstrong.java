package Basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		int temp=num;
		int origin=num;
		int count=0;
		int result=0;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		for(int i=0;i<count;i++)
		{
			int rem=temp%10;
			result=result+(int)Math.pow(rem, count);
			temp=temp/10;
		}
		
		if(origin==result) 
		
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");


	}

}
