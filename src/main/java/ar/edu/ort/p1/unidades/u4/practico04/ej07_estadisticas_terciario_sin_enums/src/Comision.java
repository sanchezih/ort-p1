package ar.edu.ort.p1.unidades.u4.practico04.ej07_estadisticas_terciario_sin_enums.src;

import java.util.Random;

public class Comision {

	private String codigo;
	private int cantAlumnos;
	private int cantClases;
	private char[][] asistencia;
	private Alumno[] alumnos;

	/*----------------------------------------------------------------------------*/

	public Comision(String codigo, int cantAlumnos, int cantClases) {
		this.codigo = codigo;
		this.cantAlumnos = cantAlumnos;
		this.cantClases = cantClases;
		this.asistencia = new char[cantAlumnos][cantClases];
		this.alumnos = new Alumno[cantAlumnos];
		inicializarAlumnado();
		inicializarAsistencia();
		dibujarMatriz(this.asistencia);
	}

	/*----------------------------------------------------------------------------*/

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-I: Mostrar los apellidos de los alumnos aptos para rendir final,
	 * junto al porcentaje de presentismo de cada uno.
	 */
	public void mostrarAlumnosAptosParaFinal() {
		System.out.println("Ejercicio B-I: Muestro los apellidos de los alumnos aptos para rendir final");
		double faltas;
		double porcPresentismo;

		for (int a = 0; a < this.alumnos.length; a++) {
			char[] filaAsistencia = this.asistencia[a];
			faltas = cantFaltas(filaAsistencia);
			porcPresentismo = 100 - ((faltas * 100) / this.cantClases);
			if (porcPresentismo >= Constantes.PORC_MIN_FINAL) {
				System.out.println(this.alumnos[a].getApellido() + "\t" + porcPresentismo + "%");
			}
		}

	}

	private double cantFaltas(char[] arrayAsistencia) {
		double acuFaltas = 0;
		int cant = arrayAsistencia.length;

		for (int c = 0; c < cant; c++) {
			char letra = arrayAsistencia[c];
			if (letra == Constantes.AUSENTE) {
				acuFaltas += Constantes.FALTA_COMPLETA;
			} else {
				if (letra == Constantes.TARDE) {
					acuFaltas += Constantes.MEDIA_FALTA;
				}
			}
		}
		return acuFaltas;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-II: Obtener el numero total de llegadas tarde para todo el
	 * periodo de cursada.
	 * 
	 * @return
	 */
	public int llegadasTardeTotalesParaElPeriodo() {
		int cantTardes = 0;

		for (int a = 0; a < this.cantAlumnos; a++) {
			for (int c = 0; c < this.cantClases; c++) {
				if (this.asistencia[a][c] == Constantes.TARDE) {
					cantTardes++;
				}
			}
		}
		return cantTardes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-III: Obtener la cantidad de clases con asistencia perfecta de la
	 * manera mas eficiente posible. (Las llegadas tarde cuentan como presente).
	 * 
	 * @return
	 */
	public int cantClasesAsistenciaPerfectas() {
		int cantPerfectas = 0;

		for (int c = 0; c < this.cantClases; c++) {
			if (esClaseConAsistenciaPerfecta(c)) {
				cantPerfectas++;
			}
		}
		return cantPerfectas;
	}

	/**
	 * 
	 * @param idxClase
	 * @return
	 */
	private boolean esClaseConAsistenciaPerfecta(int idxClase) {
		int a = 0;
		boolean esPerfecta = true;

		while (a < this.cantAlumnos && esPerfecta) {
			esPerfecta = this.asistencia[a][idxClase] != Constantes.AUSENTE;
			a++;
		}
		return esPerfecta;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-IV: Devolver (no mostrar por consola) el porcentaje de
	 * presentismo por cada clase. (Las llegadas tarde cuentan como presente).
	 * 
	 * @return
	 */
	public double[] porcPresentismoXClase() {
		double porcPresentismo;
		int presentes;
		double[] porcentajes;

		porcentajes = new double[this.cantClases];
		for (int c = 0; c < this.cantClases; c++) {
			presentes = cantPresentes(c);
			porcPresentismo = ((presentes * 100) / this.cantAlumnos);
			porcentajes[c] = porcPresentismo;
		}
		return porcentajes;
	}

	/**
	 * 
	 * @param idxClase
	 * @return
	 */
	private int cantPresentes(int idxClase) {
		int alumnosPresentes = 0;
		for (int a = 0; a < this.cantAlumnos; a++) {
			if (this.asistencia[a][idxClase] != Constantes.AUSENTE) {
				alumnosPresentes++;
			}
		}
		return alumnosPresentes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-V: Mostrar los apellidos de los alumnos que dejaron la cursada
	 * (mas de 4 ausencias seguidas).
	 */
	public void mostrarDesertores() {
		for (int a = 0; a < this.cantAlumnos; a++) {
			char[] filaAsistencia = this.asistencia[a];
			if (esDesertor(filaAsistencia)) {
				System.out.println("\t-> " + this.alumnos[a].getApellido());
			}
		}
	}

	private boolean esDesertor(char[] arrayAsistencia) {

		boolean esDesertor = false;
		int cantAusenciasBuscadas = Constantes.CANT_AUSENTES_DESERTOR;
		int ultimoIdxPosible = arrayAsistencia.length - cantAusenciasBuscadas;

		int idxInicioBusqueda = 0;
		int idxFinBusqueda = 0;

		int res = 0;

		// Si hay menos clases que las ausencias buscadas, nunca puede ser desertor
		if (cantAusenciasBuscadas < this.cantClases) {

			while (idxInicioBusqueda < ultimoIdxPosible && !esDesertor) {
				if (arrayAsistencia[idxInicioBusqueda] == Constantes.AUSENTE) {
					idxFinBusqueda = idxInicioBusqueda + cantAusenciasBuscadas - 1;
					res = buscarPresenteEnRango(arrayAsistencia, idxInicioBusqueda, idxFinBusqueda);
				}
				if (res == -1) {
					esDesertor = true;
				} else {
					idxInicioBusqueda++;
				}
			}

		}
		return esDesertor;
	}

	/**
	 * Metodo que busca en un rango de un array de asistencias si hay algun estado
	 * que no sea AUSENTE. Si lo encuentra, devuelve en indice en el que se
	 * encuentra o -1 en caso contrario.
	 * 
	 * @param arrayAsistencia
	 * @param inicio
	 * @param fin
	 * @return
	 */
	private int buscarPresenteEnRango(char[] arrayAsistencia, int inicio, int fin) {
		int nuevoIdxInicioBusqueda = -1;
		while (inicio <= fin && nuevoIdxInicioBusqueda == -1) {
			if (arrayAsistencia[inicio] != Constantes.AUSENTE) {
				nuevoIdxInicioBusqueda = inicio;
			}
			inicio++;
		}
		return nuevoIdxInicioBusqueda;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarAlumnado() {
		this.alumnos[0] = new Alumno("leg001", "Perez", 20);
		this.alumnos[1] = new Alumno("leg002", "Gomez", 20);
		this.alumnos[2] = new Alumno("leg003", "Lopez", 20);
		this.alumnos[3] = new Alumno("leg004", "Gil", 20);
		this.alumnos[4] = new Alumno("leg005", "Ruiz", 20);
	}

	private void inicializarAsistencia() {
		Random r = new Random();
		String opciones = "PAT";
		for (int i = 0; i < cantAlumnos; i++) {
			for (int j = 0; j < cantClases; j++) {
				this.asistencia[i][j] = opciones.charAt(r.nextInt(opciones.length()));
			}
		}
	}

	public void dibujarMatriz(char[][] matriz) {
		System.out.println("ASISTENCIA SIMULADA");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(getAlumnos()[i].getApellido() + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
