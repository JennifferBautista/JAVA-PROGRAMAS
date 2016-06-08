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
		resp=0;
		resp= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
			if(( 1<= resp)&& (resp<=12)){
					System.out.println(vecMeses[resp-1]);
					for(int x=1; x<=12; x++){
						devolver_Nombre(x);
			}}
			else
				System.out.println("INGRESE DE NUEVO, NUMERO DE MES INCORRECTO");

			}
}