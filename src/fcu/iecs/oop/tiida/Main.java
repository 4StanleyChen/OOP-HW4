package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida nt = new NissanTiida();
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("�п�J�n��������");
		num = input.nextInt();
		
		nt.tiida(num);
		input.close();
	}

}
