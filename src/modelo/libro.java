package modelo;

public class libro {
	private String isbn;
	private String nombre;
	private String descripcion;
	private String autor;
	private String editorial;
	private String genero;
	private String tapa;
	private String fecha_lanzamiento;
	private Double precio;
	
	public libro(String isbn, String nombre, String descripcio, String autor, String editorial, String genero,
			String tapa, String fecha_lanzamiento, Double precio) {
		this.isbn = isbn;
		this.nombre = nombre;
		this.descripcion = descripcio;
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.tapa = tapa;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.precio = precio;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTapa() {
		return tapa;
	}
	public void setTapa(String tapa) {
		this.tapa = tapa;
	}
	public String getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}
	public void setFecha_lanzamiento(String fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
