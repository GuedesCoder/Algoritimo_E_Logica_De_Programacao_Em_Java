package uri_1071_Soma_De_Impares_Consecutivos_I;

import java.util.Scanner;

//Soma De Impares Consecutivos I
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int menor;
		int maior;

		if (X < Y) {
			menor = X;
			maior = Y;
		} else {
			menor = Y;
			maior = X;
		}

		int soma = 0;
		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += +i;
			}
		}
		System.out.println(soma);

		sc.close();
	}

}
