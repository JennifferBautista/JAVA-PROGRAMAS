package policia;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad=0; 
		int cumplea�os=0;
		policia infraccion;
		infraccion = new policia(velocidad,cumplea�os);
		System.out.print(infraccion.condicion(velocidad,cumplea�os));

	infraccion  = null;
    System.gc();
    }

}
