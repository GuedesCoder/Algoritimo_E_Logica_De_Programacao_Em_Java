package uri_1094_Experiencias;

import java.util.Locale;
import java.util.Scanner;

//Experiências
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;

		for (int i = 0; i < N; i++) {
			
			int quantidade = sc.nextInt();
			char cobaia = sc.next().charAt(0);

			if (cobaia == 'C') {
				coelhos = coelhos + quantidade;
			} else if (cobaia == 'S') {
				sapos = sapos + quantidade;
			} else {
				ratos = ratos + quantidade;
			}
		}
		
		int totalCobaias = coelhos + ratos + sapos;

		double percentualCoelhos = (double) coelhos / totalCobaias * 100.0;
		double percentualRatos = (double) ratos / totalCobaias * 100.0;
		double percentualSapos = (double) sapos / totalCobaias * 100.0;

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

		sc.close();
	}
}