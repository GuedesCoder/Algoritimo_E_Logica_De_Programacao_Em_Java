package secao_4_aula_37_exercicio_resolvido_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("O menor número é: " + a);
		} else if (b < c) {
			System.out.println("O menor número é: " + b);
		} else {
			System.out.println("O menor número é: " + c);
		}
		
		sc.close();
	}
}
