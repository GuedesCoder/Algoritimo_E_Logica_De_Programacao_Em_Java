package uri_1132_Multiplos_De_13;

import java.util.Scanner;

//Multiplos de  13
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int menor = X;
		int maior = Y;
		int soma = 0;
		
		if(X > Y) {
			menor = Y;
			maior = X;
		}
		
		for(int i = menor; i <= maior; i++) {
			if(i % 13 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		sc.close();
	}
}