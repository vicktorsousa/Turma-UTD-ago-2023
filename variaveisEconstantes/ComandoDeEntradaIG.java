package logicadeprogramacao.variaveisEconstantes;

import javax.swing.JOptionPane;

public class ComandoDeEntradaIG {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		//JOptionPane <- sempre vai vim em formato de string
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		//Integer.parseInt <- tranforma em inteiro
		JOptionPane.showMessageDialog(null, "Olá "+nome+ " você tem "+idade+" anos de idade");
		
		
		
	}

}
