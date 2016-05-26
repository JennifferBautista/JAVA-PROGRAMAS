package cadena;

public class cadena {
    int posicion;
    String cadena ;
    
    public cadena(int n, String cad){
    	this.posicion = n;
    	this.cadena = cad;	
    }
    public int get_n()
	{
		return this.posicion;
	}
	public void set_n(int n){
		this.posicion = n;
	}
	public String get_cad(){
		return this.cadena;
	}
	public void set_cadena(String cad){
		this.cadena = cad;
	}
	public static String deleteChar(int n, String cad){
		String cad2 = cad.substring(0, n);
		String cad3 = cad.substring(n + 1);
		String cad4 = cad2 + cad3;
		return cad4;
	}
}