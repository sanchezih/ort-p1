package ar.edu.ort.p1.unidades.u4.practico04.ej05_empresa_camiones.src;

public class Chofer {

	private String id;
	private String nombre;
	private double pagoPorViaje;

	public Chofer(String id, String nombre, double pagoPorViaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pagoPorViaje = pagoPorViaje;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPagoPorViaje() {
		return pagoPorViaje;
	}

	public void setPagoPorViaje(double pagoPorViaje) {
		this.pagoPorViaje = pagoPorViaje;
	}

}
