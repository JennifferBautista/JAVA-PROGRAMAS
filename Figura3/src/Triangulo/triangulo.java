package Triangulo;

public class triangulo {
int size;

	public int get_size(){
	return this.size; 
}

	public void set_size(int size){
	this.size = size ; 
}

static void asterisco(int size){
    for (int a = 0; a < size; a++) {
    	
        System.out.println();
        System.out.print(" "); 
        for (int b= 0; b< size-a-1; b++) {                      
            System.out.print(" ");           
        }
        int s;
        s=2*a+1;
        for (int b =0; b <s; b++){
        	if((a==0)||(b==0)||(b==2*a))
        	  System.out.print("*");
        	else
        		System.out.print(" ");}}
    System.out.println();
    for (int a = 0; a <size*2+1; a++) {
      		System.out.print("*");
    }
   
    System.out.println();
}
}