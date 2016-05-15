package holamundo;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
	robot walle =  new robot();

	walle.set_nombre(JOptionPane.showInputDialog("Ingrese su nombre:"));
	System.out.println("NOMBRE: ");
	System.out.println(walle.get_nombre());
	walle.set_edad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:")));
	System.out.println("EDAD: ");
	System.out.print(walle.get_edad());
	
		
	}

}
