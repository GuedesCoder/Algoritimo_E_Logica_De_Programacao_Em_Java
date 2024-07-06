package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int contadorDePares = 0;

		int[] vetor = new int[N];

		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for(int foda : vetor) {
			if(foda % 2 == 0) {
				System.out.print(foda + " ");
				contadorDePares++;
			}
		}
		System.out.println();
		System.out.println(contadorDePares);

		sc.close();
	}
}