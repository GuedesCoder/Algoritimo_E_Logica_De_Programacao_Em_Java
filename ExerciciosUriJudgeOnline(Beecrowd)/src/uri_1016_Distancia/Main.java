package uri_1016_Distancia;

import java.util.Scanner;

//Distância
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        int tempo = 2 * distancia;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}