package array_matriz;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux[][]={{1,3,6,7,4,5,2,8},{1,3,6,7,4,5,2,8}};
		matriz mat = new matriz(aux);
        mat.getMax(aux);
        mat.getMin(aux);
        mat.getpromedio(aux);
	}

}
