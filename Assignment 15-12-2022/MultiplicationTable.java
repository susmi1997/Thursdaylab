package Basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
	
		
		int i=sc.nextInt();
		
		for(int j=1;j<=9;j++)
		{
			System.out.println(i+"*"+j+"="+i*j);
		}
		sc.close();
	}

}
