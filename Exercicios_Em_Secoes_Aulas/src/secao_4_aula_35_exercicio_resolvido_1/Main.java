package secao_4_aula_35_exercicio_resolvido_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;

		System.out.println("As notas do aluno durante o bimestre foram as seguintes:");
		System.out.printf("1º Bimestre: %.2f%n", nota1);
		System.out.printf("2º Bimestre: %.2f%n%n", nota2);
		System.out.printf("A nota final do aluno é: %.2f%n%n", media);
		
		if (media < 60) {
			System.out.println("O aluno está sumariamente reprovado, toma desavisado...");
		} else {
			System.out.println("O aluno é o bichão mesmo heim...");
		}

		sc.close();
	}

}
