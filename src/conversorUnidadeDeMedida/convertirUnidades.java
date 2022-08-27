package conversorUnidadeDeMedida;

import javax.swing.JOptionPane;

public class convertirUnidades {
	
	public void byteaKilobyte(double valor, String nombre) {
		double byteaKilobyte = valor * 0.001;
		//byteaKilobyte = (double) Math.round(byteaKilobyte * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"Son " + byteaKilobyte + nombre);
	}
	
	public void terabyteaByte(double valor, double cantidad, String nombre) {
		double byteaKilobyte = valor * cantidad;
		//byteaKilobyte = (double) Math.round(byteaKilobyte * 100d)/ 100;
		JOptionPane.showMessageDialog(null,"Son " + byteaKilobyte + nombre);
	}

	
}
