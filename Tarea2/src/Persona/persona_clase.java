package Persona;

public class persona_clase {
	String ceduladeidentidad;
	String nombre;
	String apellidos;
	int fechanacimiento;
	String telefono;
	String lugaresidencia;
	int casado;

    public persona_clase(String cedulaidentidad, String nombre, String apellidos, int fechanacimiento, String telefono, String lugaresidencia, int casado)
    {
    	this.ceduladeidentidad = cedulaidentidad;
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.fechanacimiento = fechanacimiento;
    	this.telefono = telefono;
    	this.lugaresidencia = lugaresidencia;
    	this.casado = casado;
    }
    
    
    public String get_ceduladeidentidad(){
		return ceduladeidentidad; 
	}
	
	public void set_ceduladeidentidad(String ceduladeidentidad){
		this.ceduladeidentidad =  ceduladeidentidad; 
	}
	
	
	public String get_nombre(){
		return nombre; 
	}
	
	public void set_nombre(String nombre){
		this.nombre =  nombre; 
	}
	
	
	public String get_apellidos(){
		return apellidos; 
	}
	
	public void set_apellidos(String apellidos){
		this.apellidos =  apellidos; 
	}
	
	
	public int get_fechanacimiento(){
		return fechanacimiento; 
	}
	
	public void set_fechanacimiento(int fechanacimiento){
		this.fechanacimiento =  fechanacimiento; 
	}
	
	
	public String get_telefono(){
		return nombre; 
	}
	
	public void set_telefono(String telefono){
		this.telefono =  telefono; 
	}
	
	
	public String get_lugaresidencia(){
		return nombre; 
	}
	
	public void set_lugaresidencia(String lugaresidencia){
		this.lugaresidencia =  lugaresidencia; 
	}
	
	
	public int get_casado(){
		return casado; 
	}
	
	public void set_casado(int casado){
		this.casado =  casado; 
	}
	
	
	public void vive_Esmeraldas(String lugaresidencia){
		if(lugaresidencia=="ESMERALDAS"){
			System.out.println("Vive en Esmeraldas");
		}
		else{
			System.out.println("No vive en Esmeraldas");
		}
	}
	
	public void mas_30(int fechanacimiento){
		int anioactual=2016;
		int edad;
		edad= anioactual - fechanacimiento;
		if(edad > 30){
			System.out.println("ES MAYOR DE 30 AÑOS ");
		}
		else{
			System.out.println("ES MENOR DE 30 AÑOS ");
		}
	}
	
	public void Casado(int casado) {
		int si = casado;
		if(si == 1){
			System.out.println("ES CASADO ("+Integer.toString(si)+")\n");
		}
		else{
			if(si == 0){
				System.out.println("NO ES CASADO ("+Integer.toString(si)+")\n");
			}
		}
	 }
	
	public String mostrarDatos(persona_clase persona){
        String datos="DATOS: \n";
        datos+=persona.nombre +"\n";
        datos+=persona.apellidos+"\n";
        return datos;
    }
}