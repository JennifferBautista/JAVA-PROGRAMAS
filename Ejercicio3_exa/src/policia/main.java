package policia;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad=0; 
		int cumpleaños=0;
		policia infraccion;
		infraccion = new policia(velocidad,cumpleaños);
		System.out.print(infraccion.condicion(velocidad,cumpleaños));

	infraccion  = null;
    System.gc();
    }

}
