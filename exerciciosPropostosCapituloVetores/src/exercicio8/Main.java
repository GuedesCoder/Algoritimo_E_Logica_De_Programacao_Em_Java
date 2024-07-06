package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double somaAlturaMulheres = 0.0;
		double mediaAlturaMulheres = 0.0;
		int contadorMulheres = 0;
		int contadorHomens = 0;

		double[] alturas = new double[N];
		char[] sexos = new char[N];

		for(int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}
		
		//Menor altura
		double menorAltura = alturas[0];
		for(int i = 1; i < N; i++) {
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.printf("Menor altura: %.2f%n", menorAltura);
		
		//maior altura
		double maiorAltura = alturas[0];
		for(int i = 1; i < N; i++) {
			if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.printf("Maior altura: %.2f%n", maiorAltura);
		
		//Media de altura das Mulheres
		for(int i = 0; i < N; i++) {
			if(sexos[i] == 'F'){
				somaAlturaMulheres += alturas[i];
				contadorMulheres++;
			}
		}
		
		if(contadorMulheres > 0) {
			mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
			System.out.printf("Média das alturas das mulheres: %.2f%n", mediaAlturaMulheres);
		} else {
			System.out.println("Não há mulheres entre as pessoas declaradas.");
		}
			
		//Número de homens
		for(int i = 0; i < N; i++) {
			if(sexos[i] == 'M') {
				contadorHomens++;
			}
		}
		System.out.println("Número de homens: " + contadorHomens);

		sc.close();
	}
}