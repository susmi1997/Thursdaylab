package Basic;

import java.util.Scanner;

public class Alphabet_Digit_Or_SpclChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c=sc.next().charAt(0);
		
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(c>='0'&&c<='9')
		{
			System.out.println("digit");
		}
		else
			System.out.println("Special Character");		
		

	}

}
