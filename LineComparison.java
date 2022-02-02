package com.Bridgelabz.OOPsConcept;
import java.util.Scanner;

public class LineComparison{
	
	public static void main (String[] args){
			
		LineComparison line = new LineComparison();
		line.lineComparison();
	}
	public int lineComparison() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of point1(x1,y1) :  ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("Enter the value of point2(x2,y2) :  ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.print("Enter the value of point3(x3,y3) :  ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.print("Enter the value of point4(x4,y4) :  ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		double line1Length, line2Length;

		line1Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("line1 length:" + line1Length);
		line2Length = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("line2 length:" + line2Length);
		if( Double.compare(line1Length,line2Length) == 0 )
			System.out.println("Both lines are equal");
		else if( Double.compare(line1Length,line2Length) < 0 )
			System.out.println("lines2 is greater");
		else
			System.out.println("line1 is greater");
		return 0;
	}
}
