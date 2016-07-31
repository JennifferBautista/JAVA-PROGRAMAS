
import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     autos items=new autos();
		int op;
		do
	    {
	    	
		op=Integer.parseInt(JOptionPane.showInputDialog("MENU\n 1.Ingresar nuevo auto\n 2.Mostrar volumen de ventas total\n 3.Mostrar volumen de ventas por centro \n 4.Porcentaje de cada modelo por centro\n 5.SALIR  \nIngrese opcion: "));
		switch(op)
		{
		  case 1:
			        items.ingresar();
			        break;
		  
		  case 2:
			  items.ventaTotal();
			        break;
		  case 3:
			  items.mostrar_por_centrodedistribucion();
			        break;
		  case 4: 
		               items.mostrar_porcentaje_por_centro();      
			  break;
		  case 5: 
			  	default: System.out.println("\n***** Se esta cerrando el programa *****\n");
			  break;
			        
		}
	    }while(op!=5);
	    
		System.out.println("\n***** Fin del programa *****\n");
	    System.gc();
	}

	}


