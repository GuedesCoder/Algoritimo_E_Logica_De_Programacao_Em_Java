package secao_7_aula_72_exercicio_resolvido_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		double[][] matriz = new double[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetor = new double[M];
		
		for(int i = 0; i < M; i++) {
			double somaM = 0.0;
			for(int j = 0; j < N; j++) {
				somaM += matriz[i][j];
			}
			vetor[i] = somaM;
		}
		
		for(int i = 0; i < M; i++) {
			System.out.printf("%.1f%n",vetor[i]);
		}
		
		sc.close();
	}
}