package uri_1019_Conversao_De_Tempo;

import java.util.Scanner;

//Conversão de Tempo
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int H = X / 3600;
		int MOD = X % 3600;
		int M = MOD / 60;
		int S = MOD % 60;
		
		System.out.printf("%d:%d:%d%n", H, M, S);
		
		sc.close();
	}
}