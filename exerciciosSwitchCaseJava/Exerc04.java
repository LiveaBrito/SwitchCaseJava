package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1 - Exibir 'Olá, Mundo!'");
            System.out.println("2 - Exibir 'Bem-vindo ao Java'");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção (1, 2 ou 3): ");
            
            opcao = scan.nextInt(); //lê a opção do usuário

            switch (opcao) {
                case 1:
                    System.out.println("Olá, Mundo!");
                    break;
                case 2:
                    System.out.println("Bem-vindo ao Java");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            System.out.println(); 
            
        } while (opcao != 3);  

        scan.close();

	}

}
