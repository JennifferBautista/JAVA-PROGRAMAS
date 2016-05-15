package Rombo;

import javax.swing.JOptionPane;

public class main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    rombo rombo = new rombo();
	rombo.set_size(Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño:")));
	System.out.println("TAMAÑO: ");
	System.out.println(rombo.get_size());		
	
	System.out.println("FIGURA:");
	rombo.asterisco(rombo.get_size());		

}
}