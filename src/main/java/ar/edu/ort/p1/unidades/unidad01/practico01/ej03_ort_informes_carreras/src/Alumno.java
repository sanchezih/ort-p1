package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String mail;
	private List<Materia> materiasCursadas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nombre
	 * @param mail
	 */
	public Alumno(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		this.materiasCursadas = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarMateria(Materia materia) {
		this.materiasCursadas.add(materia);
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getCantMateriasAprobadas() {
		int cant = 0;
		for (Materia materia : this.materiasCursadas) {
			if (materia.getEstado() == Estado.APROBADA) {
				cant++;
			}
		}
		return cant;
	}

}
