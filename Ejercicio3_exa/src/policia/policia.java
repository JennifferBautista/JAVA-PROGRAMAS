package policia;

import javax.swing.JOptionPane;

public class policia {
	 int velocidad;
	 int cumpleaños;
     
     public policia(int velocidad, int cumpleaños){
     	this.velocidad = velocidad;	
     	this.cumpleaños = cumpleaños;	
     }
     public int get_velocidad()
 	{
 		return this.velocidad;
 	}
 	public void set_velocidad(int velocidad){
 		this.velocidad = velocidad;
 	}
    public int get_cumpleaños()
  	{
  		return this.cumpleaños;
  	}
  	public void set_cumpleaños(int cumpleaños){
  		this.cumpleaños = cumpleaños;
  	}
  	
 	public boolean condicion(int velocidad, int cumpleaños){
 		int resp; 
 		int resp2;
 		//String resp3;
 		resp=JOptionPane.showConfirmDialog(null,"Estas de cumpleaños?");
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
 						System.out.println("Tiene una multa pequeña");}
 							{if(resp2>=81)
 								System.out.println("Tiene una multa grande");}
 			return false;
 					
 			} 			
 		
 	
public void finalize(){
	JOptionPane.showMessageDialog(null,"El programa se va a cerrar");
}
}

