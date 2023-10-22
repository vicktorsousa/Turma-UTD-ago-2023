package logicadeprogramacao.variaveisEconstantes;

public class Operadores {

	public static void main(String[] args) {
		
		//Operadores unários
		// = <- atribui o valor alguma coisa
		String nome = "UTD";
		
		int numero = 30;
		
		//operador de negação que nega qualquer valor (!)
		boolean verdadeiro = !true;
		
		//System.out.println(verdadeiro);
		//Pós incremento
		//System.out.println(numero++);
		//numero+=10;
		//System.out.println(numero/=10);
		
		//operador aritméticos
		//+-*/%
		
		/*Double é o conjunto de numeros reais, dentro dele tem os numeros inteiros.
		Na divisao sempre vai arredondar até se for numeros inteiros dentro de numero double,
		o resultado sempre vai ser um numero inteiro	
		resolvendo isso, só colocar um dos numeros double*/
		double expressao = 20.0 / 5.0 % 2.0 + 3.0 * 4.0 - 10.0 + 1.0;
		
		/*colocar o D ou F depois do numero, tbm da certo
		Usar tbm o cash = (double)*/
		double divisao = 10 /(double) 3;
		
		double media = (10.0 + 9 + 8) / 3;
		
		//System.out.println(media);
		
		//137 separar as casas decimais.
		
		//Primeiro fazer com numero fixo.
		int numero09 = 137;
		
		int unidade = numero09 % 10;
		
		int dezena = (numero09 % 100) / 10;
		
		int centena = numero09 / 100;
		
		/*System.out.println("unidade: "+unidade);
		
		System.out.println("dezena: "+dezena);
		
		System.out.println("centena: "+centena);*/
		
		//Operadores relacionais - a resposta para os operadores relacionais sempre será falso ou true.
		// >, >=, <, <=, ==, !=	
		
		boolean maiorQue = 74 >= 74;
				
		//System.out.println(maiorQue);
		
		//Operadores lógicos
		//& && <- se todas as proposição for verdade  | ||
		
		boolean proposicao = false & true & true;
		//& não informa que a resposta antecipada, ai continua analiazndo bit a bit
		//&& <- dois && se o primeiro for falso informa que codigo é (falso) e o resto do codigo é dead code.
		
		//Mesma coisa do && o ||
		boolean proposicao2 = true | false | false | false;
		//System.out.println(proposicao2);
		
		boolean podeTirarCarteira = false;
		
		int idade = 21;
		
		boolean passouNaProva = true;
		
		podeTirarCarteira = idade >= 21 && passouNaProva;
		
		System.out.println(podeTirarCarteira);
		
		//Operador Ternário.
		
		//(Prosicao lógica) ? (valorse verdadeiro) : (valor se falso);
		
		String podeTiraCarteiraTernario = idade > 20 && passouNaProva ?
				"pode tirar a cateira" : "Não pode tirar a carteira";
		System.out.println(podeTiraCarteiraTernario);

	}

}
