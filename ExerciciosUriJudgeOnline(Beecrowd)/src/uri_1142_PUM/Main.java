package uri_1142_PUM;

import java.util.Scanner;

//PUM
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int n1 = 1;

		for (int i = 1; i <= N; i++) {
			int n2 = n1 + 1;
			int n3 = n1 + 2;
			System.out.printf("%d %d %d PUM%n", n1, n2, n3);

			n1 = n1 + 4;
		}

		sc.close();
	}
}