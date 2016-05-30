package mayusculas;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mayuscula convertir = new mayuscula();
	
		convertir.set_cadena(JOptionPane.showInputDialog("FRASE INGRESADA: "));
		JOptionPane.showMessageDialog(null,"FRASE NUEVA: ");
		JOptionPane.showMessageDialog(null,convertir.mayusculas() );
	
    convertir  = null;
    System.gc();
    }
		
}
