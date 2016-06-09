package Contar_Vocales;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contar_vocales vocales = new contar_vocales(JOptionPane.showInputDialog("Ingrese una palabra"));
		vocales.show_inf();
	}

}
