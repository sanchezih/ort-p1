package ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo;

public class Entrenador extends IntegranteDeSeleccion {

	private int idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy dirigiendo un entrenamiento (Clase Entrenador - Override)");
	}

	@Override
	public void participarEnPartido() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy participando (Dirigiendo) en un Partido (Clase Entrenador - Override)");
	}

	public void planificarEntrenamiento() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy planificando un entrenamiento (Clase Entrenador)");
	}

}
