package uri_1154_Idades;

import java.util.Locale;
import java.util.Scanner;

//Idades
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int somaIdades = 0;
		int contador = 0;
		
		while(idade >= 0) {
			somaIdades += idade;
			contador += 1;
			idade = sc.nextInt();
		}
		
		double media = (double)somaIdades / contador;
		
		System.out.printf("%.2f%n",media);
		
		sc.close();
	}
}