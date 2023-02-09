package Restaurant;

import java.util.Scanner;

public class RestaurantService {
	static Scanner sc=new Scanner(System.in);
	
	static Order order[]= {new Order(1,"Biriyani combo",200),new Order(2,"Chinese combo",350)};
	static Order food[]=new Order[10];
	static int index=0;
	
	public static void printMenu()
	{
		for(int i=0;i<order.length;i++)
		{
			System.out.println(order[i].getOrderId()+"."+order[i].getOrderName()+"\t"+order[i].getPrice());
		}
	}
	
	public static void getOrder()
	{
		int i,id;		
		System.out.println("Enter the food ID: ");
		id=sc.nextInt();
		for(i=0;i<order.length;i++)
		{
			if(order[i].getOrderId()==id)
			{
				System.out.println(order[i].getOrderName());
				String name=order[i].getOrderName();
				System.out.println("Enter the quantity: ");
				int quantity=sc.nextInt();
				double price1=order[i].getPrice();
				double totalInd=quantity*price1;
				food[index]=new Order(quantity, price1, totalInd, name);
				index++;
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
		for(int i=0;i<index;i++)
		{
			System.out.println(food[i].name+"\t "+"Qt. "+food[i].quantity+"\t"+food[i].totalInd);
			
		}
		for(int i=0;i<index;i++)
		{
			total=total+food[i].totalInd;
		}
		System.out.println("Total: "+total);
		
		
	}
}
