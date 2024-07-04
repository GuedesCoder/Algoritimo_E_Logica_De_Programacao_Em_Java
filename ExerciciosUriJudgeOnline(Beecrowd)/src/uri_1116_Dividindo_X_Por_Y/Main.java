package uri_1116_Dividindo_X_Por_Y;

import java.util.Locale;
import java.util.Scanner;

//Dividindo X por Y
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			double divisao = 0.0;
			
			if (Y != 0) {
				divisao = (double) X / Y;
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}
}