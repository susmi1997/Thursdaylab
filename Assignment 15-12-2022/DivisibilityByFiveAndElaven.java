package Basic;

import java.util.Scanner;

public class DivisibilityByFiveAndElaven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i=sc.nextInt();
		if(i%5==0 && i%11==0)
		{
			System.out.println("Number is divisible by both 5 and 11");
		}
		else
		{
			System.out.println("Number is not divisible by both 5 and 11");
		}
		sc.close();
	}


}
