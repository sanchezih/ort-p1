package ar.edu.ort.p1.examenes._01_oop.teatro.src;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Espectador> listaDeEspectadores = new ArrayList<>();
		listaDeEspectadores.add(new Espectador("30445829", "El Principito", false));
		listaDeEspectadores.add(new Espectador("32901776", "El Principito", false));
		listaDeEspectadores.add(new Espectador("28778910", "Los Miserables", false));

		Teatro teatro = new Teatro("Teatro ", "Libertad 815");

		teatro.addObra(new Infantil("El Principito", 120, 1, false, 7));
		teatro.addObra(new Infantil("La Bella Durmiente", 90, 1, false, 7));

		teatro.addObra(new Cinematografico("The Lion King", 92, 10, false, "Pepe Director"));
		teatro.addObra(new Cinematografico("Billy Elliot the Musical", 92, 10, false, "Pepe Director"));
		teatro.addObra(new Cinematografico("Legally Blonde: The Musical", 92, 10, false, "Pepe Director"));

		teatro.addObra(new Dramatica("Los Miserables", 100, 10, true));
		teatro.addObra(new Dramatica("Hamlet", 90, 12, false));

		teatro.ingreso(listaDeEspectadores);

		teatro.otorgarPremio(2);

	}

}
