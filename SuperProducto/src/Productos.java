
public class Productos {
	private String f_caducidad;
	private String numero_lote;
	
	public Productos (String f_caducidad, String numero_lote) {
		this.f_caducidad = f_caducidad;
		this.numero_lote = numero_lote;
	 }

	public String getF_caducidad() {
		return f_caducidad;
	}

	public void setF_caducidad(String f_caducidad) {
		this.f_caducidad = f_caducidad;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(String numero_lote) {
		this.numero_lote = numero_lote;
	}
	public void show_inf(){
		System.out.println ("***TODOS LOS PRODUCTOS***\n" +"Numero de Lote:  "+ getNumero_lote() + "\nFecha de Caducidad:  " + getF_caducidad()
				); }

	

}
