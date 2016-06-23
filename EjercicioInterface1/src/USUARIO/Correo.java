package USUARIO;

public interface Correo {
	void setEmail(String email);
	String getEmail();
	void setContraseña(String contraseña);
	String getContraseña();
	String generar_contraseña();
	void setLongitud_contraseña(int longitud);
	int getLongitud_contraseña();
	boolean verificaCorreo();
	public boolean fuerte_contraseña();
	
}
