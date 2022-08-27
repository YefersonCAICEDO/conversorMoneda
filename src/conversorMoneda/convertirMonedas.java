package conversorMoneda;

import javax.swing.JOptionPane;

public class convertirMonedas {


	public void pesosaDolar(double valor,double precio, String nombre) {
		double monedaDolar = valor / precio;// ;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedaDolar+  nombre);
	
	}
	
	/**public void pesosaEuro(double valor) {
		double monedaEuro = valor / 4300;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedaEuro+ " Euros");
	
	}
	
	public void pesosaLibrasEsterlinas(double valor) {
		double monedaLibrasEsterlinas = valor / 5159.38;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedaLibrasEsterlinas+ " Libras Esterlinas");
	
	}
	public void pesosaYenJapones(double valor) {
		double monedaYenJapones = valor / 31.97;
		monedaYenJapones = (double) Math.round(monedaYenJapones * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedaYenJapones+ " Yen Japones");
	
	}
	public void pesosaWonSulCoreano(double valor) {
		double monedaWonSulCoreano = valor / 3.28;
		monedaWonSulCoreano = (double) Math.round(monedaWonSulCoreano * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedaWonSulCoreano+ " WonSulCoreano");
	
	}**/
	public void dolaraPesos(double valor,double precio, String nombre) {
		double monedapesos = valor * precio;
		monedapesos = (double) Math.round(monedapesos * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedapesos+ nombre);
	
	}
	/*
	public void euroaPesos(double valor) {
		double monedapesos = valor * 4382.24;
		monedapesos = (double) Math.round(monedapesos * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedapesos+ " pesos");
	
	}
	public void LibrasEsterliasaPesos(double valor) {
		double monedapesos = valor * 5159.38;
		monedapesos = (double) Math.round(monedapesos * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedapesos+ " pesos");
	
	}
	public void yenJaponesaPesos(double valor) {
		double monedapesos = valor * 31.97;
		monedapesos = (double) Math.round(monedapesos * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedapesos+ " pesos");
	
	}
	public void wonSulCoreanoaPesos(double valor) {
		double monedapesos = valor * 3.28;
		monedapesos = (double) Math.round(monedapesos * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"cuentas con $" + monedapesos + " pesos");
	
	}*/

}
