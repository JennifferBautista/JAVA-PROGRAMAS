package USUARIO;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User correo = new User();
		for(int x=0; x<4; x++){
		//while(correo.verificaCorreo()==false){
		correo.setEmail(JOptionPane.showInputDialog("Ingrese su Correo: "));
		System.out.println("PERSONA\t\t\tCORREO\t\t\tCONTRASE�A\t" );
		System.out.println((x+1)+") Su correo: " +correo.getEmail()+" es: "+correo.verificaCorreo()+"| "+correo.generar_contrase�a());
		correo.setContrase�a(correo.generar_contrase�a());
		System.out.println("TIPO DE CONTRASE�A" );
		if(correo.fuerte_contrase�a()==true)
			System.out.println("Fuerte");
		else
			System.out.println("Debil");
			
		//}
		}
	}

}
