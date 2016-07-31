import javax.swing.JOptionPane;

public class autos {

private int centro; 
private String modelo1="Aveo Family ||Precio: $ 10.000", modelo2="KIA 2016 ||Precio: $ 12.500", modelo3="FORD||Precio: $ 15.600", modelo4="Toyota HDF  ||Precio: $ 18.200";
private int precio1=10000, precio2=12500,precio3=15600, precio4=18200;

	
public autos()
{
	
}

public String getModelo1() {
	return modelo1;
}

public void setModelo1(String modelo1) {
	this.modelo1 = modelo1;
}

public String getModelo2() {
	return modelo2;
}

public void setModelo2(String modelo2) {
	this.modelo1 = modelo2;
}
public String getModelo3() {
	return modelo3;
}

public void setModelo3(String modelo3) {
	this.modelo3 = modelo3;
}
public String getModelo4() {
	return modelo4;
}

public void setModelo4(String modelo4) {
	this.modelo4 = modelo4;
}


public int getCentro() {
	return centro;
}

public void setCentro(int centro) {
	this.centro = centro;
}


public double getPrecio1() {
	return precio1;
}

public void setPrecio1(int precio1) {
	this.precio1 = precio1;
}

public double getPrecio2() {
	return precio2;
}

public void setPrecio2(int precio2) {
	this.precio2 = precio2;
}

public double getPrecio3() {
	return precio3;
}

public void setPrecio3(int precio3) {
	this.precio3 = precio3;
}

public double getPrecio4() {
	return precio4;
}

public void setPrecio4(int  precio4) {
	this.precio4 = precio4;
}

double D1c1 = 0, D1c2= 0, D1c3= 0, D1c4= 0;
double D2c1 = 0, D2c2= 0, D2c3= 0, D2c4= 0;
double D3c1 = 0, D3c2= 0, D3c3= 0, D3c4= 0;
double D4c1 = 0, D4c2= 0, D4c3= 0, D4c4= 0;
int contador;
int c1=0, c2=0, c3=0, c4 = 0;

double ac1 = 0, ac2 = 0, ac3 = 0, ac4 =0; 
public void ingresar(){
	int op;
	contador=-1;
	do{
		contador++;
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"1.- Aveo Family"
				+ "\n2.-Kia 2016"
				+"\n3.-FORD F150"
				+"\n4.- Toyota HDF"
				+"\n5.-Salir"
				+"\n\nSeleccione su opcion..."));
		switch(op)
		{
		case 1:
			c1++;	int op2;
			
			op2= Integer.parseInt(JOptionPane.showInputDialog("\n1.-Distribuidora Norte"
																+"\n2.-Distribuidora Sur"
																+"\n3.-Distribuidora Este"
																+"\n4.-Distribuidora Oeste"));
			switch(op2){
			case 1:
				
				System.out.println("Distribuidora 1");
				D1c1 += getPrecio1();
				break;
				
			case 2: 
				
				System.out.println("Distribuidora 2");
				D2c1 += getPrecio1();
				break;
				
			case 3: 	
				
				System.out.println("Distribuidora 3");
				D3c1 += getPrecio1();
				break;
				
			case 4:
				
				System.out.println("Distribuidora 4");
				D4c1 += getPrecio1();
				break;
			}
			System.out.println("Nombre del Vehiculo: "+ getModelo1());
			ac1 += getPrecio1();
			break;
	
		case 2:
			c2++;	int op3;
			
			op3= Integer.parseInt(JOptionPane.showInputDialog("\n1.-Distribuidora Norte"
					+"\n2.-Distribuidora Sur"
					+"\n3.-Distribuidora Este"
					+"\n4.-Distribuidora Oeste"));
			switch(op3){
			case 1:
				
				System.out.println("Distribuidora 1");
				D1c2 += getPrecio2();
				break;
				
			case 2: 
				
				System.out.println("Distribuidora 2");
				D2c2 += getPrecio2();
				break;
				
			case 3: 	
				
				System.out.println("Distribuidora 3");
				D3c2 += getPrecio2();
				break;
				
			case 4:
				
				System.out.println("Distribuidora 4");
				D4c2 += getPrecio2();
				break;
			}
			System.out.println("Nombre del Vehiculo: "+ getModelo2());
			ac2 += getPrecio2();
			 
			break;
	
		case 3: 
			c3++;	int op4;
			op4= Integer.parseInt(JOptionPane.showInputDialog("\n1.-Distribuidora Norte"
					+"\n2.-Distribuidora Sur"
					+"\n3.-Distribuidora Este"
					+"\n4.-Distribuidora Oeste"));
			switch(op4){
			case 1:
				System.out.println("Distribuidora 1");
				D1c3 += getPrecio3();
				break;
				
			case 2: 
				
				System.out.println("Distribuidora 2");
				D2c3 += getPrecio3();
				break;
				
			case 3: 	
				
				System.out.println("Distribuidora 3");
				D3c3 += getPrecio3();
				break;
				
			case 4:
				
				System.out.println("Distribuidora 4");
				D4c3 += getPrecio3();
				break;
			}
			System.out.println("Nombre del Vehiculo: "+ getModelo3());
			ac3 += getPrecio3();
			 
			break;
	
		case 4: 
			c4++;	int op5;
			
			op5= Integer.parseInt(JOptionPane.showInputDialog("\n1.-Distribuidora Norte"
					+"\n2.-Distribuidora Sur"
					+"\n3.-Distribuidora Este"
					+"\n4.-Distribuidora Oeste"));
			switch(op5){
			case 1:
				System.out.println("Distribuidora 1");
				D1c4 += getPrecio4();
				break;
				
			case 2: 
				System.out.println("Distribuidora 2");
				D2c4 += getPrecio4();
				break;
				
			case 3: 	
				System.out.println("Distribuidora 3");
				D3c4 += getPrecio4();
				break;
				
			case 4:
				System.out.println("Distribuidora 4");
				D4c4 += getPrecio4();
				break;
			}
			System.out.println("Nombre del Vehiculo: "+ getModelo4());
			ac4 += getPrecio4();
			
			break;
			
		}
		}while(op!=5);


	}
public void ventaTotal(){
	
	JOptionPane.showMessageDialog(null,"Ventas total: "+ contador+ "\nMonto total: " +(ac1+ac2+ac3+ac4));
}

public void mostrar_por_centrodedistribucion()
{
	JOptionPane.showMessageDialog(null, "\nTOTAL VENTAS POR CENTRO DE DISTRIBUCION \n "
			+ "1.DISTRIBUCION NORTE->Total ventas-> "+(D1c1+D1c2+D1c3+D1c4)+"\n"
			+ "2.DISTRIBUCION SUR->Total ventas-> "+(D2c1+D2c2+D2c3+D2c4)+"\n"
			+ "3.DISTRIBUCION ESTE->Total ventas-> "+(D3c1+D3c2+D3c3+D3c4)+"\n"
			+ "4.DISTRIBUCION OESTE->Total ventas-> "+(D4c1+D4c2+D4c3+D4c4));


}
public void mostrar_porcentaje_por_centro(){
	JOptionPane.showMessageDialog(null, "\nTOTAL PORCENTAJES DE MODELOS POR CENTRO DE DISTRIBUCION \n "
			+ "1.Aveo Family->Porcentaje-> "+(c1*100/contador)+ "%"+"\n"
			+ "2.KIA->Porcentaje->"+(c2*100/contador)+ "%"+"\n"
			+ "3.FORD->Porcentaje-> "+(c3*100/contador)+ "%"+"\n"
			+ "4.Toyota HDF->Porcentaje-> "+(c4*100/contador)+ "%");
}

}
