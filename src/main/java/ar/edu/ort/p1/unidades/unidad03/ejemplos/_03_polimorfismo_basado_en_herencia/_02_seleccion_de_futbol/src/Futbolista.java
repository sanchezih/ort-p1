package ar.edu.ort.p1.unidades.unidad03.ejemplos._03_polimorfismo_basado_en_herencia._02_seleccion_de_futbol.src;

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

	@Override
	public void participarEnEntrenamiento() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy entrenando (Clase Futbolista - Override)");
	}

	@Override
	public void participarEnPartido() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy participando (Jugando) en un Partido (Clase Futbolista - Override)");
	}

	public void entrevista() {
		System.out.println("\tSoy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy dando una entrevista (Clase Futbolista)");
	}

}
