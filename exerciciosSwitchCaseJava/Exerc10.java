package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite um n�mero para calcular o fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        switch (numero) {
            case 0:
                // O fatorial de 0 � 1
                fatorial = 1;
                System.out.println("O fatorial de 0 �: " + fatorial);
                break;
            case 1:
                // O fatorial de 1 � 1
                fatorial = 1;
                System.out.println("O fatorial de 1 �: " + fatorial);
                break;
            default:
                // Para n�meros maiores que 1, calcula o fatorial
                if (numero > 1) {
                    fatorial = 1; // Inicializando o fatorial
                    for (int i = 2; i <= numero; i++) {
                        fatorial *= i; // Calculando o fatorial
                    }
                    System.out.println("O fatorial de " + numero + " �: " + fatorial);
                } else {
                    System.out.println("Por favor, insira um n�mero maior ou igual a 0.");
                }
        }

        scan.close();

	}

}
