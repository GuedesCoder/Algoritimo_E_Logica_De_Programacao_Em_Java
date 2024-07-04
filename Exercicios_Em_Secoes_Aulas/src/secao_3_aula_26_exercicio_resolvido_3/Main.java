package secao_3_aula_26_exercicio_resolvido_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomePessoa1 = sc.next();
		int idadePessoa1 = sc.nextInt();
		String nomePessoa2 = sc.next();
		int idadePessoa2 = sc.nextInt();
		double idadeMedia = (double)(idadePessoa1 + idadePessoa2) / 2;
		
		System.out.println("A idade média de " + nomePessoa1 + " e " + nomePessoa2 + " é de " + idadeMedia + " anos.");
		
		sc.close();
	}

}
