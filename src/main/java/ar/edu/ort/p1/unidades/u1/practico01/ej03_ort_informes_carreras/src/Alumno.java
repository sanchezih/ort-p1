package ar.edu.ort.p1.unidades.u1.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String mail;
	private ArrayList<Materia> materias;

	public Alumno(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		this.materias = new ArrayList<Materia>();
	}

	public void agregarMateria(Materia materia) {
		this.materias.add(materia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	/*----------------------------------------------------------------------------*/

	public int cantAprobadas() {
		int cant = 0;
		for (Materia materia : this.materias) {
			if (materia.getEstado() == Estado.APROBADA) {
				cant++;
			}
		}
		return cant;
	}

}
