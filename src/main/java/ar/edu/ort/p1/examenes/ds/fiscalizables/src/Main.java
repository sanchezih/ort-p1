package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

public class Main {
	private final static int TURNOS = 3;
	private final static int DIAS_SEMANA = 5;

	public static void main(String[] args) {

		Instituto instituto = new Instituto("AS2021");

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP32100890 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP32100890[1][2] = new Cargo("Institucion 1", 2, Nivel.POSGRADO);
		cargosP32100890[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP32100890[3][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);

		// En falta porque tiene nivel universitario y tiene cargos en posgrado
		instituto.agregarEmpleado(new Profesor("32100890", 2003, Nivel.UNIVERSITARIO, cargosP32100890));

		/*----------------------------------------------------------------------------*/

		// OK
		instituto.agregarEmpleado(new Auxiliar("31099505", 2022, 32));

		/*----------------------------------------------------------------------------*/

		// En falta porque tiene trabaja menos de 20 Hs. semanales
		instituto.agregarEmpleado(new Auxiliar("31328442", 2018, 12));

		/*----------------------------------------------------------------------------*/

		// OK
		instituto.agregarEmpleado(new Auxiliar("30400177", 2015, 24));

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP29566712 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP29566712[1][2] = new Cargo("Institucion 1", 2, Nivel.POSGRADO);
		cargosP29566712[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP29566712[3][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP29566712[0][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);

		// En falta porque tiene mas de 3 cargos nocturnos
		instituto.agregarEmpleado(new Profesor("29566712", 2012, Nivel.POSGRADO, cargosP29566712));

		/*----------------------------------------------------------------------------*/

		Cargo[][] cargosP18950781 = new Cargo[DIAS_SEMANA][TURNOS];
		cargosP18950781[1][2] = new Cargo("Institucion 1", 2, Nivel.TERCIARIO);
		cargosP18950781[2][2] = new Cargo("Institucion 1", 2, Nivel.UNIVERSITARIO);
		cargosP18950781[3][2] = new Cargo("Institucion 1", 2, Nivel.TERCIARIO);

		// OK
		instituto.agregarEmpleado(new Profesor("18950781", 2012, Nivel.POSGRADO, cargosP18950781));

		/*----------------------------------------------------------------------------*/

		// En falta porque tiene mas de 10 anios de antiguedad
		instituto.agregarEmpleado(new Auxiliar("31118920", 2002, 24));

		/*----------------------------------------------------------------------------*/

		ListaEmpsPorDNI lista = instituto.empleadosEnFalta();

		System.out.println("Lista de empleados con irregularidades:");
		for (Empleado e : lista) {
			System.out.println("\t-> " + e);
		}
	}

}
