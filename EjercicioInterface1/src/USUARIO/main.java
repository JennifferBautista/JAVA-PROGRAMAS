package USUARIO;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User correo = new User();
		for(int x=0; x<4; x++){
		//while(correo.verificaCorreo()==false){
		correo.setEmail(JOptionPane.showInputDialog("Ingrese su Correo: "));
		System.out.println("PERSONA\t\t\tCORREO\t\t\tCONTRASEÑA\t" );
		System.out.println((x+1)+") Su correo: " +correo.getEmail()+" es: "+correo.verificaCorreo()+"| "+correo.generar_contraseña());
		correo.setContraseña(correo.generar_contraseña());
		System.out.println("TIPO DE CONTRASEÑA" );
		if(correo.fuerte_contraseña()==true)
			System.out.println("Fuerte");
		else
			System.out.println("Debil");
			
		//}
		}
	}

}
