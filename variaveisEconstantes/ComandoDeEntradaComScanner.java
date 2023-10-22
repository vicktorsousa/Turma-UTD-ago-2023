package logicadeprogramacao.variaveisEconstantes;

import java.util.Scanner;

public class ComandoDeEntradaComScanner {

	public static void main(String[] args) {
		//Scanner Criando um obejto que vai ser ler as informações pra mim
		Scanner leitor = new Scanner(System.in);
		
				
		//Só para mostra mensagens para a pessoa não ficar perdida
		System.out.println("Digite o seu nome: ");
		
		//Dando o valor do que for digitado no console, fica aguardando ser digitado o valor
		String nome = leitor.next();
		
		System.out.println("Digite a sua idade: ");
		
		//Fica esperando um novo valor ser digitado no console, esse valor vai ser associado a variavel idade
		int idade = leitor.nextInt();
		
		System.out.println("Olá "+nome+" você tem "+idade+" anos de idade.");

	}

}
