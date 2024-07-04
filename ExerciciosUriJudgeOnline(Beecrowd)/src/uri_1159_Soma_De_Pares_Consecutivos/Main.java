package uri_1159_Soma_De_Pares_Consecutivos;

import java.util.Scanner;

//Soma de Pares Consecutivos
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		while (X != 0) {
			if (X % 2 != 0) {
				X += 1;
			}
			int somaX = X + (X + 2) + (X + 4) + (X + 6) + (X + 8);
			System.out.println(somaX);
			X = sc.nextInt();
		}
		sc.close();
	}
}