package secao_5_aula_47_exercicio_resolvido_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0;
		int contador = 0;
		
		while(idade >= 0) {
			soma += idade;
			contador += 1;
			idade = sc.nextInt();
		}
		
		if (contador > 0) {
			double idadeMedia = (double)soma / contador;
			System.out.printf("A idade média das idade informadas é de %.2f.%n", idadeMedia);
		} else {
			System.out.println("É impossível calcular.");
		}
		sc.close();
	}

}
