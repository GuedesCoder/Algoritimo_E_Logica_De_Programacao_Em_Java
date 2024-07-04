package uri_1078_Tabuada;

import java.util.Scanner;

//Tabuada
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + (i * N));
		}
		sc.close();
	}
}