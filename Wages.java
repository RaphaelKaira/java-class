package net.javacode;
import java.util.Scanner;

public class Wages {

	public static void main(String[] args) {
		
		Scanner regNo= new Scanner(System.in);
		Scanner payrate= new Scanner(System.in);
		Scanner hoursWorked= new Scanner(System.in);
		
		double rate;
		double hours;
		String reg;
		double total;

		System.out.println("Wage calculator");
		System.out.println("--------------------");
		
		System.out.print("Enter Registration Number:");
		reg =regNo.nextLine();
		
		System.out.print("Enter hourly pay rate:");
		rate =payrate.nextInt();
		
		System.out.print("Enter hours worked:" );
		hours = hoursWorked.nextInt();
		
		total = rate* hours;
		
		
		System.out.println("\nWage Details:\t" + reg);
		System.out.println("Hourly Pay Rate:\t\t $" + rate);
		System.out.println("Hours Worked:\t\t\t " + hours);
		System.out.println("Total Wages:\t\t\t $" + total );

	}

}
