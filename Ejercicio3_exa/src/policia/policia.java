package policia;

import javax.swing.JOptionPane;

public class policia {
	 int velocidad;
	 int cumplea�os;
     
     public policia(int velocidad, int cumplea�os){
     	this.velocidad = velocidad;	
     	this.cumplea�os = cumplea�os;	
     }
     public int get_velocidad()
 	{
 		return this.velocidad;
 	}
 	public void set_velocidad(int velocidad){
 		this.velocidad = velocidad;
 	}
    public int get_cumplea�os()
  	{
  		return this.cumplea�os;
  	}
  	public void set_cumplea�os(int cumplea�os){
  		this.cumplea�os = cumplea�os;
  	}
  	
 	public boolean condicion(int velocidad, int cumplea�os){
 		int resp; 
 		int resp2;
 		//String resp3;
 		resp=JOptionPane.showConfirmDialog(null,"Estas de cumplea�os?");
 		resp2=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESAR VELOCIDAD"));
 		if(resp!= 1){
 			System.out.println("SU VEOCIDAD SERA EL DOBLE EN TODAS LAS INFRACCIONES");
 			return true;
 	}
 		else{	
 			if(resp2!=0)
 			    	if(resp2<=60)
 				System.out.println("No hay multa, siga");}
 					{if(resp2>60) 
 						if(resp2<=80)
 						System.out.println("Tiene una multa peque�a");}
 							{if(resp2>=81)
 								System.out.println("Tiene una multa grande");}
 			return false;
 					
 			} 			
 		
 	
public void finalize(){
	JOptionPane.showMessageDialog(null,"El programa se va a cerrar");
}
}

