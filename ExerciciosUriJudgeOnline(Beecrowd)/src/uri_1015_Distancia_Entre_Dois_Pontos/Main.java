package uri_1015_Distancia_Entre_Dois_Pontos;

//Distância Entre Dois Pontos
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();
		double Distancia = Math.sqrt(Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2));
		
		System.out.printf("%.4f%n", Distancia);
		
		sc.close();
	}

}