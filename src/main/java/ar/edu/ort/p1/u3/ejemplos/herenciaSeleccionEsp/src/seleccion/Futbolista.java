package ar.edu.ort.p1.u3.ejemplos.herenciaSeleccionEsp.src.seleccion;

public class Futbolista extends IntegranteDeSeleccion {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy jugando un partido...");
	}

	public void entrenar() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy entrenando...");
	}

}
