package ar.edu.ort.p1.examenes._01_oop.teatro.src;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Espectador> listaDeEspectadores = new ArrayList<>();
		listaDeEspectadores.add(new Espectador("30445829", "Anna y Elsa, un musical entre hielos", false));
		listaDeEspectadores.add(new Espectador("32901776", "Anna y Elsa, un musical entre hielos", false));

		Teatro teatro = new Teatro("Teatro ", "Libertad 815");

		teatro.addObra(new Infantil("Anna y Elsa, un musical entre hielos", 120, 1, false, 7));

		teatro.ingreso(listaDeEspectadores);
		
		teatro.otorgarPremio(2);

	}

}
