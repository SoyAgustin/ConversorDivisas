package mx.com.gui;
import javax.swing.JOptionPane;

public class Moneda {
	
	public static void main(String[] args) {
		
		JOptionPane.showInternalMessageDialog(null, "Moneda base: Pesos mexicanos (MXN)");
		
		
		String opciones [] = {"Dolar (US)","Euro (EU)","Libra Esterlina (GBP)","Yen (JPY)","Won(KRW)"};
		
        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona a que moneda quieres convertir", "Menú del conversor de temperatura", 3, null, opciones, args);
        
        System.out.println(seleccion);
    }
}
