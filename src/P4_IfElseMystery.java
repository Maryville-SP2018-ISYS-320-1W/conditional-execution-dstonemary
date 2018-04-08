/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-08-2018
*/

/*
 Your expected results after the input is provided:
 
 1. ifElseMystery(10, 2) : No output
 2. ifElseMystery(3, 8)  : No Output
 3. ifElseMystery(4, 4)  : 3 4
 4.	ifElseMystery(10, 30): 29 30
  
  All prediction was correct.
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		ifElseMystery(10, 2);
		ifElseMystery(3, 8);
		ifElseMystery(4, 4);
		ifElseMystery(10, 30);
	}
	
    public static void ifElseMystery(int a, int b) {
    	System.out.println("b: "+b);
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }

}
