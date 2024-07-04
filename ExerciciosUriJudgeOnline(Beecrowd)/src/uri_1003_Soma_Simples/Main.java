package uri_1003_Soma_Simples;

import java.util.Scanner;

//Soma Simples
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		sc.close();
	}

}