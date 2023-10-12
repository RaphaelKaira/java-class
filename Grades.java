package net.javacode;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner names= new Scanner(System.in);
		Scanner rollNo= new Scanner(System.in);
		Scanner mark= new Scanner(System.in);
		
		String[] name = new String[4];
		int[] roll = new int[4];
		int[][] marks = new int[4][3];
		int[] total = new int[4];
		float[] average = new float[4];
		
		String grade = "";
		String hasPassed ="";
		
		
		
		for( int i=0; i<4; i++) {
			System.out.println("Enter the student Roll No:");
			roll[i] = rollNo.nextInt();
			
			System.out.println("Enter the student Name:");
			name[i] = names.nextLine();
			
			System.out.println("Enter marks for " + name[i]);
			for (int j= 0; j<3 ; j++) {
				marks[i][j] = mark.nextInt();
				total[i] +=  marks[i][j];
				
				if(marks[i][j] < 50) {
					hasPassed="F";
				}else {
					hasPassed="P";
				}
				}
			average[i] = total[i]/3;
			System.out.println("The total is " + total[i]);
		}
		
		for (int k =0; k<4; k++) {
		if (average[k] <= 100 && average[k] >= 70 ) {
			grade = "A";
		}else if(average[k] < 70 && average[k] >= 50 ) {
			grade ="B";
		}else if(average[k] > 50) {
			grade = "C";
		}else{
			System.out.println("Wrong average value");
		}
		}
		
		
		
		System.out.println("*******************************************************************");
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println("*******************************************************************");
		System.out.println("Roll\tName\tMark1\tMark2\tMark3\tTotal\tResult\tAverage\tGrade");
	
		System.out.println(roll[0]+"\t" + name[0] +"\t"+ marks[0][0] +"\t"+ marks[0][1] +"\t" +marks[0][2] +"\t"+ total[0] +"\t" + hasPassed +"\t" +average[0] +"\t" +grade);
		System.out.println(roll[1]+"\t" + name[1] +"\t"+ marks[1][0] +"\t"+ marks[1][1] +"\t" +marks[1][2] +"\t"+ total[1] +"\t" + hasPassed +"\t" + average[1] +"\t" +grade);
		System.out.println(roll[2]+"\t" + name[2] +"\t"+ marks[2][0] +"\t"+ marks[2][1] +"\t" +marks[2][2] +"\t"+ total[2] + "\t" + hasPassed +"\t" + average[2] +"\t" +grade);
		System.out.println(roll[3]+"\t" + name[3] +"\t"+ marks[3][0] +"\t"+ marks[3][1] +"\t" +marks[3][2] +"\t"+ total[3] +"\t" + hasPassed +"\t" + average[3] +"\t" +grade);
		
	}

}
