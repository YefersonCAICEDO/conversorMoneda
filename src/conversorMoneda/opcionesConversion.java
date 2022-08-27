package conversorMoneda;

import javax.swing.*;

public class opcionesConversion {

	convertirMonedas tipoMoneda = new convertirMonedas();

	public void convertirMonedas(double valor) {

		String opciones = (JOptionPane.showInputDialog(null, "Que deseas convertir", "menu", JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] { "Pesos a dolar", "Pesos a Euros", "Pesos a libras Esterlinas", "Pesos a yen Japones",
						"Pesos a Won sul-coreano", "Dolar a Pesos", "Euros a Pesos", "Libras Esterlinas a Pesos",
						"Yen Japones a Pesos", " Won sul-coreano a Pesos " },
				"seleccion")).toString();

		switch (opciones) {
		case "Pesos a dolar":
			tipoMoneda.pesosaDolar(valor, 4391.33, " Dolares");
			break;
		case "Pesos a Euros":
			tipoMoneda.pesosaDolar(valor, 4300, " Euros");
			break;
		case "Pesos a libras Esterlinas":
			tipoMoneda.pesosaDolar(valor, 5159.38, " Libras Esterlinas");
			break;
		case "Pesos a yen Japones":
			tipoMoneda.pesosaDolar(valor, 31.97, " Yen Japones");
			break;
		case "Pesos a Won sul-coreano":
			tipoMoneda.pesosaDolar(valor, 3.28, " Won Sul Coreano");
			break;
		case "Dolar a Pesos":
			tipoMoneda.dolaraPesos(valor, 4391.33, " Pesos");
			break;
		case "Euros a Pesos":
			tipoMoneda.dolaraPesos(valor, 4300, " Pesos");
			break;
		case "Libras Esterlinas a Pesos":
			tipoMoneda.dolaraPesos(valor, 5159.38, " Pesos");
			break;
		case "Yen Japones a Pesos":
			tipoMoneda.dolaraPesos(valor, 31.97, " Pesos");
			break;
		case "Won sul-coreano a Pesos ":
			tipoMoneda.dolaraPesos(valor, 3.28, " Pesos");
			break;

		}
	}
}
