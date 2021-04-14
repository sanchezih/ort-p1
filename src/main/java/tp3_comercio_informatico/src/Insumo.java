package tp3_comercio_informatico.src;

public class Insumo implements Facturable {

	private String nombre;
	private double porcentajeGanancia;
	private double precioLista;
	private Tipo tipo;

	public Insumo(String nombre, double porcentajeGanancia, double precioLista, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public double getMontoFacturacion() {
		return Matematica.sumarPorcentaje((porcentajeGanancia + precioLista), IVA);
	}

}
