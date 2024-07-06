package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vetor = new double[N];
		double soma = 0.0;
		double media = 0.0;

		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			soma += vetor[i];
		}

		media = soma / N;
		System.out.println(media);
		for (int i = 0; i < N; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}
}