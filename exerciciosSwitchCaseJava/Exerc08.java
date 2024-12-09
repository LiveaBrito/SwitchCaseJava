package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma op��o de convers�o:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite o n�mero da op��o escolhida (1 ou 2): ");
        
        int opcao = scan.nextInt();

        double temperatura, resultado;

        switch (opcao) {
            case 1: // Celsius para Fahrenheit
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scan.nextDouble();
                resultado = (temperatura * 9 / 5) + 32; // F�rmula para convers�o de Celsius para Fahrenheit
                System.out.printf("%.2f Celsius equivale a %.2f Fahrenheit.\n", temperatura, resultado);
                break;
                
            case 2: // Fahrenheit para Celsius
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scan.nextDouble();
                resultado = (temperatura - 32) * 5 / 9; // F�rmula para convers�o de Fahrenheit para Celsius
                System.out.printf("%.2f Fahrenheit equivale a %.2f Celsius.\n", temperatura, resultado);
                break;
                
            default:
                System.out.println("Op��o inv�lida! Por favor, escolha 1 ou 2.");
        }

        // Fechar o scanner
        scan.close();
	}

}
