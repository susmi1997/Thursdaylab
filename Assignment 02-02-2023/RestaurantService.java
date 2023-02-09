package Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RestaurantService {
	static Scanner sc=new Scanner(System.in);
	
	static List<Order> order=(List<Order>) Arrays.asList(new Order(1, "Biriyani", 200), new Order(2,"Chinese ",250));
	static ArrayList<Order> arr=new ArrayList<>();
	
	
	public static void printMenu()
	{
		for(Order o:order)
			System.out.println(o.getOrderId()+"."+"\t"+o.getOrderName()+"\t"+o.getPrice());
	}
	
	public static void getOrder()
	{
		int i,id;		
		System.out.println("Enter the food ID: ");
		id=sc.nextInt();
		for(Order o:order)
		{
			if(o.getOrderId()==id)
			{
				System.out.println(o.getOrderName());
				String name=o.getOrderName();
				System.out.println("Enter the quantity: ");
				int quantity=sc.nextInt();
				double price1=o.getPrice();
				double totalInd=quantity*price1;
				
				arr.add(new Order(quantity, price1, totalInd, name));			
				
			}
			
		}
		
	}
	
	public static void decision()
	{
		while(true) {
		System.out.println("Do you want to order?(y/n)");
		char ch=sc.next().charAt(0);
		if(ch=='y')
			getOrder();
		else
			bill();}
		
	}
	
	public static void bill()
	{
		double total=0;
		
		for(Order o:arr)
		{
			System.out.println(o.name+"\t"+o.quantity+"\t"+o.totalInd);
		}
		for(Order o:arr)
		{
			total=total+o.totalInd;
		}
		System.out.println("Total: "+total);
		
		
		
		
		
	}
}
