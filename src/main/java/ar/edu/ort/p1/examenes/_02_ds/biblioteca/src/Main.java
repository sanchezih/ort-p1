package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();

		Usuario usuarioAlumno = new Alumno(21, "Veronica", "29876110", 2);

		biblioteca.tomarPrestado(usuarioAlumno, 1, "A01");

	}

}
