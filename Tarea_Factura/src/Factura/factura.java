package Factura;
public class factura {
	
	private float costo;
	private int cantidad;
	private String productos;
	
	
	public factura(float costo, int cantidad, String productos){
		this.costo = costo;
		this.cantidad = cantidad;
		this.productos = productos;
		
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}
	
	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad= cantidad;
	}
	public void show_inf(){
		System.out.println("Producto->"+this.productos+" | Costo->"+this.costo+" | Cantidad->"+this.cantidad);    
	}
	 
	public float subtotal(float costo,int cantidad)
	{
		float s;
		s=costo*cantidad;
		return s;
	}
	
	public float iva(int p, float subtotal)
	{
		float iva;
		iva=(subtotal*p)/100;
		return iva;
	}

}
