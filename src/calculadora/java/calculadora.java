package calculadora.java;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor de investimento: ");
		double valorInvestido = scanner.nextDouble();
		
		double visualizamOriginal = valorInvestido * 30;
		double visualizacaoTotal = visualizamOriginal;
		
		for (int i = 0; i < 4; i++) {
			double cliques = (visualizacaoTotal / 100) * 12; 
			double compartilhamentos = (cliques / 20) * 3;
			visualizacaoTotal += compartilhamentos * 40;			
		}
		
		System.out.printf("Com o valor de R$ %.2f investido, o alcance aproximado será de %.0f visualizações.",valorInvestido,visualizacaoTotal);
		
	}

}
