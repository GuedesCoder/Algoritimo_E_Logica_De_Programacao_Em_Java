package secao_7_aula_71_exercicio_resolvido_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] matriz = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal Principal:");
		
		for(int i = 0; i < N; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int contadorNegativos = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(matriz[i][j] < 0) {
					contadorNegativos++;
				}
			}
		}
		System.out.println("Quantidade de negativos: " + contadorNegativos);
		sc.close();
	}
}