package Estudiantes;

import javax.swing.JOptionPane;

public class Ob_Estudiantes {
	private String matricula;
	private String nombres;
	private String materia;
	private double nota_parciales;
	private double nota_examen;
	
	public Ob_Estudiantes(String matricula, String nombres, String materia,double nota_parciales, double nota_examen){
		this.matricula = matricula;
		this.nombres = nombres;
		this.materia = materia;
		this.nota_parciales = nota_parciales;
		this.nota_examen=nota_examen;
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

	public double getNota_parciales() {
		return nota_parciales;
	}

	public void setNota_parciales(double nota_parciales) {
		this.nota_parciales = nota_parciales;
	}

	public double getNota_examen() {
		return nota_examen;
	}

	public void setNota_examen(double nota_examen) {
		this.nota_examen = nota_examen;
	}
	public void show_inf(){
		System.out.println("matricula->"+this.matricula+" | nombres->"+this.nombres+" | materia->"+this.materia+" | nota_parciales->"+this.nota_parciales+" | nota_examen->"+this.nota_examen);    
	}
	public void estudiantes_aprobados(){
		
	}
	



}
