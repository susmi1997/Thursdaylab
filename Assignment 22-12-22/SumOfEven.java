package Basic;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int range=sc.nextInt();
		int sum=0;
		for(int i=0;i<=range;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		

	}

}
