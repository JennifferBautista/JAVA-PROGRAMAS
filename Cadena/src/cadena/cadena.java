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
	
}