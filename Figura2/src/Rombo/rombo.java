package Rombo;
public class rombo {
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
    	if((a!=0)&&(a!=size*2))
      	  System.out.print(" ");
      	else
      		System.out.print("*");
    }
    for (int b = size-1; b >= 0; b--) {
        System.out.println();
        System.out.print(" "); 
        for (int a = 0; a< size-b-1;a++) {
            System.out.print(" ");
        }
        int s;
        s=2*b+1;
        for (int a = 0; a <s; a++) {
        	if((b==0)||(a==0)||(a==2*b))
          	  System.out.print("*");
          	else
          		System.out.print(" ");
        }
     
    }
   
    System.out.println();
}
}
