package mx.com.gui;
import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {
		
		String [] opciones = {"Moneda","Temperatura"};
		
		String seleccion = (String) JOptionPane.showInputDialog(null, "Escoge el conversor", "Menú principal", 3, null, opciones, args);
		
		if(seleccion == "Moneda") {
			Moneda.main(args);
		}else {
			Temperatura.main(args);
		}
	}
}
