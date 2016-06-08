package digitos;

import java.util.Scanner;
public class digitos_aleatorios {
	private Scanner reader;
	private int [][] mat ;
	
	public  digitos_aleatorios() {
	        int filas, columnas;
	        Scanner reader = new Scanner(System.in);
	        System.out.println("Cuantas filas desea en  la matriz:");
	        filas=reader.nextInt();
	        System.out.println("Cuantas columnas desea en  la matriz:");
	        columnas=reader.nextInt();
	        mat=new int  [filas][columnas];
		for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
             mat[f][c]=(int)(Math.random()*100 + 1);}
        }
	}
	public  void imprimir_matriz() {
		 System.out.println("*** M A T R I Z***");
	        for(int f=0;f<mat.length; f++){
	            for(int c=0;c<mat[f].length;c++) {
	                System.out.print(mat[f][c]+"   ");
	            }
	            System.out.println();
	        }
	    }
	  public void generar_digitos(){
		int digito;
		String aux;
		Scanner reader = new Scanner(System.in);
		System.out.println("BUSCAR DIGITO: ");
			digito=reader.nextInt();
			aux=String.valueOf(digito);
			for(int f=0; f<mat.length; f++){
				for(int c=0; c<mat[f].length; c++){
					if(String.valueOf(mat[f][c]).length()>1)
					{
						if(aux.equals(String.valueOf(mat[f][c]).substring(1,2)))
							System.out.println(mat[f][c]);
					}
					else
						if((String.valueOf(mat[f][c])).equals(String.valueOf(mat[f][c]).substring(1,2)))
							System.out.println(mat[f][c]);			
				}
				
			}
		}
}
