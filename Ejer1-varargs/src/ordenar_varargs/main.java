package ordenar_varargs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux[]={"Angel", "Juan","Pedro","Lucia","Maria","Lucrecia"};
		ordenar_varargs ob = new ordenar_varargs();
		ob.OrdAsc(aux);
		ob.imprimirInfoAsc(aux);
		ob.OrdDsc(aux);
		ob.imprimirInfoDsc(aux);
		
	}

}
