package ar.edu.ort.p1.examenes._01_oop.teatro.src;

import java.util.ArrayList;
import java.util.List;

public class Teatro {
	private String nombre;
	private String direccion;
	private List<Obra> obras;

	/*----------------------------------------------------------------------------*/

	public Teatro(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.obras = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void addObra(Obra obra) {
		this.obras.add(obra);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * El metodo ingreso(...), en la clase Teatro, que recibe una lista de
	 * espectadores y los asigna a las obras correspondientes. Un espectador podra
	 * ingresar a la obra si hay localidades disponibles en la misma y, en el caso
	 * de los criticos, si ademas el tiempo que tienen disponible es mayor o igual a
	 * la duracion de la obra.
	 * 
	 * Tener en cuenta que:
	 * 
	 * En el caso de las obras musicales, a la duracion total de la obra hay que
	 * sumarle 5 minutos adicionales de la obertura.
	 * 
	 * En el caso de las obras infantiles, ademas, a la duracion total de la obra
	 * hay que sumarle el tiempo de cambio de los personajes que representa 10
	 * minutos por la cantidad de personajes que tenga la obra.
	 * 
	 * Si el espectador no puede ingresar a la obra, se debe imprimir un mensaje "El
	 * espectador no puede ingresar"
	 * 
	 * @param espectadores
	 */
	public void ingreso(List<Espectador> espectadores) {

		Obra obra = null;

		for (Espectador espectador : espectadores) {
			obra = buscarObra(espectador.getNombreObra());

			if (obra != null && obra.puedeIngresar(espectador)) {
				obra.ingresar(espectador);
			} else {
				System.out.println("El espectador no puede ingresar");
			}
		}
	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	private Obra buscarObra(String nombre) {

		Obra obraBuscada = null;
		int pos = 0;
		Obra obra = null;

		while (obraBuscada == null && pos < this.obras.size()) {
			obra = this.obras.get(pos);

			if (obra.tieneNombre(nombre)) {
				obraBuscada = obra;
			} else {
				pos++;
			}
		}
		return obraBuscada;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * El metodo otorgarPremio(...), en la clase Teatro, que recibe por parametro
	 * una cantidad de entradas a regalar a todos los espectadores que ingresaron a
	 * una obra dramatica o basada en peliculas. Este metodo debera imprimir por
	 * cada espectador un mensaje del estilo: "El espectador con DNI <dni> recibe
	 * <cantidad> de entradas"
	 * 
	 * - Los espectadores de las obras basadas en peliculas reciben exactamente la
	 * cantidad de entradas especificadas por parametro.
	 * 
	 * - Los espectadores de las obras dramaticas reciben 2 entradas mas adicionales
	 * a las especificadas por parametro (Ej: si el parametro indica 3 entradas, los
	 * espectadores de obras dramaticas recibiran 5).
	 * 
	 * @param cantEntradas
	 */
	public void otorgarPremio(int cantEntradas) {

		Obra obra = null;
		int pos = 0;

		while (pos < this.obras.size()) {
			obra = this.obras.get(pos);

			if (obra instanceof Premiable) {
				Premiable obraPremiable = (Premiable) obra;
				obraPremiable.asignarPremio(cantEntradas);
			}
			pos++;
		}
	}

}
