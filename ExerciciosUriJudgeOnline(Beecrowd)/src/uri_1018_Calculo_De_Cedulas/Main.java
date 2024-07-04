package uri_1018_Calculo_De_Cedulas;

import java.util.Scanner;

//Cálculo de Cédulas
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int resto;
		System.out.println(A);

		int notas100 = A / 100;
		resto = A % 100;

		int notas50 = resto / 50;
		resto = resto % 50;

		int notas20 = resto / 20;
		resto = resto % 20;

		int notas10 = resto / 10;
		resto = resto % 10;

		int notas5 = resto / 5;
		resto = resto % 5;

		int notas2 = resto / 2;
		resto = resto % 2;

		int notas1 = resto % 2;

		System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
		System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
		System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
		System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
		System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
		System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
		System.out.printf("%d nota(s) de R$ 1,00%n", notas1);
		sc.close();
	}
}
