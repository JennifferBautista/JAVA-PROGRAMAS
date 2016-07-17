
package XML;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class estudiantes {
	private String matricula; 
	private String nombres; 
	private String materia;
	private double nota_parcial;
	private double nota_examen;

	public estudiantes() {
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getMateria() {
	return materia;
}

public void setMateria(String materia) {
	this.materia = materia;
}

public double getNota_parcial() {
	return nota_parcial;
}

public void setNota_parcial(double nota_parcial) {
	this.nota_parcial = nota_parcial;
}

public double getNota_examen() {
	return nota_examen;
}

public void setNota_examen(double nota_examen) {
	this.nota_examen = nota_examen;
}

public void mostrar_estudiante(){
	System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.materia+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.nota_examen); 
	
}
public String ingresar_estudiantes(){
    	String nombres = JOptionPane.showInputDialog("Ingrese nombres completos");
    	String matricula = JOptionPane.showInputDialog("Ingrese su numero de matricula");
    	String materia = JOptionPane.showInputDialog("Ingresar Materia");
    	String nota_parcial = JOptionPane.showInputDialog("Ingrese su nota parcial");
    	String nota_examen = JOptionPane.showInputDialog("Ingrese su nota del examen final");
    	
    	return nombres+" "+matricula+" "+materia+" "+nota_parcial+" "+nota_examen; 
    }
	public void guardar_informacion(String ingresado) throws IOException{
			String direccion;
			direccion = main.class.getResource("C:/estudiantes.txt").toString();
			String ruta=direccion.substring(6, direccion.length());
			FileWriter edit = new FileWriter(ruta,true); 
			edit.write("\n"+ingresado);
			edit.close();
	}
	public void modificar(String ingresado) throws IOException{
		String direccion;
		direccion = main.class.getResource("C:/estudiantes.txt").toString();
		String ruta=direccion.substring(6, direccion.length());
		PrintWriter edit = new PrintWriter(ruta); 
		edit.write("\n"+ingresado);
		edit.close();
}

public void buscar_estudiante_matricula(String matricula){ 
	if ( matricula.equals(this.matricula)|| matricula.equals(this.nombres))
	mostrar_estudiante(); 
  }
public void buscar_estudiantes() throws IOException{
	String ma= JOptionPane.showInputDialog("Ingrese el numero de matricula: ");
	int aux=0;
	try{
		String ruta;
		ruta = main.class.getResource("estudiante.txt").toString();
		String ruta2=ruta.substring(6, ruta.length());
		BufferedReader read = new BufferedReader(new FileReader(ruta2));
		String line; 
		while ((line=read.readLine())!= null){  
			aux++; 
			lectura_estudiantes(line, aux);
			buscar_estudiante_matricula(ma); 
		}
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "NO EXISTE","ATENCION",JOptionPane.WARNING_MESSAGE);
		}
}


public void esudiantes_que_aprueban(){
	double aux;
	float aux2=0;
	if (this.nota_parcial>=22 &&this.nota_examen>=8)
    System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.materia+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.nota_examen); 
	if(this.nota_parcial>=10 && this.nota_parcial<=22){
		aux=(30)-(this.nota_parcial);
		if(this.nota_examen==aux2)
			System.out.println("Nombre: "+this.nombres+" | Matricula: "+this.matricula+" | Materia: "+this.materia+" | Nota parcial: "+this.nota_parcial+" | Nota examen: "+this.nota_examen); 
	}
	public void estudiantes() throws IOException {
		int aux=0;
		try{
			String direccion;
			direccion = main.class.getResource("C:/estudiantes.txt").toString();
			String ruta=direccion.substring(6, ruta.length());
			BufferedReader leer = new BufferedReader(new FileReader(ruta));
			String linea; 
			while ((linea=leer.readLine())!= null){  
				aux++; 
				lectura_estudiantes(linea, aux);
				esudiantes_que_aprueban();
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "No existe estudiante",JOptionPane.WARNING_MESSAGE);
			}
	}
}
//Lee el fichero
	public void lectura_fichero()throws IOException{
		int aux=0; 
		try{
			String direccion;
			direccion = main.class.getResource("C:/estudiantes.txt").toString();
			String ruta=direccion.substring(6, direccion.length());
			BufferedReader leer = new BufferedReader(new FileReader(ruta));
			String line; 
			while ((line=leer.readLine())!= null){  
				aux++; 
				lectura_estudiantes(line, aux); 
				mostrar_estudiante(); 
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "NO EXISTE","ATENCION",JOptionPane.WARNING_MESSAGE);
			}
	}

	private void lectura_estudiantes(String line, int aux) {
		// TODO Auto-generated method stub
		
	}
	public void buscar_editar(String dato,String line, int aux) throws IOException{ 
		int op;
		int pos=0; 
		String aux2;
		if (dato.equals(this.matricula)||dato.equals(this.nombres)){		
		mostrar_estudiante();
		do{
		 op = Integer.parseInt(JOptionPane.showInputDialog
		("1: Editar nombre"+"\n"+
		"2: Editar matricula"+"\n"+
		"3: Editar materia"+"\n"+
		"4: Editar nota parcial"+"\n"+
		"5: Editar nota examen final"+"\n"+
		"6: Salir"));
		switch(op){
		case 1:
			aux2=JOptionPane.showInputDialog("Ingrese el nuevo nombre y apellido" );
		    this.nombres=aux2;
		    System.out.println("Estudiante Modificado");
		    mostrar_estudiante(); 
		break;
		case 2:
		    aux2=JOptionPane.showInputDialog("Ingrese la nueva matricula" );  	
			this.matricula=aux2;
		    mostrar_estudiante(); 
		break;
		case 3:
			aux2=JOptionPane.showInputDialog("Ingrese la nueva materia" );  	
			this.materia=aux2;
		    mostrar_estudiante(); 
		break;
		case 4:
			aux2=JOptionPane.showInputDialog("Ingrese la nueva nota parcial" );  	
			this.nota_parcial=Float.parseFloat(aux2);
		    mostrar_estudiante(); 
		break;
		case 5:
			aux2=JOptionPane.showInputDialog("Ingrese la nueva nota del examen" );  	
			this.nota_examen=Float.parseFloat(aux2);
		    mostrar_estudiante(); 
		break;
		case 6:
		    JOptionPane.showMessageDialog(null, "Cerrando el  programa.....!!");
		break;
		}
			
		}while(op!=6); 
		}
	}
	public void editar() throws IOException{
		String editar= JOptionPane.showInputDialog("Ingrese el dato a editar: ");
		int aux=0;
		try{
			String direccion;
			direccion= main.class.getResource("estudiante.txt").toString();
			String ruta=direccion.substring(6,direccion.length());
			BufferedReader leer = new BufferedReader(new FileReader(ruta));
			String linea; 
			while ((linea=leer.readLine())!= null){  
				aux++; 
				lectura_estudiantes(linea,aux);
				buscar_editar(editar,linea,aux); 
			}
			}catch(FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "No existe estudiante","error", JOptionPane.WARNING_MESSAGE);
			}
	}

	public void aprobados() {
		// TODO Auto-generated method stub
		
	}
    
}