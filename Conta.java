package projetoFeriasOO;

import javax.swing.JOptionPane;

public class Conta {
	int numero;
	String titular;
	double saldo;
	
	//metodo sem retorno (teste)
	
	/*void saca (double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}*/
	
	void deposita(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		this.saldo = novoSaldo;
	}
	
	//metodos com retorno
	
	boolean saca(double valor) {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
			return true;
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			return false;
		}
	}
	
}
