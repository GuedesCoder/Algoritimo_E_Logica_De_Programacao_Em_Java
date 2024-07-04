package uri_1021_Notas_E_Moedas;

import java.util.Locale;
import java.util.Scanner;

//Notas e Moedas	
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double resto;

		int notas100 = (int)A / 100;
		resto = A % 100;
		int notas50 = (int)resto / 50;
		resto = resto % 50;
		int notas20 = (int)resto / 20;
		resto = resto % 20;
		int notas10 = (int)resto / 10;
		resto = resto % 10;
		int notas5 = (int)resto / 5;
		resto = resto % 5;
		int notas2 = (int)resto / 2;
		resto = resto % 2;
		
		resto = resto * 100;
		
		int moedas1 = (int)resto / 100;
		resto = resto % 100;
		int moedas050 = (int)resto / 50;
		resto = resto % 50;
		int moedas025 = (int)resto / 25;
		resto = resto % 25;
		int moedas010 = (int)resto / 10;
		resto = resto % 10;
		int moedas005 = (int)resto / 5;
		resto = resto % 5;
		int moedas001 = (int)Math.round(resto);
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", notas100);
		System.out.printf("%d nota(s) de R$ 50.00%n", notas50);
		System.out.printf("%d nota(s) de R$ 20.00%n", notas20);
		System.out.printf("%d nota(s) de R$ 10.00%n", notas10);
		System.out.printf("%d nota(s) de R$ 5.00%n", notas5);
		System.out.printf("%d nota(s) de R$ 2.00%n", notas2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", moedas1);
		System.out.printf("%d moeda(s) de R$ 0.50%n", moedas050);
		System.out.printf("%d moeda(s) de R$ 0.25%n", moedas025);
		System.out.printf("%d moeda(s) de R$ 0.10%n", moedas010);
		System.out.printf("%d moeda(s) de R$ 0.05%n", moedas005);
		System.out.printf("%d moeda(s) de R$ 0.01%n", moedas001);
		sc.close();
	}
}