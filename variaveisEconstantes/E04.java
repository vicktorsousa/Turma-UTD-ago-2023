package logicadeprogramacao.variaveisEconstantes;

import java.util.Scanner;

public class E04 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valor = leitor.nextDouble();
		
		double aVista = valor - (valor*0.1);
		
		double parcelado03 = valor, parcela03 = valor/3;
		
		double parcelado10 = valor + (valor*0.05), parcela10 = parcelado10/10;
		
		System.out.println("À vista: "+aVista+" uma parcela: "+aVista);
		
		System.out.printf("Parcelado em 3°: %.2f\n",parcela03,parcela03);
		
		System.out.println("Parcelado em 10°: "+parcela10+" 10° parcelas: "+parcela10);
		
	}
			
}
	
	