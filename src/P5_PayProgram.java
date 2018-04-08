import java.util.Scanner;

/*
ISYS 320
Name(s): Derek Stone
Date:    April-08-2018
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		double total_pay = computePay(hourlyRate, numOfHoursWorked);
		System.out.println("Total Pay : "+total_pay);
	}
	
	public static double computePay(double hourlyRate, int numOfHoursWorked){
		double pay = (hourlyRate * Math.min(numOfHoursWorked, 8)) + ((hourlyRate * 1.5) * Math.max((numOfHoursWorked - 8), 0));
		return pay;
	}

}
