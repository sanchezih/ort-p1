package ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismoConInterfaces.src.seleccion;

public class Masajista extends IntegranteDeSeleccionDeFutbol {

	private String titulo;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulo, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulo = titulo;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public void entrenar() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
}