package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma bebida:");
        System.out.println("1 - Caf�");
        System.out.println("2 - Ch�");
        System.out.println("3 - Suco");
        System.out.println("4 - Refrigerante");

        System.out.print("Digite o n�mero da bebida escolhida (1 a 4): ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Voc� escolheu: Caf�");
                break;
            case 2:
                System.out.println("Voc� escolheu: Ch�");
                break;
            case 3:
                System.out.println("Voc� escolheu: Suco");
                break;
            case 4:
                System.out.println("Voc� escolheu: Refrigerante");
                break;
            default:
                System.out.println("Op��o inv�lida! Escolha um n�mero de 1 a 4.");
        }

        scan.close();

	}

}
