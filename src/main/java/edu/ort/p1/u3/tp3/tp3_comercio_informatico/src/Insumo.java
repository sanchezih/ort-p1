package edu.ort.p1.u3.tp3.tp3_comercio_informatico.src;

public class Insumo implements Facturable {

	private String nombre;
	private double porcentajeGanancia;
	private double precioLista;
	private TipoInsumo tipoInsumo;

	public Insumo(String nombre, double porcentajeGanancia, double precioLista, TipoInsumo tipoInsumo) {
		super();
		this.nombre = nombre;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
		this.tipoInsumo = tipoInsumo;
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

	public TipoInsumo getTipoInsumo() {
		return tipoInsumo;
	}

	public void setTipoInsumo(TipoInsumo tipoInsumo) {
		this.tipoInsumo = tipoInsumo;
	}

	@Override
	public double getMontoFacturacion() {
		return Matematica.sumarPorcentaje((porcentajeGanancia + precioLista), IVA);
	}

}
