
package array_matriz;

public class matriz {

     public matriz (int[][] aux){
		int ma [] []= new int [8][8]; 
	}

 	public void getMax(int[][]arr){
 		int max = arr[0][0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 			 for(int y=0; y<arr.length; y++)
 		 	if (arr[x][y]>max)
 	          max=arr[x][y];
 		 }
 		System.out.println("El maximos es: " +max);

 	}
 	public void getMin(int[][]arr){
 		int min = arr[0][0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 			for(int y=0; y<arr.length; y++)
 		 	if (arr[x][y]<min)
 	          min=arr[x][y];
 		 }
 		System.out.println("El menor es: " +min);

 	}
 	public void getpromedio(int arr[][])
 	{
 	    float temp=0, suma=0;
 	 
 	  for (int x=0; x<arr.length; x++)
 	  {
 		  for (int y=0; y<arr.length; y++)
 	     suma+=arr[x][y];
 	        temp++;
 	  }
 	 System.out.println("El promedio es: "+(suma/temp));
 	  
}
}
