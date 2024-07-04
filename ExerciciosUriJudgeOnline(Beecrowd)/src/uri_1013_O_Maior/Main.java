package uri_1013_O_Maior;

import java.util.Scanner;

//O Maior
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.println(maiorABC + " eh o maior");
		
		sc.close();
	}

}