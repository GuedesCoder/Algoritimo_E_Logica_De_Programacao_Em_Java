package secao_3_aula_21_exercicio_resolvido_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double larguraTerreno = sc.nextDouble();
		double comprimentoTerreno = sc.nextDouble();
		double valorMetroQuadrado = sc.nextDouble();		
		
		double areaTotal = larguraTerreno * comprimentoTerreno;
		double precoFinal = areaTotal * valorMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", areaTotal);
		System.out.printf("PRECO = R$ %.2f%n", precoFinal);
		
		sc.close();
	}

}
