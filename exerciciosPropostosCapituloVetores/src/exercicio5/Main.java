package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vetor = new int[N];
		double somaDosPares = 0.0;
		int contador = 0;
		double mediaDosPares = 0.0;

		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (vetor[i] % 2 == 0) {
				somaDosPares += vetor[i];
				contador++;
			}
		}
		mediaDosPares = somaDosPares / contador;
		System.out.println(mediaDosPares);

		sc.close();
	}
}