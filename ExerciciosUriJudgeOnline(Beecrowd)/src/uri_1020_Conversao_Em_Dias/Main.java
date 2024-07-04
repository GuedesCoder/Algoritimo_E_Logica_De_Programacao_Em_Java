package uri_1020_Conversao_Em_Dias;

import java.util.Scanner;

//Conversão em Dias
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int resto;

		int anos = A / 365;
		resto = A % 365;

		int meses = resto / 30;
		
		int dias = resto % 30;

		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", meses);
		System.out.printf("%d dia(s)%n", dias);

		sc.close();
	}
}