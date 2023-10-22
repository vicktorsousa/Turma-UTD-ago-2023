package logicadeprogramacao.variaveisEconstantes;

public class E01 {
	//d = V(x2 - x1)^2 + (y2 - y1)^2
	//X2² - 2. x2.x1 + x1²
	public static void main(String[] args) {
		int x1 = -5,x2 = 6,y1 = 3,y2 = 5;
		
		/*Para tirar a raiz quadrada usa a classe Math com
		o metodo SQRT <- significa raiz quadrada*/
		//squareroot
		//A classe Math retorna o resultado em (double)
		
		//double quadradoDaDiferenca01 = (Math.pow(x2, 2) - 2*x2*x1 + Math.pow(x1, 2));
		
		//double quadradoDaDiferenca02 = (Math.pow(y2, 2) - 2*y2*y1 + Math.pow(y1, 2));
		
		//double resposta = Math.sqrt(quadradoDaDiferenca01 + quadradoDaDiferenca02);
		
		//double resposta2 = Math.sqrt(Math.pow(11,2) + Math.pow(2,2));
		
		//double resposta2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y1 - y2), 2));
		
		double resposta2 = Math.sqrt(11*11 + 2*2);
		
		System.out.printf("%.2f", resposta2);
	}

}
