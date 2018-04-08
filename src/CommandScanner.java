import java.util.Scanner;
/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-08-2018
*/

public class CommandScanner {


	public static void main(String[] args) {
		  String command = "";
		  String keyWord = "alexa";
		  String keyWordCancel = "cancel";
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter your user speech text: ");
		  String request =  scanner.nextLine();
		  if(request.toLowerCase().indexOf(keyWord) >= 0){
			  int len = request.toLowerCase().indexOf(keyWord)+keyWord.length();
			  command = "Command: "+request.substring(len);	
			  if(request.toLowerCase().indexOf(keyWordCancel) >= 0){
				  command = "Command CANCELLED";
			  }
		  } else{
			  command = "No Command: alexa not found";
		  }
		  System.out.println(command);
	}

}
