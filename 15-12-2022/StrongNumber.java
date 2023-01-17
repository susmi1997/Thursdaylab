package Basic;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int n,str=0;
		int i=num;
		
		while(i!=0) {			
		n=i%10;
		i=i/10;
		str=str+fact(n);
		}
    
		System.out.println(str);
		if(num==str)
    {
			System.out.println("This is a strong number");			
		}
		else
    {
			System.out.println("This is not a strong number");
		}		
		sc.close();		
	}	
	public static int fact(int a) {
		;
		for(int i=a-1;i>=1;i--) {
			a=a*i;
		}
		return a;
	}

}

