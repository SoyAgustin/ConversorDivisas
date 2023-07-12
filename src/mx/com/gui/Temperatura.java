package mx.com.gui;

import javax.swing.JOptionPane;

public class Temperatura {
	public static void main(String[] args) {
			
			JOptionPane.showInternalMessageDialog(null, "Unidad de temperatura base: Celsius (°C)");
			
			String opciones [] = {"Kelvin (K)","Farenheith (°F)"};
			
	        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción a convertir", "Menú del conversor de temperatura", 3, null, opciones, args);
	        
	        System.out.println(seleccion);
    }
}
