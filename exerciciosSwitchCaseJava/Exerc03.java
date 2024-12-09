package exerciciosSwitchCaseJava;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.print("Digite a idade da pessoa: ");
	        int idade = scan.nextInt();

	        String classificacao;
	        
	        // A classificação etária será determinada com base na idade
	        switch (idade / 10) {  
	            case 0: // 0-9 anos
	            case 1: // 10-19 anos
	                if (idade <= 12) {
	                    classificacao = "Criança";
	                } else {
	                    classificacao = "Adolescente";
	                }
	                break;
	            case 2: 
	                classificacao = "Adulto";
	                break;
	            case 3: 
	            default:
	                classificacao = "Idoso";
	        }

	        System.out.println("Classificação Etária: " + classificacao);

	        scan.close();

	}

}
