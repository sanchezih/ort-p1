package ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismoConInterfaces.src.seleccion;

public abstract class IntegranteDeSeleccionDeFutbol implements IntegranteDePlantelDeFutbol {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public IntegranteDeSeleccionDeFutbol() {
	}

	public IntegranteDeSeleccionDeFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*----------------------------------------------------------------------------*/

	/*
	 * Tener en cuenta: Esta clase no se puede instanciar porque es abstracta, por
	 * lo tanto no es necesario implementar en ella los metodos de la interface; de
	 * ser este el caso, sera obligatorio implementarlos en sus clases hijas.
	 */

	public void concentrarse() {
		System.out.println("Concentrarse (Clase Padre)");
	}

	public void viajar() {
		System.out.println("Viajar (Clase Padre)");
	}

	public void entrenar() {
		System.out.println("Entrenar (Clase Padre)");
	}

	public void jugarPartido() {
		System.out.println("Asiste al Partido de Futbol (Clase Padre)");
	}

	/*----------------------------------------------------------------------------*/

}
