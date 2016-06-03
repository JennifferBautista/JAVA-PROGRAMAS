package vectores;

public class arrays {

     public arrays (int[]arr){
		int vec [] = new int [8]; 
	}
     public void suma( int arr[])
     {
         int suma=0;
         for(int x=0; x<=arr.length; x++)
         {
             suma=suma+arr[x];
         }
         System.out.println("El maximos es: " +suma);
     }
 

 	public void getMax(int[]arr){
 		int max = arr[0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 		 	if (arr[x]>max)
 	          max=arr[x];
 		 }
 		System.out.println("El maximos es: " +max);

 	}
 	public void getMin(int[]arr){
 		int min = arr[0];
 		 for(int x=0; x<arr.length; x++)
 		 {
 		 	if (arr[x]<min)
 	          min=arr[x];
 		 }
 		System.out.println("El menor es: " +min);

 	}
 	public void getpromedio(int arr[])
 	{
 	    float temp=0, suma=0;
 	 
 	  for (int x=0; x<arr.length; x++)
 	  {
 	     suma+=arr[x];
 	        temp++;
 	  }
 	 System.out.println("El promedio es: "+(suma/temp));
 	  
}
}
