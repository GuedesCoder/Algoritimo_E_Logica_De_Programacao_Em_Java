package exercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] precoCompra = new double[N];
		double[] precoVenda = new double[N];
		int lucroAbaixo10 = 0;
		int lucroEntre10E20 = 0;
		int lucroAcima20 = 0;

		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			precoCompra[i] = sc.nextDouble();
			precoVenda[i] = sc.nextDouble();
		}

		// Definindo o Lucro
		for (int i = 0; i < N; i++) {
			double lucro = precoVenda[i] - precoCompra[i];
			double percentualLucro = ((lucro / precoCompra[i]) * 100);

			if (percentualLucro < 10) {
				lucroAbaixo10++;
			} else if (percentualLucro >= 10 && percentualLucro <= 20) {
				lucroEntre10E20++;
			} else {
				lucroAcima20++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10E20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);

		// Total do Valor de Compras
		double totalCompra = 0.0;
		for (int i = 0; i < N; i++) {
			totalCompra += precoCompra[i];
		}

		System.out.printf("Valor total de compra: %.2f%n", totalCompra);

		// Total do Valor de Vendas
		double totalVenda = 0.0;
		for (int i = 0; i < N; i++) {
			totalVenda += precoVenda[i];
		}

		System.out.printf("Valor total de venda: %.2f%n", totalVenda);

		// Lucro Total
		double lucroTotal = totalVenda - totalCompra;
		System.out.printf("Lucro total: %.2f%n", lucroTotal);

		sc.close();
	}
}