package ar.edu.ort.p1.unidades.unidad03.ejemplos._03_polimorfismo_basado_en_herencia._02_seleccion_de_futbol.src;

public abstract class IntegranteDeSeleccion {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public IntegranteDeSeleccion() {
	}

	public IntegranteDeSeleccion(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void concentrarse() {
		System.out.println(
				"\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy concentrandome (Clase Padre)");
	}

	public void viajar() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido() + " y estoy viajando (Clase Padre)");
	}

	public void participarEnPartido() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy participando del Partido de Futbol (Clase Padre)");
	}

	/**
	 * Metodo abstracto el cual debe implementarse obligatoriamente en las subclases
	 */
	public abstract void participarEnEntrenamiento();

}
