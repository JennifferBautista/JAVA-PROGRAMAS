
public class ProductoRefrigerado extends ProductoFresco {
	private String  codigo_SA;
	
	
	public ProductoRefrigerado (String f_caducidad, String numero_lote) {
		super(f_caducidad, numero_lote);
		codigo_SA = codigo_SA; 
		}

	public String getCodigo_SA() {
		return codigo_SA;
	}

	public void setCodigo_SA(String codigo_SA) {
		this.codigo_SA = codigo_SA;
	}
	public void mostrarInformacionPRefrigerado() {
		System.out.println ("***PRODUCTO REFRIGERADO***\n" +"Numero de Lote:  "+ getNumero_lote() + "\nFecha de Caducidad:  " + getF_caducidad() +
		"\nCodigo de Supervision Alimentaria: " + getCodigo_SA()); }
	
}
