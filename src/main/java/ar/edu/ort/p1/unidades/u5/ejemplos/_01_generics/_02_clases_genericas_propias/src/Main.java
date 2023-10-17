package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src;

import ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.clases_generias_propias.MiGenerica1;
import ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.clases_generias_propias.MiGenerica2;
import ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.entidades.Automovil;
import ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.entidades.Persona;

/**
 * https://www.youtube.com/watch?v=-KRz46_gGoM
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Entre <> se debe indicar que tipo va a manejar la clase. En este caso, String
		 */
		MiGenerica1<String> genericaString = new MiGenerica1<String>();
		genericaString.setPrimerAtributo("Un String...");
		System.out.println(genericaString.getPrimerAtributo());

		/**
		 * Entre <> se debe indicar que tipo va a manejar la clase. En este caso,
		 * Persona
		 */
		MiGenerica1<Persona> genericaPersona = new MiGenerica1<Persona>();
		genericaPersona.setPrimerAtributo(new Persona("Veronica", 42));
		System.out.println(genericaPersona.getPrimerAtributo().toString());

		/**
		 * Entre <> se debe indicar que tipo va a manejar la clase. En este caso,
		 * Automovil
		 */
		MiGenerica1<Automovil> genericaAutomovil = new MiGenerica1<Automovil>();
		genericaAutomovil.setPrimerAtributo(new Automovil("Volvo", "S60"));
		System.out.println(genericaAutomovil.getPrimerAtributo().toString());

	}

}
