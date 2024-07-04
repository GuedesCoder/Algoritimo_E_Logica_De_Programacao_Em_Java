package uri_1009_Salario_Com_Bonus;

import java.util.Locale;
import java.util.Scanner;

//Salário com Bônus
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String vendedor = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalDeVendas = sc.nextDouble();
		double salarioTotal = salarioFixo + (totalDeVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		
		sc.close();
	}

}
