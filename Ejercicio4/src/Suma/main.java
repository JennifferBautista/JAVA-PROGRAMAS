package Suma;

import javax.swing.JOptionPane;
/*Desarrollar un programa en el que dado 4 valores a, b, c y d devuelva su suma. 

Sin embargo, si uno de los valores es igual a otro la suma de esos valores no se realiza.
presentar en pantalla un panel avisando que el programa se va a cerrar y realizar limpieza de memoria (usar finalize)*/

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suma numero = new suma();
		numero.setA(JOptionPane.showInputDialog("Ingrese valor A"));
		numero.setB(JOptionPane.showInputDialog("Ingrese valor B"));
		numero.setC(JOptionPane.showInputDialog("Ingrese valor C"));
		numero.setD(JOptionPane.showInputDialog("Ingrese valor D"));
		
		numero.comparar(numero.getA(),numero.getB(),numero.getC(),numero.getD());
		JOptionPane.showMessageDialog(null,"El valor total es: "+ 
		numero.getTotal());
		

        numero  = null;
        System.gc();
	}


}
