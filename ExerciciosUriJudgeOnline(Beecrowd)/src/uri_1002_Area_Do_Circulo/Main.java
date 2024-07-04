package uri_1002_Area_Do_Circulo;

import java.util.Locale;
import java.util.Scanner;

// Área do Círculo
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		double area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}
	
}