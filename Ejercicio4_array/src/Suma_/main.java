package Suma_;

import javax.swing.JOptionPane;

import Suma_.suma_;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma_ numero = new suma_(JOptionPane.showInputDialog("Ingrese valor A"),
		JOptionPane.showInputDialog("Ingrese valor B"),
		JOptionPane.showInputDialog("Ingrese valor C"),
		JOptionPane.showInputDialog("Ingrese valor D"));
		numero.comparar();
		JOptionPane.showMessageDialog(null,"El valor total es: "+ 
		numero.Tsuma());
		

        numero  = null;
        System.gc();	
		
		
	
	}

}
