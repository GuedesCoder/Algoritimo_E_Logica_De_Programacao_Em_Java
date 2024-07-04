package uri_1010_Calculo_Simples;

import java.util.Locale;
import java.util.Scanner;

//Calculo Simples
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cdPeca1 = sc.nextInt();
		int qtPecas1 = sc.nextInt();
		double vlUnitarioPeca1 = sc.nextDouble();
		int cdpeca2 = sc.nextInt();
		int qtPecas2 = sc.nextInt();
		double vlUnitarioPeca2 = sc.nextDouble();
		double vlTotalAPagar = (qtPecas1 * vlUnitarioPeca1) + (qtPecas2 * vlUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vlTotalAPagar);
		
		sc.close();
	}

}