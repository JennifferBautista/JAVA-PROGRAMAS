package cadena;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cadena frase = new cadena();
       
        frase.set_cadena(JOptionPane.showInputDialog("Ingrese una frase : "));
        if(frase.testCad())
        	JOptionPane.showMessageDialog(null, "VERDADERO");
        else
        	JOptionPane.showMessageDialog(null, "FALSO");
        
        frase = null;
        System.gc();
	}

	

}
