/*Dado un numero entero n, devolver la diferencia absoluta entre n y 21, con la exepcion de retorno doble de la diferencia absoluta si n es mayor a 21 */
package Diferencia;

public class Diferencia_Absoluta {
	int n;

	public Diferencia_Absoluta(int n) {
		this.n= n;
	}

	public int get_n()
	{
		return this.n;
	}
	public void set_n(int n){
		this.n = n;
	}
	
	public int resta(){
		if(this.n<21){
			return Math.abs(this.n-21);
		}
		else{return (this.n-21)*2;}
					
	}
}


	
