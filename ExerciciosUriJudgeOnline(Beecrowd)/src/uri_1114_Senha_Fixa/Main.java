package uri_1114_Senha_Fixa;

import java.util.Scanner;

//Senha Fixa
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha =sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}
}