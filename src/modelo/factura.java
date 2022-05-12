package modelo;

public class factura {
	private String n_factura;
	private double iva;
	private String fechafactura;
	private double precio_final;
	private String dni;
	private String cod_pepido;
	
	public factura(String n_factura, double iva, String fechafactura, double precio_final, String dni,String cod_pepido) {
		this.n_factura = n_factura;
		this.iva = iva;
		this.fechafactura = fechafactura;
		this.precio_final = precio_final;
		this.dni = dni;
		this.cod_pepido = cod_pepido;
	}
	public String getN_factura() {
		return n_factura;
	}
	public void setN_factura(String n_factura) {
		this.n_factura = n_factura;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public String getFechafactura() {
		return fechafactura;
	}
	public void setFechafactura(String fechafactura) {
		this.fechafactura = fechafactura;
	}
	public double getPrecio_final() {
		return precio_final;
	}
	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCod_pepido() {
		return cod_pepido;
	}
	public void setCod_pepido(String cod_pepido) {
		this.cod_pepido = cod_pepido;
	}
	
}
