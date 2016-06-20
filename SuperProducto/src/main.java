import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		Productos []productos = new Productos [6];
		System.out.println ("***TODOS LOS PRODUCTOS***\n");
		productos[0] = new Productos ("2016", "12323456");
		ProductoFresco producto1 = new ProductoFresco ("20/11/2016", "122343532");
		producto1.setF_envasado("12/01/2015");
		producto1.setPais_origen("España");
		producto1.mostrarInformacionPFresco();
		productos[1] = new Productos ("20/11/2016", "122343532");
		ProductoFresco producto2 = new ProductoFresco ("2016", "122343532");
		producto2.setF_envasado("23/04/2015");
		producto2.setPais_origen("Ecuador");
		producto2.mostrarInformacionPFresco();
		
		productos[2] = new Productos ("2016","23345789");
		ProductoRefrigerado producto3 = new ProductoRefrigerado("21/04/2016","23345789");
		producto3.setCodigo_SA("12F34");
		producto3.mostrarInformacionPRefrigerado();
		productos[3] = new Productos ("2017","09478334");
		ProductoRefrigerado producto4 = new ProductoRefrigerado("03/01/2017","09478334");
		producto4.setCodigo_SA("45A22");
		producto4.mostrarInformacionPRefrigerado();

		productos[4] = new Productos ("2017","32839182");
		ProductoCongelado producto5 = new ProductoCongelado("23/01/2017","32839182");
		producto5.setTemperatura_recomendada("23ºC");
		producto5.mostrarInformacionPCongelado();
		productos[5] = new Productos ("2016","19347267");
		ProductoCongelado producto6 = new ProductoCongelado("09/09/2016","19347267");
		producto6.setTemperatura_recomendada("17ºC");
		producto6.mostrarInformacionPCongelado();
		System.out.println ("********************************************************\n");
		
		while(!(op==3)){
	op=Integer.parseInt(JOptionPane.showInputDialog("1.MOSTRAR PRODUCTOS QUE CADUCAN EL 2016\n 2. BUSCAR PRODUCTO POR NUMERO DE LOTE\n 3.SALIR\n¿QUE OPCION DESEA?"));
				switch (op){
				case 1: 
					boolean aux=false;
					String f_caducidad=JOptionPane.showInputDialog("Ingresar el año de caducidad");
							for (int x=0; x<productos.length; x++){
								if(f_caducidad.equals(productos[x].getF_caducidad())){
									productos[x].show_inf();
									aux=true;
							
								}	
								{if (!aux)
								JOptionPane.showMessageDialog(null,"NO EXISTE EL PRODUCTO");
								}
							}
				break;
				case 2: 
					String numero_lote = JOptionPane.showInputDialog("Ingrese Numero de Lote");
						boolean bandera=false;
								for (int x=0; x<productos.length; x++){
									if(numero_lote.equals(productos[x].getNumero_lote())){
											productos[x].show_inf();
											bandera=true;
									}
								}	
								{if (!bandera)
									JOptionPane.showMessageDialog(null,"NO EXISTE EL PRODUCTO");
						}
				break;
				case 3:
					JOptionPane.showMessageDialog(null,"SALIENDO DEL MENU");
					break;
				
			}
			
		}
	}
}
