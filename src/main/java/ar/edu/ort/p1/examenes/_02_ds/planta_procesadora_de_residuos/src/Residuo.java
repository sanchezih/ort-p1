package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

public abstract class Residuo implements Tipable {

	private String fecha;
	private double peligrosidad;

	public Residuo(String fecha, double peligrosidad) {
		this.fecha = fecha;
		this.peligrosidad = peligrosidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPeligrosidad() {
		return peligrosidad;
	}

	public void setPeligrosidad(double peligrosidad) {
		this.peligrosidad = peligrosidad;
	}

	public abstract double calcularToxicidad();

	@Override
	public String toString() {
		return "Residuo [fecha=" + fecha + ", peligrosidad=" + peligrosidad + "]";
	}

	
	
	
}
