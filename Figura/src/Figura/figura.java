package Figura;

public class figura {
int ancho;
int alto;

	public int get_ancho(){
	return this.ancho; 
}

	public void set_ancho(int ancho){
	this.ancho = ancho ; 
}
	public int get_alto(){
		return this.alto; 
	}
	
	public void set_alto(int  alto){
		this.alto = alto ; 
	}	


	public void figur_rec ( int alto, int ancho){
		for (int i=0; i<alto; i++) 
		{
			for(int j=0; j<ancho;  j++){ 
		if ((i==0 || j==ancho-1) || (j==0 || i==alto-1))
			System.out.print( "* " );
			else
				System.out.print( "  " );
		}
		System.out.println(); 	
		}
		}
}

