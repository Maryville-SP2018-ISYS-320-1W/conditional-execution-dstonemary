import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y is positive

-- Your test values for x, y, z and do you expect true or false?
1 1 1 -> TRUE
1 -11 1 -> FALSE
*/

/* 2. 
-- Your conditional expression
x is not zero


-- Your test values for x, y, z and do you expect true or false?
1 1 1 -> TRUE
0 1 1 -> FALSE
*/

/* 3.  
-- Your conditional expression
y * z is odd

-- Your test values for x, y, z and do you expect true or false?
1 1 2 -> TRUE
1 1 1 -> FALSE
*/

/* 4.  
-- Your conditional expression
y is at least the sum of z and x

-- Your test values for x, y, z and do you expect true or false?
1 2 1 -> TRUE
1 1 1 -> FALSE
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if(x < y ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}
		
		if( y > 0 ) {
			System.out.println("y is positive");
		} else {
			System.out.println("y is negative");
		}
		
		if( x != 0 ) {
			System.out.println("x is not zero");
		} else {
			System.out.println("x is equals to zero");
		}
		
		if( (y * z % 2) !=0 ) {
			System.out.println("y * z is odd");
		} else {
			System.out.println("y * z is even");
		}
		
		if( y >= (z+x) ) {
			System.out.println("y is at least the sum of z and x");
		} else {
			System.out.println("y is less then sum of z and x");
		}		
		

	}

}
