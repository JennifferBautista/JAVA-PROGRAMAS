package Figura;

import javax.swing.JOptionPane;

public class main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	figura rectangulo = new figura();
	rectangulo.set_alto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura:")));
	System.out.println("ALTO: ");
	System.out.println(rectangulo.get_alto());		
	rectangulo.set_ancho(Integer.parseInt(JOptionPane.showInputDialog("Ingrese ancho:")));
	System.out.println("ANCHO: ");
	System.out.println(rectangulo.get_ancho());
	System.out.println("FIGURA:");
	rectangulo.figur_rec(rectangulo.get_alto(), rectangulo.get_ancho());		

}
}

