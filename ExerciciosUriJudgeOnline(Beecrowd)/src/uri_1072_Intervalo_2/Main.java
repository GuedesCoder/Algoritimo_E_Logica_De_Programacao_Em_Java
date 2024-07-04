package uri_1072_Intervalo_2;

import java.util.Scanner;

//Intervalo 2
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}