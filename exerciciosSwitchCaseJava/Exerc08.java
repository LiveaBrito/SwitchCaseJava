package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite o número da opção escolhida (1 ou 2): ");
        
        int opcao = scan.nextInt();

        double temperatura, resultado;

        switch (opcao) {
            case 1: // Celsius para Fahrenheit
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scan.nextDouble();
                resultado = (temperatura * 9 / 5) + 32; // Fórmula para conversão de Celsius para Fahrenheit
                System.out.printf("%.2f Celsius equivale a %.2f Fahrenheit.\n", temperatura, resultado);
                break;
                
            case 2: // Fahrenheit para Celsius
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scan.nextDouble();
                resultado = (temperatura - 32) * 5 / 9; // Fórmula para conversão de Fahrenheit para Celsius
                System.out.printf("%.2f Fahrenheit equivale a %.2f Celsius.\n", temperatura, resultado);
                break;
                
            default:
                System.out.println("Opção inválida! Por favor, escolha 1 ou 2.");
        }

        // Fechar o scanner
        scan.close();
	}

}
