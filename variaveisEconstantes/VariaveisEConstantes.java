package logicadeprogramacao.variaveisEconstantes;

public class VariaveisEConstantes {
/*
 * Classe de apresentação de variáveis e constantes.
 * 
 * autor: Paulo Sousa
 * 
 * data: 21/08/2023
 * 
 * versão: 1.0. 
 * 
 * Comentário de bloco
 * 
 * */
	public static void main(String[] args) {
		//binário 0 e 1 bits
		// 8 bits => 1 byte code A, 1 e &
		// Comentário de linha
		
		byte	numeroInteiroByte = 100;
		short 	numeroInteiroCurto = 15000;
		int		numeroInteiro = 2_123_456_789; //2.123.456.789;
		long 	numeroInteiroLongo = 1_234_567_890_2_345_678L;
		// L ou l, entender que é um numero long
		
		float 	numeroRacional = 9.123456f, raio = 2;
		// F para reconhcer como numero de ponto flutuante;
		double numeroRacionalDePrecisaoDupla = 18.246810121416;
		
		char letra = 'a';
		
		boolean verdadeiro = true;
		
		String nome = "Paulo";
		
		boolean verdadeiros = false;
		
		final float VALOR_DO_PI = 3.1415f;
		
		float area = (float) (VALOR_DO_PI * Math.pow(raio, 2));
		// Math.pow elevar o número ao quadrado
		
		System.out.println("Hello World");
		
		System.out.println("Byte: "+numeroInteiroByte);
		
		System.out.println("Valor de PI "+VALOR_DO_PI);
		
		String numero = String.valueOf(35);
		
		// Inteiro para String
		int numero2 = Integer.parseInt("36");
		
		float numero3 = Float.parseFloat("49");
		
		//Usar quando tem relacionamento entre numeros. (int)
		int numero4 = (int) 60.00;
		
		
	}
}
