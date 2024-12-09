package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite a classificação do filme (G, PG, PG-13, R): ");
        String classificacao = scan.nextLine().toUpperCase(); // Lê e converte para maiúsculas

        switch (classificacao) {
            case "G":
                System.out.println("Faixa etária permitida: Livre");
                break;
            case "PG":
                System.out.println("Faixa etária permitida: Maior de 10 anos");
                break;
            case "PG-13":
                System.out.println("Faixa etária permitida: Maior de 13 anos");
                break;
            case "R":
                System.out.println("Faixa etária permitida: Maior de 18 anos");
                break;
            default:
                System.out.println("Classificação inválida. Digite G, PG, PG-13 ou R.");
        }

        scan.close();

	}

}
