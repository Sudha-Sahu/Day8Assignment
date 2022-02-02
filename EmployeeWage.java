package com.Bridgelabz.OOPsConcept;

public class EmployeeWage{

	public final int PARTTIME = 1;
	public final int FULLTIME = 2;
	public final int EMPRATEPERHR=20;
	public final int MAXWORKINGDAYS=20;
	public final int MAXWORKINGHRS=100;
	
	public static void main(String args[])
	{
		EmployeeWage emp = new EmployeeWage();
		emp.employeeWage();
		
	}
	public int employeeWage() {
		
		int empHrs=0;
		int noOfDays=0;
		int noOfHrs=0;
		while(noOfDays < MAXWORKINGDAYS && noOfHrs <= MAXWORKINGHRS) {

			int empCheck =(int) Math.floor (Math.random() * 10) % 3;
			switch (empCheck) {
			case PARTTIME:
				empHrs=4;
				break;
			case FULLTIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			noOfHrs=noOfHrs+empHrs;
			noOfDays++;
			System.out.println("Total Days: "+noOfDays +"  Total no. of hrs: "+ noOfHrs);
		}
		int empWageforMonth = noOfHrs * EMPRATEPERHR;
		System.out.println("total EmpWage for month: "+ empWageforMonth);
		return 0;
	}
		
}