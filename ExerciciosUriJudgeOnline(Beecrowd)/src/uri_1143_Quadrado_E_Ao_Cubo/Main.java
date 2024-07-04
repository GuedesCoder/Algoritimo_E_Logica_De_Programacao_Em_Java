package uri_1143_Quadrado_E_Ao_Cubo;

import java.util.Scanner;

//Quadrado e ao Cubo
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);

			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		sc.close();
	}
}