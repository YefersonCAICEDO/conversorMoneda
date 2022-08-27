package conversorMoneda;

import javax.swing.*;

import conversorUnidadeDeMedida.opcionesConversionUnidades;

public class principal {

	public static void main(String[] args) {

		opcionesConversion conversionMoneda = new opcionesConversion();
		opcionesConversionUnidades conversionUnidades = new opcionesConversionUnidades();

		boolean cerrar = true;
		while (cerrar) {

			try {
				String opciones = JOptionPane.showInputDialog(null, "Que deseas convertir", "menu",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "conversor de moneda", "conversor unidades de medida informaticas" }, "elegir")
						.toString();

				String input = JOptionPane.showInputDialog(null, "Ingrese el valor");
				double valorRecibido = Double.parseDouble(input);

				switch (opciones) {
				case "conversor de moneda":
					conversionMoneda.convertirMonedas(valorRecibido);

					int respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar");
					if (JOptionPane.OK_OPTION == respuesta) {
						
					} else {
						JOptionPane.showMessageDialog(null, "programa finalizado");
						cerrar = false;
					}
					break;

				case "conversor unidades de medida informaticas":
					conversionUnidades.convertirunidades(valorRecibido);
					break;
				}

			} catch (NumberFormatException ee) {

				JOptionPane.showMessageDialog(null, "El dato digitado no es un número", "Error",
						JOptionPane.ERROR_MESSAGE);
				
			} catch (NullPointerException e) {
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Deseas cerrar el programa");
				if (!(JOptionPane.OK_OPTION == respuesta)) {
					System.out.println("");
				} else {
					JOptionPane.showMessageDialog(null, "programa finalizado");
					cerrar = false;
				}
			}

		}
	}
}
