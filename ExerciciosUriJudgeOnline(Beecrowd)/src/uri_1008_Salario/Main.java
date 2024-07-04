package uri_1008_Salario;

import java.util.Locale;
import java.util.Scanner;

//Salário
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cdFuncionario = sc.nextInt();
		int qtHorasTrabalhadas = sc.nextInt();
		double vlHoraTrabalhada = sc.nextDouble();
		double vlSalarioMensal = qtHorasTrabalhadas * vlHoraTrabalhada;
		
		System.out.println("NUMBER = " + cdFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", vlSalarioMensal);
		
		sc.close();
	}

}
