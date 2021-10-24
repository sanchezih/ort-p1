package ar.edu.ort.p1.u4.practico04.ej10_circulo_cine_fantastico.src;



public class Charla {

	private int numero;
	private Pelicula pelicula;
	private int cantVacantes;
	private Fecha fecha;
	private Espectador[] espectadores;

	public Charla(Fecha fecha, int numero, Pelicula pelicula, int cantVacantes) {

		this.fecha = fecha;
		this.numero = numero;
		this.pelicula = pelicula;
		this.cantVacantes = cantVacantes;
		this.espectadores = new Espectador[cantVacantes];

	}

	public String getTitulo() {

		return pelicula.getTitulo();
	}

	public Fecha getFecha() {
		return fecha;
	}

	public boolean agregoEspectador(Espectador espectador) {

		Espectador consultado, reservado = null;
		int i = 0;
		boolean encontre = false;

		while (i < espectadores.length && !encontre && reservado == null) {

			consultado = espectadores[i];

			if (consultado != null) {

				if (consultado == espectador) {

					encontre = true;

				} else {

					i++;
				}

			} else {

				reservado = espectador;

				espectadores[i] = reservado;

				reducirVacantes();
			}

		}

		return reservado != null;
	}

	private void reducirVacantes() {

		cantVacantes--;

	}

	public void mostrar() {

		System.out.println(
				getFecha() + " Charla " + getNumero() + " " + getTitulo() + " (" + getCantVacantes() + " vacantes)");

	}

	public int getCantVacantes() {
		return cantVacantes;
	}

	public int getNumero() {
		return numero;
	}
}
