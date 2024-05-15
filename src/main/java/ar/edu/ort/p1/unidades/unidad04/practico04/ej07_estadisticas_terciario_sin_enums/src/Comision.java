package ar.edu.ort.p1.unidades.unidad04.practico04.ej07_estadisticas_terciario_sin_enums.src;

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
		inicializarAsistenciaAleatoria();
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
		System.out.println("Ejercicio B-I - Muestro los apellidos de los alumnos aptos para rendir final");
		double cantFaltas;
		double porcPresentismo;

		for (int i = 0; i < this.alumnos.length; i++) {
			char[] asistenciaDeAlumno = this.asistencia[i];
			cantFaltas = getCantFaltasDeAlumno(asistenciaDeAlumno);
			porcPresentismo = 100 - ((cantFaltas * 100) / this.cantClases);
			if (porcPresentismo >= Constantes.PORC_MIN_FINAL) {
				System.out.println("\t-> " + this.alumnos[i].getApellido() + "\t" + porcPresentismo + "%");
			}
		}

	}

	/**
	 * 
	 * @param asistenciaDeAlumno
	 * @return
	 */
	private double getCantFaltasDeAlumno(char[] asistenciaDeAlumno) {
		double cantFaltas = 0;
		int cantClases = asistenciaDeAlumno.length;

		for (int i = 0; i < cantClases; i++) {
			char letra = asistenciaDeAlumno[i];
			if (letra == Constantes.AUSENTE) {
				cantFaltas += Constantes.FALTA_COMPLETA;
			} else {
				if (letra == Constantes.TARDE) {
					cantFaltas += Constantes.MEDIA_FALTA;
				}
			}
		}
		return cantFaltas;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-II: Obtener el numero total de llegadas tarde para todo el
	 * periodo de cursada.
	 * 
	 * @return
	 */
	public int getCantLlegadasTardeParaElPeriodo() {
		int cantLlegadasTardes = 0;

		for (int i = 0; i < this.cantAlumnos; i++) {
			for (int j = 0; j < this.cantClases; j++) {
				if (this.asistencia[i][j] == Constantes.TARDE) {
					cantLlegadasTardes++;
				}
			}
		}
		return cantLlegadasTardes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-III: Obtener la cantidad de clases con asistencia perfecta de la
	 * manera mas eficiente posible. (Las llegadas tarde cuentan como presente).
	 * 
	 * @return
	 */
	public int getCantClasesConAsistenciaPerfecta() {
		int cantPerfectas = 0;

		for (int i = 0; i < this.cantClases; i++) {
			if (esClaseConAsistenciaPerfecta(i)) {
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
		int i = 0;
		boolean esPerfecta = true;

		while (i < this.cantAlumnos && esPerfecta) {
			esPerfecta = this.asistencia[i][idxClase] != Constantes.AUSENTE;
			i++;
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
	public double[] getPorcDePresentismoPorClase() {
		double porcPresentismo;
		int presentes;
		double[] porcentajes = new double[this.cantClases];

		for (int i = 0; i < this.cantClases; i++) {
			presentes = getCantPresentesEnClase(i);
			porcPresentismo = ((presentes * 100) / this.cantAlumnos);
			porcentajes[i] = porcPresentismo;
		}
		return porcentajes;
	}

	/**
	 * 
	 * @param idxClase
	 * @return
	 */
	private int getCantPresentesEnClase(int idxClase) {
		int cantAlumnosPresentes = 0;
		for (int i = 0; i < this.cantAlumnos; i++) {
			if (this.asistencia[i][idxClase] != Constantes.AUSENTE) {
				cantAlumnosPresentes++;
			}
		}
		return cantAlumnosPresentes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B-V: Mostrar los apellidos de los alumnos que dejaron la cursada
	 * (mas de 4 ausencias seguidas).
	 */
	public void mostrarDesertores() {
		for (int i = 0; i < this.cantAlumnos; i++) {
			char[] asistenciaDeAlumno = this.asistencia[i];
			if (esDesertor(asistenciaDeAlumno)) {
				System.out.println("\t-> " + this.alumnos[i].getApellido());
			}
		}
	}

	/**
	 * 
	 * @param arrayAsistencia
	 * @return
	 */
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
	 * Busca en un rango de un array de asistencias si hay algun estado que no sea
	 * AUSENTE. Si lo encuentra, devuelve en indice en el que se encuentra o -1 en
	 * caso contrario.
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

	/**
	 * 
	 */
	private void inicializarAsistenciaAleatoria() {
		Random random = new Random();
		String opciones = "PAT";
		for (int i = 0; i < cantAlumnos; i++) {
			for (int j = 0; j < cantClases; j++) {
				this.asistencia[i][j] = opciones.charAt(random.nextInt(opciones.length()));
			}
		}
	}

	/**
	 * 
	 * @param matriz
	 */
	public void dibujarMatriz(char[][] matriz) {
		System.out.println(
				"================================= ASISTENCIA SIMULADA ALEATORIA =================================");

		for (int i = 0; i < matriz.length; i++) {
			System.out.print(getAlumnos()[i].getApellido() + "\t");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println(
				"=================================================================================================");
		System.out.println("UN AUSENTE SUMA UNA FALTA COMPLETA. UNA LLEGADA TARDE SUMA MEDIA FALTA.");
		System.out.println(
				"LA CONDICION PARA RENDIR EL EXAMEN FINAL ES HABER OBTENIDO UNA ASISTENCIA MAYOR O IGUAL AL 75%.");
		System.out.println(
				"=================================================================================================");
		System.out.println();
	}
}
