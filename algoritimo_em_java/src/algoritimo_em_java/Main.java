package algoritimo_em_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		arrays();
	}

	// exemplo 2 (treinando saídas com println e priintf [interpolação)]
	public static void exemplo2() {
		Locale.setDefault(Locale.US);
		String name = "Leandro";
		int age = 38;
		double height = 1.858;
		double salary = 2809.98;

		// abaixo é uma saída usando o printf
		System.out.printf("Bom dia %s, atualmente você tem %d anos, você tem %.3fm de altura, "
				+ "e você recebe mensalmente R$ %.2f de salário.%n", name, age, height, salary);
		// abaixo é uma saída usando o println
		System.out.println("Bom dia " + name + ", atualmente você tem " + age + " anos, você tem " + height
				+ "m de altura, e você recebe mensalmente R$ " + salary + " de salário.");
		System.out.println();
	}

	// exemplo 3 (calculando a area de um trapézio)
	public static void calculoTrapezio() {
		double b = 6.0;
		double B = 8.0;
		double h = 5.0;
		double area = (b + B) / 2 * h;

		System.out.println(area);
	}

	// exemplo 4 (casting int para double)
	public static void exemplo4() {
		int a = 5;
		int b = 2;
		double resultado = (double) a / b; // usado o cast para transformar o inteiro em número com ponto flutuante

		System.out.println();
		System.out.println(resultado);
	}

	// exemplo 5 (castind double para int)
	public static void exemplo5() {
		double a = 5.0;
		int b = (int) a; // usado o cast para transformar o double em número inteiro pois conversão de
							// double para int ocorre erro de compatibilidade entre os tipos.

		System.out.println();
		System.out.println(b);
	}

	// treinando entrada de dados
	public static void entradaDeDados() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int age;
		double height;

		name = sc.next();
		gender = sc.next().charAt(0);
		age = sc.nextInt();
		height = sc.nextDouble();
		System.out.println("Seu nome é " + name + ", seu genêro é: " + gender + ", você tem " + age
				+ " anos e você tem " + height + "m de altura.");
		sc.close();
	}

	public static void entradaDeDadosComQuebraDeLinha() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int age;
		double salary;

		name = sc.nextLine();
		gender = sc.nextLine().charAt(0);
		age = sc.nextInt();
		sc.nextLine();
		salary = sc.nextDouble();

		System.out.println("Voce se chama: " + name + ", seu genero é " + gender + ", sua idade é " + age
				+ " anos e você recebe R$" + salary + " por mês.");
		sc.close();
	}

	public static void operacoesMatematicas() {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("A raiz quadrada de " + (int) x + " é: " + A);
		System.out.println("A raiz quadrada de " + (int) y + " é: " + (int) B);
		System.out.println("A raiz quadrada de 25 é: " + (int) C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println();
		System.out.println((int) x + " elevado a " + (int) y + " é = " + (int) A);
		System.out.println((int) x + " elevado ao quadrado é = " + (int) B);
		System.out.println("5 elevado ao quadrado é = " + (int) C);

		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println();
		System.out.println("O valor absoluto de " + (int) y + " é = " + (int) A);
		System.out.println("O valor absoluto de " + (int) z + " é = " + (int) B);

	}

	public static void switchCase() {
		Scanner sc = new Scanner(System.in);
		int valor;
		String linguagem;
		do {
			System.out.print("Informe um valor: ");
			valor = sc.nextInt();

			switch (valor) {
			case 1:
				linguagem = "Java";
				break;
			case 2:
				linguagem = "JavaScript";
				break;
			case 3:
				linguagem = "Swift";
				break;
			case 4:
				linguagem = "C#";
				break;
			case 5:
				linguagem = "Kotlin";
				break;
			case 6:
				linguagem = "Ruby";
				break;
			case 7:
				linguagem = "C++";
				break;
			case 8:
				linguagem = "Haskell";
				break;
			case 9:
				linguagem = "Cobol";
				break;
			default:
				linguagem = "Não localizada ou inexistente";
				break;
			}
		} while (valor > 9);

		System.out.println("De acordo com o valor inserido, a linguagem correspondente é: " + linguagem);
		sc.close();
	}

	public static void whileContent() {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println("O valor da soma de todos os números digitados é de: " + soma);
		sc.close();
	}

	// exemplo de vetor criando um vetor dos 20 melhores jogos de snes
	public static void arrays() {
		Scanner sc = new Scanner(System.in);

		String[] jogos = new String[10];
		int posicao = 10;
		
		System.out.printf("Informe seus 10 jogos favoritos de Super Nintendo%n%n");
		
		for (int i = 0; i < 10; i++) {
			jogos[i] = sc.nextLine();
		}
		
		System.out.printf("%nO ranking dos seus 10 jogos favoritos de Super Nintendo é:%n%n");
		
		for (int i = 9; i >= 3; i--) {
			System.out.println("Em " + posicao + "º lugar: " + jogos[i]);
			posicao = posicao - 1;
		}
		
		System.out.printf("%nE no top 3 do seu Ranking estão:%n%n");
		
		for (int i = 2; i >= 0; i--) {
			System.out.println("Em " + posicao + "º lugar: " + jogos[i]);
			posicao = posicao - 1;
		}
		sc.close();
	}

}
