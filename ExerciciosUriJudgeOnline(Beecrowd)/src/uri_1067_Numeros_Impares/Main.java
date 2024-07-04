package uri_1067_Numeros_Impares;

import java.util.Scanner;

//Numeros Impares
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for(int i = 1; i <= X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}