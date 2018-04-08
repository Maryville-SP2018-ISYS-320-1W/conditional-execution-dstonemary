import java.util.Scanner;

/*
ISYS 320
Name(s): Derek Stone
Date:    April-08-2018
*/

/*
 Your expected result:
 
 1.	x == 4 : true
 2.	x != z : false
 3.	z == y : false
 4.	x + y > 0 : true
 
 5.	y * y <= z : false
 6.	y / y == 1 : true
 7.	x * (y + 2) > y - (y + z) * 2 : true
 -------------------OUTPUT---------------------------
x == 4 true
x != z false
z == y false
x + y > 0 true
y * y <= z false
y / y == 1 true
x * (y + 2) > y - (y + z) * 2 true
  
 */
public class P3_ConditionalExpressions {

	public static void main(String[] args) {
		int x = 4;
		int y = -3;
		int z = 4;
		
		// Replace "YOUR EXPRESSION HERE" with the expression you're validating
		System.out.println("x == 4 " + (x == 4) );
		System.out.println("x != z " + (x != z) );
		System.out.println("z == y " + (z == y) );
		System.out.println("x + y > 0 " + (x + y > 0) );
		System.out.println("y * y <= z " + (y * y <= z) );
		System.out.println("y / y == 1 " + (y / y == 1) );
		System.out.println("x * (y + 2) > y - (y + z) * 2 " + (x * (y + 2) > y - (y + z) * 2) );
		
		
	}

}
