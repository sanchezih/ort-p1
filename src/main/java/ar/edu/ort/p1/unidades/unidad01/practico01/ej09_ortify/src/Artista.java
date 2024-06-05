package ar.edu.ort.p1.unidades.unidad01.practico01.ej09_ortify.src;

import java.util.ArrayList;
import java.util.List;

public class Artista {

	private String id;
	private String nombre;
	private List<Cancion> canciones;

	public Artista(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	/**
	 * Ejercicio B: La explotacion del metodo mostrarDuracionPromedio que permita
	 * mostrar el promedio en minutos y segundos que duran las canciones de un
	 * artista. (Ejemplo: "3 minutos, 24 segundos", no "204 segundos")
	 */
	public void mostraDuracionPromedio() {

		int segTotales = 0;
		int promedioSeg;
		int promedioMin;

		if (this.canciones.size() > 0) {
			for (Cancion c : this.canciones) {
				segTotales += c.getDuracion();
			}
			promedioSeg = segTotales / this.canciones.size();
			promedioMin = promedioSeg / 60;

			/*
			 * Operador de modulo devuelve el resto de los dos enteros despues de la
			 * division
			 */
			promedioSeg = promedioSeg % 60;

			System.out.println(nombre + ": " + promedioMin + " minutos, " + promedioSeg + " segundos");
		} else {
			System.out.println("No tiene canciones");
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo esFanDestacado de la clase Artista que
	 * recibe como parametro la instancia de un usuario y se devuelve si se trata de
	 * un fan destacado o no, segun si el usuario ha dado 'like' en al menos la
	 * mitad de las canciones del artista
	 * 
	 * @param user
	 * @return
	 */
	public boolean esFanDestacado(Usuario user) {
		int i = 0;
		int conLikes = 0;
		double likesMinimos;
		likesMinimos = this.canciones.size() / 2.0;
		while (i < this.canciones.size() && conLikes <= likesMinimos) {
			if (this.canciones.get(i).dioLike(user)) {
				conLikes++;
			}
			i++;
		}
		return conLikes >= likesMinimos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo primeras5Canciones que devuelva una
	 * lista con las primeras 5 canciones de un artista. Si no llega a tener 5,
	 * devolver las que tenga, siempre en una nueva lista.
	 * 
	 * @return
	 */
	public List<Cancion> primeras5Canciones() {
		List<Cancion> lista = new ArrayList<>();
		int i = 0;
		while (i < this.canciones.size() && lista.size() < 5) {
			lista.add(this.canciones.get(i));
			i++;
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	public void borrarUsuarioDeLista(Usuario usuario) {
		for (Cancion cancion : this.canciones) {
			cancion.borrarLiker(usuario);
		}
	}

	/*----------------------------------------------------------------------------*/

	public void addCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}

}
