package uri_1001_Extremamente_Basico;

import java.util.Scanner;

//Extremamente Básico
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = A + B;
		
		System.out.println("X = " + X);
		
		sc.close();
	}

}