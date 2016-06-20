
public class ProductoCongelado extends ProductoRefrigerado {
	private String  Temperatura_recomendada;
	
	
	public ProductoCongelado (String f_caducidad, String numero_lote) {
		super(f_caducidad, numero_lote);
		Temperatura_recomendada = Temperatura_recomendada; 
		}


	public String getTemperatura_recomendada() {
		return Temperatura_recomendada;
	}


	public void setTemperatura_recomendada(String temperatura_recomendada) {
		Temperatura_recomendada = temperatura_recomendada;
	}
	public void mostrarInformacionPCongelado() {
		System.out.println ("***PRODUCTO CONGELADO***\n" +"Numero de Lote:  "+ getNumero_lote() + "\nFecha de Caducidad:  " + getF_caducidad() +
		"\nTemperatura de Congelacion Recomendada: " + getTemperatura_recomendada()); }

}
