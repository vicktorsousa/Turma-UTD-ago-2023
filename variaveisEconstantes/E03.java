package logicadeprogramacao.variaveisEconstantes;

import java.util.Scanner;

public class E03 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		Double nota01 = leitor.nextDouble();
		
		System.out.println("Digite a 2° nota: ");
		Double nota02 = leitor.nextDouble();
		
		System.out.println("Digite a 3° nota: ");
		Double nota03 = leitor.nextDouble();
		
		int peso01 = 4, peso02 = 5, peso03 = 6, somaPesos = peso01 + peso02 + peso03;
		
		double mediaPonderada = (nota01 * peso01 + nota02 *peso02 + nota03 * peso03) 
				/ somaPesos;
		
		String resultado = mediaPonderada >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado+"nota: "+mediaPonderada);
		
		
	}

}
