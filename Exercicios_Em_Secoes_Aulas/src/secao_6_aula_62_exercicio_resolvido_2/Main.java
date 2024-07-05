package secao_6_aula_62_exercicio_resolvido_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vetor = new double[N];

		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			System.out.print(vetor[i] + " ");
		}

		double soma = 0.0;

		for (int i = 0; i < N; i++) {
			soma = soma + vetor[i];
		}

		System.out.printf("%n%.2f%n", soma);

		double media = 0.0;

		media = soma / N;

		System.out.printf("%.2f", media);

		sc.close();
	}
}