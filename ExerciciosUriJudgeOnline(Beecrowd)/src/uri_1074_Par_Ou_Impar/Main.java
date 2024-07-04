package uri_1074_Par_Ou_Impar;

import java.util.Scanner;

//Par ou Ímpar
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			int value = sc.nextInt();
			if (value % 2 == 0 && value > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (value % 2 != 0 && value > 0) {
				System.out.println("ODD POSITIVE");
			} else if (value % 2 == 0 && value < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (value % 2 != 0 && value < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
		sc.close();
	}
}