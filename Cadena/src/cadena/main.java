package cadena;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Jenniffer";
		int posicion = 15;
		System.out.println("FRASE INGRESADA: ");
		System.out.println(cadena);
		System.out.println("FRASE NUEVA: ");
		System.out.println(deleteChar(cadena, 5));
	}
	
		public static String deleteChar(String cad, int n){
			String cad2 = cad.substring(0, n);
			String cad3 = cad.substring(n + 1);
			String cad4 = cad2 + cad3;
			return cad4;
		}


}
