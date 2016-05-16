package calculadora;

import javax.swing.JOptionPane;

public class calculadora {
		float num_1, num_2;

public calculadora(float num_1, float num_2){
	this.num_1=num_1;
	this.num_2=num_2;
}

	public float get_num_1(){
		return this.num_1;
}
	public void set_num_1(float num_1){
		this.num_1 = num_1;
}
	public float get_num_2(){
		return this.num_2;
}
	public void set_num_2(float num_2){
		this.num_2 = num_2;
}
	public void suma()
{
	float result = this.num_1 + this.num_2;
	JOptionPane.showMessageDialog(null, "La suma es: " +Float.toString(result));
}
	public void resta(){
		float result = this.num_1 - this.num_2;
		JOptionPane.showMessageDialog(null, "La resta es: " +Float.toString(result));
	}
	public void multiplicacion(){
		float result = this.num_1 * this.num_2;
		JOptionPane.showMessageDialog(null, "La multiplicacion es: " +Float.toString(result));
	}
	public void division(){
		float result = this.num_1 / this.num_2;
		JOptionPane.showMessageDialog(null, "La division es: " +Float.toString(result));
	}
	
	public void raiz_cuadrada(float num){
		float raiz = (float)Math.sqrt(num);
		JOptionPane.showMessageDialog(null, "La sraiz cuadrada de: " +Float.toString(num)+"es ="+Float.toString(raiz));
		
	}
	public void seno(float num){
		float sen = (float)Math.sin(num);
		JOptionPane.showMessageDialog(null, "El seno de: " +Float.toString(num)+"es ="+Float.toString(sen));
		
	}
	public void coseno(float num){
		float cos = (float)Math.cos(num);
		JOptionPane.showMessageDialog(null, "El coseno de: " +Float.toString(num)+"es ="+Float.toString(cos));
		
	}
	public void tangente(float num){
		float tan = (float)Math.tan(num);
		JOptionPane.showMessageDialog(null, "El tangente de: " +Float.toString(num)+"es ="+Float.toString(tan));
		
	}
}