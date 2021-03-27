package herencia.src.seleccion;

public class IntegranteDeSeleccion {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public IntegranteDeSeleccion() {
	}

	public IntegranteDeSeleccion(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellidos;
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

	public void setApellidos(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy concentrandome...");
	}

	public void viajar() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy viajando...");
	}

}
