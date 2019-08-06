package projetoFeriasOO;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000;
		
		minhaConta.saca(2000);
		minhaConta.deposita(500);
		
		JOptionPane.showMessageDialog(null, minhaConta.titular);
		JOptionPane.showMessageDialog(null, minhaConta.saldo);
		
		
	}

}
