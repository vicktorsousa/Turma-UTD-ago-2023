package logicadeprogramacao.variaveisEconstantes;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//Questão de Idade
public class E02 {

	public static void main(String[] args) {
		int idadeAnos = 25, idadeMeses = 10, idadeDias = 2;
		//ignora anos bisextos e os meses com 30 e 29 dias
		double idadeSomenteEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		//System.out.println(idadeSomenteEmDias);
		
		LocalDate aniversario = LocalDate.of(1997,Month.OCTOBER, 26);
		
		//considera tudo, é o resultado exato - É um api do JAVA
		long dias = aniversario.until(LocalDate.now(), ChronoUnit.DAYS);
		
		System.out.println("Meu Cálculo: "+idadeSomenteEmDias);
		
		System.out.println("Tempo real: "+dias);
	}
}
