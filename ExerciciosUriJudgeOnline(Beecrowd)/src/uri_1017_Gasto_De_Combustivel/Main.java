package uri_1017_Gasto_De_Combustivel;

import java.util.Locale;
import java.util.Scanner;

// Gasto de Combustível
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // Tempo gasto na viagem em horas
		int Y = sc.nextInt(); // Velocidade média em KMs
		double Z = (X * Y) / 12.0; //Quantidade de litros necessaria na viagem
		
		System.out.printf("%.3f%n", Z);
		
		sc.close();
	}

}
