package ar.edu.ort.p1.unidades.u4.practico04.ej07_estadisticas_terciario_sin_enums.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Comision comi = new Comision("comi001", 5, 12);

		// Test ejercicio B-I
		comi.mostrarAlumnosAptosParaFinal();

		System.out.println();

		// Test ejercicio B-II
		System.out.println("Eejercicio B-II: El numero total de llegadas tarde para todo el periodo de cursada es: "
				+ comi.llegadasTardeTotalesParaElPeriodo());

		System.out.println();

		// Test ejercicio B-III

		System.out.println(
				"Eejercicio B-III: La cantidad de clases con asistencia perfecta es: " + comi.cantClasesAsistenciaPerfectas());

		System.out.println();

		// Test ejercicio B-IV

		System.out.println("Ejercicio B-IV: Porcentaje de presentismo por cada clase");
		UtilArrays.mostrar(comi.porcPresentismoXClase());

		System.out.println();

		// Test ejercicio B-V
		System.out.println("Ejercicio B-V: Muestro los apellidos de los alumnos que dejaron la cursada ("
				+ Constantes.CANT_AUSENTES_DESERTOR + " ausencias seguidas o mas).");
		comi.mostrarDesertores();
	}

}
