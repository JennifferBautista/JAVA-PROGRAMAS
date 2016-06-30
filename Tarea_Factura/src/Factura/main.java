package Factura;
import javax.swing.JOptionPane;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int opcion=45;
         factura arr []=new factura[3];
        int c=0, op=0,iv=0;
       
         while((op<1)||(op>2)){
   			op=Integer.parseInt(JOptionPane.showInputDialog("¿PERTENCES A UNA DE LAS PROVINCIAS AFECTADAS POR EL TERREMOTO? \n 1.SI\n 2.NO\nIngrese opcion: "));
   			{if (op==1)
   				iv=12;
   			else
   				iv=14;}
           }
         opcion=Integer.parseInt(JOptionPane.showInputDialog("1.INGRESAR NUEVO PRODUCTO A LA FACTURA\n 2. MOSTRAR PRODUCTOS DE FACTURA\n 3.CALCULAR TOTAL\n 4.LIMPIAR FACTURA\n 5.SALIR\n¿QUE OPCION DESEA?"));       
         while(!(opcion==5)){
            switch (opcion){ 
                case 1:

                  
			        arr[c].setProductos(JOptionPane.showInputDialog("Ingrese un producto: "));
				    arr[c].setCosto(Float.parseFloat(JOptionPane.showInputDialog("Costo del producto: ")));
			        arr[c].setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos: ")));
			        c++;
                		break;
                case 2:
                	for (int x=0; x<arr.length; x++){
						arr[x].show_inf();
						}
                    break;                
                case 3:

			       float sub=0,iva=0,total=0;
			        
			        for(int x=0;x<c;x++)
			        {
			        	sub=sub+arr[x].subtotal(arr[x].getCosto(),arr[x].getCantidad());
			        	iva=iva+arr[x].iva(iv, arr[x].subtotal(arr[x].getCosto(), arr[x].getCantidad())); 
			        }
			        total=total+sub+iva;	
			        System.out.println("SUBTOTAL "+sub);
			        System.out.println("IVA "+iv+"% : "+iva);
			        System.out.println("TOTAL: "+total);
                    
                    break;   
                    
                case 4:
                	for (int x =0;x<arr.length; x++)
                		   arr[x] = null;
                	break;
                case 5:
                	JOptionPane.showMessageDialog(null,"SE ESTA CERRANDO-Gracias por sus compras!");
    				break;

            }   
         } 
	}
}
