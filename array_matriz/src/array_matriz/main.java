package array_matriz;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux[][]={{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16}};
		matriz mat = new matriz(aux);
        mat.getMax(aux);
        mat.getMin(aux);
        mat.getpromedio(aux);
        mat.ordenar_Asc(aux);
        mat.ordenar_Desc(aux);
	}
}
