package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        switch (numero) {
            case 0:
                // O fatorial de 0 é 1
                fatorial = 1;
                System.out.println("O fatorial de 0 é: " + fatorial);
                break;
            case 1:
                // O fatorial de 1 é 1
                fatorial = 1;
                System.out.println("O fatorial de 1 é: " + fatorial);
                break;
            default:
                // Para números maiores que 1, calcula o fatorial
                if (numero > 1) {
                    fatorial = 1; // Inicializando o fatorial
                    for (int i = 2; i <= numero; i++) {
                        fatorial *= i; // Calculando o fatorial
                    }
                    System.out.println("O fatorial de " + numero + " é: " + fatorial);
                } else {
                    System.out.println("Por favor, insira um número maior ou igual a 0.");
                }
        }

        scan.close();

	}

}
