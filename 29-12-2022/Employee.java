package oop;

import java.util.Scanner;

class EmpDetail{
	int empId;
	String empName;
	int basicSalary;
	String designation;
	int joinYear;
	float appraisal;
	int ta;
	float totalSal;


	public void setData() // getting user input of employee details
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID: ");
		empId=sc.nextInt();
		System.out.println("Enter your name: ");
		empName=sc.next();
		System.out.println("Enter your basic salary: ");
		basicSalary=sc.nextInt();
		System.out.println("Enter your basic designation: ");
		designation=sc.next();
		System.out.println("Enter your year of joining: ");
		joinYear=sc.nextInt();
	}
	public void getAppraisal() //to calculate if the employee is eligible for appraisal or not
	{
		if((2022-joinYear)>=1) {
			appraisal=(basicSalary*(float)10/100);
			System.out.println("Your appraisal is: "+appraisal);

		}
		else
			System.out.println("Not eligible for appraisal");
		System.out.println("Your salary is: "+basicSalary);
	}
	public void calculateTA()//to calculate travels allowance of the employee
	{
		if(designation.equals("manager")) {
			 ta=3000;
			 System.out.println("Your TA is: "+ta);
			 }

		else {
			ta=1000;
			System.out.println("Your TA is: "+ta);
			}

	}
	public void totalSal()//to calculate total salary of the employee
	{
		totalSal=basicSalary+appraisal+ta;
		System.out.println("Your total salary is: "+totalSal);
	}

}

public class Employee {

	public static void main(String[] args) {
		 EmpDetail emp1=new EmpDetail();//creating object of EmpDetails class
		 emp1.setData();
		 emp1.getAppraisal();
		 emp1.calculateTA();
		 emp1.totalSal();

	}

}
