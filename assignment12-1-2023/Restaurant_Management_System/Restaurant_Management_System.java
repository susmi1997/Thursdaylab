package Restaurant;

import java.util.Scanner;

public class RestaurantManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RestaurantService rs=new RestaurantService();
		RestaurantService.printMenu();
		RestaurantService.getOrder();
		RestaurantService.decision();
		

	}	

}
