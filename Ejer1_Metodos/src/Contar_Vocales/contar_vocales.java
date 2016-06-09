package Contar_Vocales;

	public class contar_vocales {
		private String cadena;
		private int num_vocales;
		
		public contar_vocales(String cadena) {
			this.cadena= cadena;
		}
		public String getCadena() {
			return cadena;
		}
		public void setCadena(String cadena) {
			this.cadena = cadena;
		}
	
	private int numero_vocales(){
		int c = 0;
        for(int i=0; i<cadena.length(); i++)
        {
            if(cadena.charAt(i) == 'a'||cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u')
                c++;
        }
       
        return c;
    }
	public void show_inf(){
		this.num_vocales= numero_vocales();
		System.out.println("NUMERO DE VOCALES->"+ numero_vocales());
	}
}

