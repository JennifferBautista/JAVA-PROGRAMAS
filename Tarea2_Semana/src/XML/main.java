package XML;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in); 
		estudiantes opcion = new estudiantes(); 
		int op ;  
		
		do{
		op = Integer.parseInt(JOptionPane.showInputDialog(""
				+"1 : Ingresar Estudiante\n"
				+"2 : Listar Estudiantes\n"
				+"3 : Buscar Estudiante por matricula\n"
				+"4 : Editar información de estudiante\n"
				+"5 : Mostrar Estudiantes que aprueban\n"
				+"6 : Guardar información\n"
				+"7 : Exportar información a XML\n"
				+"8 : Salir\n"));
		switch (op){
		case 1:
			System.out.println("INGRESAR ESTUDIANTES\n");
			opcion.ingresar_estudiantes();
			
		break; 
		case 2:
			System.out.println("----------------------------------------------------------------------");
		    opcion.lectura_fichero();
			 
		break;
		case 3:
			 opcion.buscar_estudiantes();
			 
		break;
		case 4:
		break;
		case 5:
		System.out.println("ESTUDIANTES QUE APRUEBAN\n");
		opcion.aprobados();
					
		break;
		case 6:
		break;
		case 7:
			
		break;
		case 8:
			System.out.println("CERRARAS EL PROGRAMA\n");
			JOptionPane.showMessageDialog(null, "Saliendo....");
		break;
		
		}
		}while(op!=8);

}
}
