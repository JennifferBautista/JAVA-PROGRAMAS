package mayusculas;

import javax.swing.JOptionPane;

public class mayuscula {
	String cad;
	    public mayuscula(){
	    	this.cad = cad;	
	    }
		public String get_cad(){
			return this.cad;
		}
		public void set_cadena(String cadena){
			this.cad = cadena;
		}
		
		public String mayusculas(){
			String nexcad,nexcad2,nexcad3;
			if (this.cad.length() < 3 )
				this.cad.toUpperCase();
			else
			nexcad=cad.substring(0, cad.length()-3);
			nexcad2 = cad.substring(cad.length()-3);
			nexcad3= cad.substring(0, cad.length()-3) + (nexcad2.toUpperCase());
			return nexcad3;
		
		}
		public void finalize(){
			JOptionPane.showMessageDialog(null,"El programa se va a cerrar");

		}
		
}


 