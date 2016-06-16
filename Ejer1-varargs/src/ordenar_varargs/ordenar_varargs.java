package ordenar_varargs;

public class ordenar_varargs {
	
	private String[] cadena; 
	
	public ordenar_varargs(String ... cadena)
	{
		cadena = cadena;
	}
	public void OrdAsc(String ... cadena)
	{
		for(int j=0;j<5;j++) {
            for(int i=0;i<5-j;i++) {
                if (cadena[i].compareTo(cadena[i+1])>0) {
                    String aux;
                    aux=cadena[i];
                    cadena[i]=cadena[i+1];
                    cadena[i+1]=aux;
                }
            }
        }
	}	
 
    public void imprimirInfoAsc(String ... cadena) {
     System.out.println("1) NOMBRES ASCENDENTES:");
     System.out.println(" A - Z");
        for(int i=0;i<cadena.length;i++) {
            System.out.println(cadena[i]);
        }
    }
    
	public void OrdDsc(String ... cadena)
	{
		for(int j=0;j<5;j++) {
            for(int i=0;i<5-j;i++) {
                if (cadena[i].compareTo(cadena[i+1])<0) {
                    String aux;
                    aux=cadena[i];
                    cadena[i]=cadena[i+1];
                    cadena[i+1]=aux;
                }
            }
        }
	}	
 
    public void imprimirInfoDsc(String ... cadena) {
     System.out.println("2) NOMBRES DESCENDENTES:");
     System.out.println(" A - Z");
        for(int  i=0;i<cadena.length;i++) {
            System.out.println(cadena[i]);
        }
    }

}
