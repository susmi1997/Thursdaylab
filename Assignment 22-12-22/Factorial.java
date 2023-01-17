package Basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i=sc.nextInt();
		
		if(i==0) {
			System.out.println("factorial is: "+1);
			
		}
		else
		{
			for(int j=i-1;j>=1;j--) {
				i= i*j;
			}
			System.out.println("factorial is: "+i);
		}
		sc.close();
		

	}

}
