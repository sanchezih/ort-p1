package ar.edu.ort.p1.examenes._02_ds.empresa_constructora.src;

public class Main {

	public static void main(String[] args) {

		ObraCivil oc01 = new ObraCivil("Susana", Dificultad.MEDIO, "Resistencia", 2);
		oc01.mostrarInformacion();

		Puente p01 = new Puente("Jose", Dificultad.ALTO, 2, TipoPuente.VIGA, false);
		p01.mostrarInformacion();

		Ruta ruta01 = new Ruta("Maria", Dificultad.MEDIO, 80, 1, false);
		ruta01.agregarPuente(p01);
		ruta01.mostrarInformacion();

		EmpresaConstructora empresaConstructora = new EmpresaConstructora();
		empresaConstructora.agregarObra(oc01);
		empresaConstructora.agregarObra(p01);
		empresaConstructora.agregarObra(ruta01);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio C
		empresaConstructora.mostrarMatrizDeTipoDeObraPorDificultad();

	}

}
