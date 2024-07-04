package uri_1048_Aumento_De_Salario;

import java.util.Locale;
import java.util.Scanner;

//Aumento de Salário
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double indice = 0;

		if (salario > 0.00 && salario <= 400) {
			indice = 15;
		} else if (salario > 400 && salario <= 800) {
			indice = 12;
		} else if (salario > 800 && salario <= 1200) {
			indice = 10;
		} else if (salario > 1200 && salario <= 2000) {
			indice = 7;
		} else if (salario > 2000) {
			indice = 4;
		}

		double novoSalario = salario + salario * (indice/100);
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n",(novoSalario-salario));
		System.out.println("Em percentual: " + (int)indice + " %");
		
		sc.close();
	}
}