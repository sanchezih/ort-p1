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

	public double getPagoPorViaje() {
		return pagoPorViaje;
	}

}
