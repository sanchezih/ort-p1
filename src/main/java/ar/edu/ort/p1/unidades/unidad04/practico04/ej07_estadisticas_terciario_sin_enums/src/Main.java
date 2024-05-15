package ar.edu.ort.p1.unidades.unidad04.practico04.ej07_estadisticas_terciario_sin_enums.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		Comision comision = new Comision("comi001", 5, 12);

		// Test ejercicio B-I
		comision.mostrarAlumnosAptosParaFinal();

		System.out.println();

		// Test ejercicio B-II
		System.out.println("Ejercicio B-II - El numero total de llegadas tarde para todo el periodo de cursada es: "
				+ comision.getCantLlegadasTardeParaElPeriodo());

		System.out.println();

		// Test ejercicio B-III
		System.out.println("Ejercicio B-III - La cantidad de clases con asistencia perfecta es: "
				+ comision.getCantClasesConAsistenciaPerfecta());

		System.out.println();

		// Test ejercicio B-IV
		System.out.println("Ejercicio B-IV - Porcentaje de presentismo por cada clase");
		UtilArrays.mostrar(comision.getPorcDePresentismoPorClase());

		System.out.println();

		// Test ejercicio B-V
		System.out.println("Ejercicio B-V - Muestro los apellidos de los alumnos que dejaron la cursada ("
				+ Constantes.CANT_AUSENTES_DESERTOR + " ausencias seguidas o mas).");
		comision.mostrarDesertores();
	}

}
