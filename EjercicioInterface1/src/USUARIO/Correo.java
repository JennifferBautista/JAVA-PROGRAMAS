package USUARIO;

public interface Correo {
	void setEmail(String email);
	String getEmail();
	void setContrase�a(String contrase�a);
	String getContrase�a();
	String generar_contrase�a();
	void setLongitud_contrase�a(int longitud);
	int getLongitud_contrase�a();
	boolean verificaCorreo();
	public boolean fuerte_contrase�a();
	
}
