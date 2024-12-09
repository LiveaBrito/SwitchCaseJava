package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite a classifica��o do filme (G, PG, PG-13, R): ");
        String classificacao = scan.nextLine().toUpperCase(); // L� e converte para mai�sculas

        switch (classificacao) {
            case "G":
                System.out.println("Faixa et�ria permitida: Livre");
                break;
            case "PG":
                System.out.println("Faixa et�ria permitida: Maior de 10 anos");
                break;
            case "PG-13":
                System.out.println("Faixa et�ria permitida: Maior de 13 anos");
                break;
            case "R":
                System.out.println("Faixa et�ria permitida: Maior de 18 anos");
                break;
            default:
                System.out.println("Classifica��o inv�lida. Digite G, PG, PG-13 ou R.");
        }

        scan.close();

	}

}
