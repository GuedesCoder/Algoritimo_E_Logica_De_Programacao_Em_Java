package uri_1113_Crescente_E_Decrescente;

import java.util.Scanner;

//Crescente e Decrescente
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
}