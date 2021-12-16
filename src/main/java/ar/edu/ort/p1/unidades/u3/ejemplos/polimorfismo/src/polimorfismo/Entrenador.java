package ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo;

public class Entrenador extends IntegranteDeSeleccion {

	private int idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
		super(id, nombre, apellido, edad);
		this.setIdFederacion(idFederacion);
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	@Override
	public void participarEnPartido() {
		System.out.println(
				"Soy " + this.getNombre() + " " + this.getApellido() + " -> Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}

}
