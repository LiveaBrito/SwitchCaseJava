package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = scan.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
        } else {
        	
            String classificacao;
            
            if (nota >= 9 && nota <= 10) {
                classificacao = "A";
            } else if (nota >= 7 && nota < 9) {
                classificacao = "B";
            } else if (nota >= 5 && nota < 7) {
                classificacao = "C";
            } else if (nota >= 3 && nota < 5) {
                classificacao = "D";
            } else {
                classificacao = "F";
            }

            System.out.println("Classificação: " + classificacao);
        }

        scan.close();

	}

}
