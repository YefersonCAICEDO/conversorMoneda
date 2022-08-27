package conversorUnidadeDeMedida;

import javax.swing.JOptionPane;

public class opcionesConversionUnidades {
	
	convertirUnidades tipodeconversion = new convertirUnidades();
	
public void convertirunidades(double valor){
	
		String opciones = (JOptionPane.showInputDialog(null,"Que unidades deseas convertir","menu",
				JOptionPane.PLAIN_MESSAGE, null, new Object []{"byte a kilobyte","kilobyte a megabyte",
						"megabyte a gigabyte","gigabyte a terabyte","terabyte a byte",
						"gigabyte a kilobyte","megabyte a kilobyte","terabyte a megabyte",
						"terabyte a gigabyte","megabyte a byte"}, 
				"seleccion")).toString();
		
		switch(opciones) {
		case "byte a kilobyte":
			tipodeconversion.byteaKilobyte(valor ," kilobyte");
			break;			
		case "kilobyte a megabyte":
			tipodeconversion.byteaKilobyte(valor ," Megabyte");
			break;					
		case "megabyte a gigabyte":
			tipodeconversion.byteaKilobyte(valor ," Gigabyte");
			break;					
		case "gigabyte a terabyte":
			tipodeconversion.byteaKilobyte(valor ," Terabyte");
			break;			
		case "terabyte a byte":
			tipodeconversion.terabyteaByte(valor, 1e+12, " byte");
			break;			
		case "gigabyte a kilobyte":
			tipodeconversion.terabyteaByte(valor,  1e+6, " kilobyte");
			break;			
		case "megabyte a kilobyte":
			tipodeconversion.terabyteaByte(valor, 1000, " kilobyte");
			break;
		case "terabyte a megabyte":
			tipodeconversion.terabyteaByte(valor, 1e+6, " Megabyte");
			break;
		case "terabyte a gigabyte":
			tipodeconversion.terabyteaByte(valor, 1000, " Gigabyte");
			break;
		case "megabyte a byte":
			tipodeconversion.terabyteaByte(valor, 1e+6, " Byte");
			break;
		}
		}
}
