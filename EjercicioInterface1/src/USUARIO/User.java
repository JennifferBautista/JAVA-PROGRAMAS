package USUARIO;

import java.util.Random;

public class User implements Correo {
	private int longitud = 9;
	private String contraseña;
	private String email;

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
		
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	@Override
	public String generar_contraseña() {
		String cadenaAleatoria = "";
		long milis = new java.util.GregorianCalendar().getTimeInMillis();
		Random r = new Random(milis);
		int x = 0;
		while ( x < longitud){
		char c = (char)r.nextInt(255);
		if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') || (c >='a' && c <='z')){
		cadenaAleatoria += c;
		x ++;
		}
	
		}
		return cadenaAleatoria;
		}

	
	@Override
	public void setLongitud_contraseña(int longitud) {
		// TODO Auto-generated method stub
		this.longitud=longitud;
	}
	@Override
	public int getLongitud_contraseña() {
		// TODO Auto-generated method stub
		return longitud;
	}
	@Override
	public boolean verificaCorreo() {
		// TODO Auto-generated method stub
		this.email=this.email.trim();
		boolean aux = false;
		int a = this.email.length() - 1;
		String letra, letra1 = "";
		try {
		for (int i = 0; 1 < a; i++) {
		letra = "" + this.email.charAt(i);
		if (letra.equals("@")) {
		a++;
		letra1 = this.email.substring(i, a);
		letra1=letra1.toLowerCase();
		if ((letra1.equals("@hotmail.com")) || (letra1.equals("@gmail.com"))||(letra1.equals("@ya hoo.com"))) {
		aux = true;
		break;
		}
		}
		}
		} catch (Exception e) {
		}
		return aux;
		
	}
	@Override
	public boolean fuerte_contraseña(){
		int aux1=0, aux2=0,aux3=0;
		for(int x=0;x <longitud; x++){
		if(getContraseña().charAt(x)>='A'&&getContraseña().charAt(x)<='Z')
			aux1++;
		else
			if(getContraseña().charAt(x)>='a'&&getContraseña().charAt(x)<='z')
				aux2++;
			else
				if(getContraseña().charAt(x)>='0'&&getContraseña().charAt(x)<='9')
					aux3++;}
		if((aux1>=2)&&(aux2>=1)&&(aux3>5))
            return true;
		else
			return false;
		
	}
	
	@Override
	public void setContraseña(String contraseña) {
		// TODO Auto-generated method stub
		this.contraseña=contraseña;
	}
	@Override
	public String getContraseña() {
		// TODO Auto-generated method stub
		return this.contraseña;
	}

}
