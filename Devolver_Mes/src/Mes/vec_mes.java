package Mes;

import javax.swing.JOptionPane;

public class vec_mes {


	private String vecMeses [] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

	int resp;

	public vec_mes( int resp){
		     this.resp=resp;
	}
		public int get_resp()
		{
			return this.resp;
		}
		public void set_n(int resp){
		this.resp = resp;
		}
		public void devolver_Nombre(int resp){
		int aux=0;
		resp= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
			if(( resp<= 12)&& (resp>=1)){
					
					for(int x=0; x<12; x++){
						aux=resp-1;
						System.out.println(vecMeses[aux]);


					}}
}
}