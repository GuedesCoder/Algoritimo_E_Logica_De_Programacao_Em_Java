package uri_1005_Media_1;

import java.util.Locale;
import java.util.Scanner;

//Média 1
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double MEDIA = ((A * 3.5) + (B * 7.5))/(3.5 + 7.5);
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		sc.close();
	}

}