package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma bebida:");
        System.out.println("1 - Café");
        System.out.println("2 - Chá");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");

        System.out.print("Digite o número da bebida escolhida (1 a 4): ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Café");
                break;
            case 2:
                System.out.println("Você escolheu: Chá");
                break;
            case 3:
                System.out.println("Você escolheu: Suco");
                break;
            case 4:
                System.out.println("Você escolheu: Refrigerante");
                break;
            default:
                System.out.println("Opção inválida! Escolha um número de 1 a 4.");
        }

        scan.close();

	}

}
