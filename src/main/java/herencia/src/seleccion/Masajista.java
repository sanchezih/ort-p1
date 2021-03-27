package herencia.src.seleccion;

public class Masajista extends IntegranteDeSeleccion {

	private String titulo;
	private int aniosExperiencia;

	public Masajista() {
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulo, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulo;
	}

	public void setTitulacion(String titulacion) {
		this.titulo = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public void darMasaje() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy dando un masaje...");
	}

}
