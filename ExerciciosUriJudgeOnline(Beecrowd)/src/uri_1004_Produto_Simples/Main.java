package uri_1004_Produto_Simples;

import java.util.Scanner;

//Produto Simples
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}

}
