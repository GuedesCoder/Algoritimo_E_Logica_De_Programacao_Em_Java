package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		double maior = 0;
		int posicao = 0;
		
		for(int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao++;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
	}
}