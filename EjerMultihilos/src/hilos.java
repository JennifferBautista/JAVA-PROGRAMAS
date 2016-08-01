import java.io.BufferedReader;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import  java.lang.Runnable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class hilos implements Runnable {

	
	private String nombre = null;
	private String matricula=null; 
	private String direccion = null; 
	private String ciudad=null;
	private String esmeraldas="Guayaquil";
	private int edad=0; 
	private Thread fichero; 
	private Thread xml; 
	BufferedReader in;
	
	public void run()  {
	try {
    	lecturaFicheroGuayaquil();
    	System.out.println("================PERSONAS MAS DE 40=============");
    	lecturaFicheroMayor_40();
	} catch (IOException e) {	
		e.printStackTrace();
	}   
   }
	
	public void lecturaFicheroGuayaquil() throws IOException{
		try{
			in = new BufferedReader(new FileReader("personas.txt"));
			String line; 
			while ((line=in.readLine())!= null){
				 sacarDatosGuayaquil(line);
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "NO EXISTE","ATENCION",JOptionPane.WARNING_MESSAGE);
			}
	}
	
	public void lecturaFicheroMayor_40() throws IOException{
		try{
			in = new BufferedReader(new FileReader("personas.txt"));
			String line; 
			while ((line=in.readLine())!= null){
				 sacarDatosMayor_40(line);
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "NO EXISTE PERSONA","ATENCION",JOptionPane.WARNING_MESSAGE);
			}
	}
	

	
	public void sacarDatosGuayaquil(String line){
		int aux=0;
		for(int x=0; x<line.length();x++){
			 if(line.substring(x,x+1).equals("|")){
				 aux++; 
				 if(aux==1){
			       this.matricula=line.substring(0,x);  		 
				 }
				 if(aux==2){
					 this.nombre=line.substring(this.matricula.length()+1,x); 
				 }
				 if(aux==3){
					 this.direccion=line.substring(this.matricula.length()+this.nombre.length()+2,x); 
				 }
				 if(aux==4){
					 this.ciudad=line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+3,x); 
					 this.edad=Integer.parseInt(line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+this.ciudad.length()+4));
				 }
			 }			  
		}
		guayaquil();
		
	}
	
	public void sacarDatosMayor_40(String line){
		int aux=0;
		for(int y=0; y<line.length();y++){
			 if(line.substring(y,y+1).equals("|")){
				 aux++; 
				 if(aux==1){
			       this.matricula=line.substring(0,y);  		 
				 }
				 if(aux==2){
					 this.nombre=line.substring(this.matricula.length()+1,y); 
				 }
				 if(aux==3){
					 this.direccion=line.substring(this.matricula.length()+this.nombre.length()+2,y); 
				 }
				 if(aux==4){
					 this.ciudad=line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+3,y); 
					 this.edad=Integer.parseInt(line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+this.ciudad.length()+4));
				 }
			 }			  
		}
		mayor40();
		
	}
	
	public void guayaquil(){
		if(this.esmeraldas.equals(this.ciudad))
			informacion(); 
	}
	
	public void mayor40(){
		if(this.edad>=40)
			informacion(); 
	}
	
	
	public void informacion(){
		System.out.println("Matricula: "+this.matricula+" Nombre: "+this.nombre+" Direccion: "+this.direccion+" Ciudad: "+this.ciudad+" Edad: "+this.edad);
	}
	
	 public void start () {
		    System.out.println("Iniciando");
		    if (fichero == null) {
		      fichero = new Thread (this);
		      fichero.start();
		    }
		   
		  }	

}

