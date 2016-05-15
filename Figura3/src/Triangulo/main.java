package Triangulo;
import javax.swing.JOptionPane;
public class main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    triangulo triangulo = new triangulo();
	triangulo.set_size(Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño:")));
	System.out.println("TAMAÑO: ");
	System.out.println(triangulo.get_size());		
	
	System.out.println("FIGURA:");
	triangulo.asterisco(triangulo.get_size());		

}
}