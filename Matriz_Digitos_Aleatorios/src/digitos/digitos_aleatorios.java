package digitos;

import java.util.Scanner;
public class digitos_aleatorios {
	private Scanner reader;
	private int [][] mat ;
	
	public  digitos_aleatorios() {
	        int filas, columnas;
	        Scanner reader = new Scanner(System.in);
	        System.out.print("Cuantas filas desea en  la matriz:");
	        filas=reader.nextInt();
	        System.out.print("Cuantas columnas desea en  la matriz:");
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
	                System.out.print(mat[f][c]+"\t");
	            }
	            System.out.println();
	        }
	    }
	  public void generar_digitos(){
		int digito, UltimoDigito=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("BUSCAR DIGITO: ");
			digito=reader.nextInt();
			for(int f=0; f<mat.length; f++){
				for(int c=0; c<mat[f].length; c++){
					UltimoDigito=(mat[f][c])%10;
					if(UltimoDigito==digito)
					{
						 System.out.println(mat[f][c]);
					}
					
				
				}
			}
	  }
}