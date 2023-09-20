package net.javacode;
import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		Scanner serialNo1= new Scanner(System.in);
		Scanner serialNo2= new Scanner(System.in);
		Scanner serialNo3= new Scanner(System.in);
		Scanner studentName1= new Scanner(System.in);
		Scanner studentName2= new Scanner(System.in);
		Scanner studentName3= new Scanner(System.in);

		Scanner sub1= new Scanner(System.in);
		Scanner sub2= new Scanner(System.in);
		Scanner sub3= new Scanner(System.in);
		Scanner sub4= new Scanner(System.in);
		Scanner sub5= new Scanner(System.in);
		Scanner sub6= new Scanner(System.in);
		Scanner sub7= new Scanner(System.in);
		Scanner sub8= new Scanner(System.in);
		Scanner sub9= new Scanner(System.in);
		Scanner sub10= new Scanner(System.in);
		Scanner sub11= new Scanner(System.in);
		Scanner sub12= new Scanner(System.in);
		Scanner sub13= new Scanner(System.in);
		Scanner sub14= new Scanner(System.in);
		Scanner sub15= new Scanner(System.in);
		
		int serial1;
		int serial2;
		int serial3;
		
		String name1;
		String name2;
		String name3;
		
		int subValue1;
		int subValue2;
		int subValue3;
		int subValue4;
		int subValue5;
		
		int subValue6;
		int subValue7;
		int subValue8;
		int subValue9;
		int subValue10;
		
		int subValue11;
		int subValue12;
		int subValue13;
		int subValue14;
		int subValue15;
		
		int total1;
		int total2;
		int total3;
		
		int average1;
		int average2;
		int average3;
		
		int unitAverage1;
		int unitAverage2;
		int unitAverage3;
		int unitAverage4;
		int unitAverage5;
		
		
		System.out.print("Enter serial no: ");
		serial1= serialNo1.nextInt();
		System.out.print("Enter student name: ");
		name1= studentName1.nextLine();
		System.out.println("Enter  5 value");
		subValue1= sub1.nextInt();
		subValue2= sub2.nextInt();
		subValue3= sub3.nextInt();
		subValue4= sub4.nextInt();
		subValue5= sub5.nextInt();
		total1  = subValue1+subValue2+subValue3+subValue4+subValue5 ;
		average1 = total1/5;
		
		System.out.print("Enter serial no: ");
		serial2= serialNo2.nextInt();
		System.out.print("Enter student name: ");
		name2= studentName2.nextLine();
		System.out.println("Enter  5 value");
		subValue6= sub6.nextInt();
		subValue7= sub7.nextInt();
		subValue8= sub8.nextInt();
		subValue9= sub9.nextInt();
		subValue10= sub10.nextInt();
		total2  = subValue6+subValue7+subValue8+subValue9+subValue10 ;
		average2 = total2/5;
		
		System.out.print("Enter serial no: ");
		serial3= serialNo3.nextInt();
		System.out.print("Enter student name: ");
		name3= studentName3.nextLine();
		System.out.println("Enter  5 value");
		subValue11= sub11.nextInt();
		subValue12= sub12.nextInt();
		subValue13= sub13.nextInt();
		subValue14= sub14.nextInt();
		subValue15= sub15.nextInt();
		total3  = subValue11+subValue12+subValue13+subValue14+subValue15 ;
		average3 = total3/5;
		unitAverage1 = subValue1 +subValue6+subValue11;
		unitAverage2 = subValue2 +subValue7+subValue12;
		unitAverage3 = subValue3 +subValue8+subValue13;
		unitAverage4 = subValue4 +subValue9+subValue14;
		unitAverage5 = subValue5 +subValue10+subValue15;
		
		
		System.out.println("Welcome to student Mark list Application");
		System.out.println("________________________________________________________________________________________________________________");
		System.out.println("SNo\tStudent\tName\t\tSub1\tsub2\tsub3\tsub4\tsub5\tTotal\tAverage");
		System.out.println("_________________________________________________________________________________________________________________");
		System.out.println( serial1+"\t"+ name1 + "\t\t\t"+ subValue1+"\t"+subValue2+"\t"+subValue3+"\t"+subValue4+"\t"+subValue5+"\t"+total1+"\t"+average1);
		System.out.println( serial2+"\t"+ name2 + "\t\t\t"+ subValue6+"\t"+subValue7+"\t"+subValue8+"\t"+subValue9+"\t"+subValue10+"\t"+total2+"\t"+average2);
		System.out.println( serial3+"\t"+ name3 + "\t\t\t"+ subValue11+"\t"+subValue12+"\t"+subValue13+"\t"+subValue14+"\t"+subValue15+"\t"+total3+"\t"+average3);
		System.out.println( "\t\t\t\t"+unitAverage1+"\t"+unitAverage2+"\t"+unitAverage3+"\t"+unitAverage4+"\t"+unitAverage5);

		System.out.println("_________________________________________________________________________________________________________________");
		
	}

}
