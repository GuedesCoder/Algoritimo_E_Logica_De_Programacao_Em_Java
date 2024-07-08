package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] matriz = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Soma das linhas
		for (int i = 0; i < N; i++) {
			int soma = 0;
			for (int j = 0; j < N; j++) {
				soma += matriz[i][j];
			}
			System.out.println(soma);
		}
	}
}
