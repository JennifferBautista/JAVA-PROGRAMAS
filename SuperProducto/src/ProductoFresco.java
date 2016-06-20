
public class ProductoFresco extends Productos {
	private String  f_envasado;
	private String pais_origen;
	
	public ProductoFresco (String f_caducidad, String numero_lote) {
		super(f_caducidad, numero_lote);
		f_envasado = f_envasado; 
		pais_origen = pais_origen;
		}

	public String getF_envasado() {
		return f_envasado;
	}

	public void setF_envasado(String f_envasado) {
		this.f_envasado = f_envasado;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	public void mostrarInformacionPFresco() {
		System.out.println ("***PRODUCTO FRESCO***\n" +"Numero de Lote:  "+ getNumero_lote() + "\nFecha de Caducidad:  " + getF_caducidad() +
		"\nFecha de Envasado: " + getF_envasado()+"\nPais de Origen:  "+ getPais_origen()); }
	

}
