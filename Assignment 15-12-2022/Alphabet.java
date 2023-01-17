package Basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter a char: ");
		
		c=sc.next().charAt(0);
		
		if((c>='a'&&c<='z')||(c>='A'&& c<='Z'))
		{
			System.out.println("alphabet");
		}
		else
		{
			System.out.println(c + " is not an alphabet");
		}
		sc.close();
		
	}

}
