package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		PasswordEncorder pw = new PasswordEncorder();
		int ex = 0;
		
		
		Scanner input = new Scanner(System.in);
		while(ex==0){
			System.out.println("Please enter a password:");
			String str = input.nextLine();
			
			switch(str){
			case "exit" :
				ex = 1;
				break;
			default :
				str = pw.encode(str);
				System.out.println(str);
				break;
			}
		}
		input.close();
		
	}

}
