package policia;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad=0; 
		int cumpleaņos=0;
		policia infraccion;
		infraccion = new policia(velocidad,cumpleaņos);
		System.out.print(infraccion.condicion(velocidad,cumpleaņos));

	infraccion  = null;
    System.gc();
    }

}
