package calculadora;

import javax.swing.*;
public class main {
		public static void main(String[] args) {
			float num_1;
			float num_2;
			
			num_1=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese numero1"));
			num_2=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese numero2"));
			calculadora cal = new calculadora (num_1 , num_2);
					cal.suma();
					cal.resta();
					cal.multiplicacion();
					cal.division();
					cal.raiz_cuadrada(cal.get_num_1());
					cal.raiz_cuadrada(cal.get_num_2());
					cal.seno(cal.get_num_1());
					cal.seno(cal.get_num_2());
					cal.coseno(cal.get_num_1());
					cal.coseno(cal.get_num_2());
					cal.tangente(cal.get_num_1());
					cal.tangente(cal.get_num_2());
		}
	}
