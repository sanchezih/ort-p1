package ar.edu.ort.p1.examenes.ortcapital.src;

public class Titulo {

	private String codigo;
	private String nombre;
	private double precio;
	private TipoTitulo tipoTitulo;

	public Titulo(String codigo, String nombre, double precio, TipoTitulo tipoTitulo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.tipoTitulo = tipoTitulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public TipoTitulo getTipoTitulo() {
		return tipoTitulo;
	}

	public void setTipoTitulo(TipoTitulo tipoTitulo) {
		this.tipoTitulo = tipoTitulo;
	}

	@Override
	public String toString() {
		return "Titulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", tipoTitulo=" + tipoTitulo
				+ "]";
	}

}
