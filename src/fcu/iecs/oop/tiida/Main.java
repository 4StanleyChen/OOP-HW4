package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida nt = new NissanTiida();
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入要做的次數");
		num = input.nextInt();
		
		nt.tiida(num);
		input.close();
	}

}
