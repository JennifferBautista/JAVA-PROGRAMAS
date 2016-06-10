package Estudiantes;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=45;
		Ob_Estudiantes []items = new Ob_Estudiantes [5];
		items[0] = new Ob_Estudiantes("9803","BAUTISTA JENNIFFER","ECUACIONES",26,15.0);
		items[1] = new Ob_Estudiantes("9824","PALACIOS PIERO","ESTADISTICA",20,16.50);
		items[2] = new Ob_Estudiantes("9732","RECALDE CRISTHIAN","ESTRUCTURA",10,19.75);
		items[3] = new Ob_Estudiantes("9845","CEDEÑO KAROL","PROGRAMCION",19,18.50);
		items[4] = new Ob_Estudiantes("9930","HERNANDEZ ANTHONY","ESTRUCTURA 2",22,18.0);
		
		while(!(op==4)){
		op=Integer.parseInt(JOptionPane.showInputDialog("1.LISTA DE ESTUDIANTES\n 2. BUSCAR ESTUDIANTE POR MATRICULA\n 3.MOSTRAR ESTUDIANTES QUE APRUEBEN\n 4.SALIR\n¿QUE OPCION DESEA?"));
			switch (op){
			case 1: 
						for (int x=0; x<items.length; x++){
								items[x].show_inf();
			}
			break;
			case 2: 
				String matricula = JOptionPane.showInputDialog("Ingrese numero de matricula");
					boolean bandera=false;
							for (int x=0; x<items.length; x++){
								if(matricula.equals(items[x].getMatricula())){
										items[x].show_inf();
										bandera=true;
								}
							}	
							{if (!bandera)
								JOptionPane.showMessageDialog(null,"NO EXISTE EL ALUMNO");
					}
			break;
			case 3: 
				for (int x=0; x<items.length; x++){
					items[x].show_inf();
			}
			case 4:
				JOptionPane.showMessageDialog(null,"SE ESTA CERRANDO");
				break;
			
		}
		
	}
}
}
