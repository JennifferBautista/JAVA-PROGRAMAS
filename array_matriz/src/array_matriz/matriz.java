
package array_matriz;

public class matriz {

     public matriz (int arr[][] ){
		int mat [] []= new int [8][8]; 
	}

 	public void getMax(int[][]arr){
 		int max = arr[0][0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 			 for(int y=0; y<arr[x].length; y++)
 		 	if (arr[x][y]>max)
 	          max=arr[x][y];
 		 }
 		System.out.println("El maximos es: " +max);

 	}
 	public void getMin(int[][]arr){
 		int min = arr[0][0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 			for(int y=0; y<arr[x].length; y++)
 		 	if (arr[x][y]<min)
 	          min=arr[x][y];
 		 }
 		System.out.println("El menor es: " +min);

 	}
 	public void getpromedio(int arr[][])
 	{
 	    float  suma=0;
 	 
 	  for (int x=0; x<arr.length; x++)
 	  {
 		  for (int y=0; y<arr[x].length; y++)
 	     suma=suma+arr[x][y];
 	  }
 	 System.out.println("El promedio es: "+(suma/16));
 	  
}
 	public void ordenar_Asc(int arr[][]){
 		
		for( int i=0; i < arr.length; i++){
			for(int j=0;j< arr[i].length; j++){
				for(int x=0; x < arr.length; x++){
					for(int y=0; y <arr[x].length; y++){
						if(arr[i][j] < arr[x][y]){
							int t = arr[i][j];
							arr[i][j] = arr[x][y];
							arr[x][y] = t;}
						}
					}
				}
		}
		System.out.println("**Matriz ASC**");

		for (int i=0; i < arr.length; i++){//imprime la matriz ascendentemente
			for(int j=0;j< arr[i].length; j++){
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();}
		}
 	public void ordenar_Desc(int arr[][]){
 		
		for( int i=0; i < arr.length; i++){
			for(int j=0;j< arr[i].length; j++){
				for(int x=0; x < arr.length; x++){
					for(int y=0; y <arr[x].length; y++){
						if(arr[i][j] > arr[x][y]){
							int t = arr[i][j];
							arr[i][j] = arr[x][y];
							arr[x][y] = t;}
						}
					}
				}
		}
		System.out.println("**Matriz DESC**");

		for (int i=0; i < arr.length; i++){//imprime la matriz descendentemente
			for(int j=0;j< arr[i].length; j++){
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();}
		}
}
