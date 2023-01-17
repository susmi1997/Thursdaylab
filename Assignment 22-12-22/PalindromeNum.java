package Basic;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;		
			
		}
		
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");			

	}

}
