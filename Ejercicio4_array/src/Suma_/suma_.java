package Suma_;

import javax.swing.JOptionPane;

public class suma_ {
	 private int[] x =new int [4];
	 
	 public suma_(String a,String b,String c,String d)
	 {
		 x[0]=Integer.parseInt(a);
		 x[1]=Integer.parseInt(b);
		 x[2]=Integer.parseInt(c);
		 x[3]=Integer.parseInt(d);
	 }
	 public void comparar(){
         int i, j, aux=0;
         for(i=0;i<x.length;i++)
        	 {aux=0;
              for(j=i+1;j<x.length;j++)
              { if(x[i]==x[j]){
                      aux=1;
                      x[j]=0;
                   }
              }
              if (aux==1)
                	   x[i]=0;
     }
}
	 
	 public int Tsuma()
	 {
		 int sumaf=0;
		 for(int f=0;f<x.length; f++)
		 {
			 if(x[f]!=0)
				 sumaf+=x[f];
		 }
		 return sumaf;
	 }

	 public void finalize(){
			JOptionPane.showMessageDialog(null,"El programa se va a cerrar");

		} 
	 
}