package ar.edu.ort.p1.examenes.ds.actas_materia.src;

public class Materia {

	private final static int CANT_CURSOS = 10;
	private final static int CANT_ACTAS = CategoriaExamen.values().length;
	private ColaDeAlumnos alumnos;
	private Acta[] actas;
	private String nombre;

	/*----------------------------------------------------------------------------*/

	public Materia(String nombre) {
		this.alumnos = new ColaDeAlumnos();
		this.actas = new Acta[CANT_ACTAS];
		this.nombre = nombre;
		inicializarActas();
	}

	/*----------------------------------------------------------------------------*/

	public Acta[] getActas() {
		return actas;
	}

	/**
	 * Metodo que crea, dentro del array de actas, un acta por cada elemento que
	 * exista dentro del enum CategoriaExamen
	 */
	private void inicializarActas() {
		for (int i = 0; i < actas.length; i++) {
			this.actas[i] = new Acta(CategoriaExamen.values()[i]);
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo asignarActas(), el cual debe asignar los alumnos
	 * inscriptos en una materia a sus actas correspondientes segun las reglas
	 * anteriormente mencionadas.
	 */
	public void asignarActas() {
		Alumno alumno;
		Alumno centinela = new AlumnoRegular(-1, "", 1, 1, false);
		this.alumnos.add(centinela);
		alumno = this.alumnos.remove();

		while (alumno != centinela) {
			this.actas[alumno.getCategoriaExamen().ordinal()].asignar(alumno);
			this.alumnos.add(alumno);
			alumno = this.alumnos.remove();
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo informarActaXCurso que informe (muestre por pantalla)
	 * para cada curso cuantos alumnos hay en cada acta.
	 * 
	 * @return
	 */
	public void informarActaXCurso() {
		Alumno alumno;
		Alumno centinela = new AlumnoRegular(-1, "", 1, 1, false);
		int[][] matriz = new int[CANT_ACTAS][CANT_CURSOS];

		this.alumnos.add(centinela);
		alumno = this.alumnos.remove();

		while (alumno != centinela) {
			contarEnMatriz(matriz, alumno);
			this.alumnos.add(alumno);
			alumno = this.alumnos.remove();
		}
		mostarMatrizActaXCurso(matriz);
	}

	/**
	 * 
	 * @param matriz
	 * @param alumno
	 */
	private void contarEnMatriz(int[][] matriz, Alumno alumno) {
		int idxActa;
		int idxCurso;
		idxActa = alumno.getCategoriaExamen().ordinal();
		idxCurso = alumno.getNroCurso() - 1;
		matriz[idxActa][idxCurso]++;
	}

	/**
	 * 
	 */
	private void mostarMatrizActaXCurso(int[][] matriz) {
		System.out.println("Ejercicio C: Muestro para cada acta, cuantos alumnos hay de cada curso");
		System.out.println("\tC1\tC2\tC3\tC4\tC5\tC6\tC7\tC8\tC9\tC10");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(((CategoriaExamen.values()[i]).toString().substring(0, 7)) + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostarActas() {
		System.out.println("Ejercicio B: Muestro los actas de " + this.nombre);
		for (int i = 0; i < this.actas.length; i++) {
			this.actas[i].mostrar();
		}
	}

}
