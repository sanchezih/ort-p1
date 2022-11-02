package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Main {
	
	private final static int TURNOS = 3;
	private final static int DIAS_SEMANA = 5;

	public static void main(String[] args) {

		Instituto instituto = new Instituto("AS2021");

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP7 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP7[1][2] = new Cargo("Institucion 1", 2, Nivel.POSGRADO);
		cargosP7[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP7[3][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);

		// En falta porque tiene nivel universitario y tiene cargos en posgrado
		instituto.agregarEmpleado(new Profesor("77777777", 2003, Nivel.UNIVERSITARIO, cargosP7));

		/*----------------------------------------------------------------------------*/

		// OK
		instituto.agregarEmpleado(new Auxiliar("66666666", 2022, 32));

		/*----------------------------------------------------------------------------*/

		// En falta porque trabaja menos de 20 Hs. semanales
		instituto.agregarEmpleado(new Auxiliar("55555555", 2018, 12));

		/*----------------------------------------------------------------------------*/

		// OK
		instituto.agregarEmpleado(new Auxiliar("22222222", 2015, 24));

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP1 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP1[1][2] = new Cargo("Institucion 1", 2, Nivel.POSGRADO);
		cargosP1[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP1[3][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP1[0][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);

		// En falta porque tiene mas de 3 cargos nocturnos
		instituto.agregarEmpleado(new Profesor("11111111", 2012, Nivel.POSGRADO, cargosP1));

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP8 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP8[1][2] = new Cargo("Institucion 1", 2, Nivel.TERCIARIO);
		cargosP8[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP8[3][2] = new Cargo("Institucion 1", 2, Nivel.TERCIARIO);

		// OK
		instituto.agregarEmpleado(new Profesor("88888888", 2012, Nivel.POSGRADO, cargosP8));

		/*----------------------------------------------------------------------------*/

		// En falta porque tiene mas de 10 anios de antiguedad
		instituto.agregarEmpleado(new Auxiliar("33333333", 2002, 24));

		/*----------------------------------------------------------------------------*/

		instituto.mostrarColaEmps();

		// Test ejercicio B
		ListaEmpsPorDNI listaDeEmpleadosEnFalta = instituto.empleadosEnFalta();

		System.out.println();

		System.out.println("Lista de empleados con irregularidades, ordenados por DNI (ASC):");
		for (Empleado e : listaDeEmpleadosEnFalta) {
			System.out.println("\t-> " + e);
		}

		System.out.println();

		instituto.mostrarColaEmps();
	}

}
