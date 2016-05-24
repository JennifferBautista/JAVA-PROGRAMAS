package Descanso;

import javax.swing.JOptionPane;

public class Descansar {
        int vacaciones,dia_semana;
        
        public Descansar(int vacaciones, int dia_semana){
        	this.vacaciones = vacaciones;
        	this.dia_semana = dia_semana;	
        }
        public int get_vacaciones()
    	{
    		return this.vacaciones;
    	}
    	public void set_vacaciones(int vacaciones){
    		this.vacaciones = vacaciones;
    	}
    	public int get_dia_semana()
    	{
    		return this.dia_semana;
    	}
    	public void set_dia_semana(int dia_semana){
    		this.dia_semana = dia_semana;
    	}
    	public boolean condicion(int vacaciones, int dia_semana){
    		int resp,resp2;
    		resp=JOptionPane.showConfirmDialog(null,"Estas en dia de semana?");
    		resp2=JOptionPane.showConfirmDialog(null,"Estas en vacaciones?");
    		if(resp!= 0 && resp2!=1){
    	System.out.println("Puesdes descansar");
    		return true;}
    		else{
    	System.out.println("No,Puesdes descansar");
    		return false;}
    			
    		
    	}
    	
}
