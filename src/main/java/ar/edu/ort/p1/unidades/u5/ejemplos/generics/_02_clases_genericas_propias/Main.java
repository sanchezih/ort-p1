package ar.edu.ort.p1.unidades.u5.ejemplos.generics._02_clases_genericas_propias;


/**
 * https://www.youtube.com/watch?v=-KRz46_gGoM
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		MiGenerica<String> genericaString = new MiGenerica<String>();
		MiGenerica<Persona> genericaPersona = new MiGenerica<Persona>();
		MiGenerica<Automovil> genericaAutomovil = new MiGenerica<Automovil>();

		Persona persona1 = new Persona("Veronica", 42);

		genericaString.setPrimerAtributo("Un String...");
		genericaPersona.setPrimerAtributo(persona1);

		System.out.println(genericaString.getPrimerAtributo());
		System.out.println(genericaPersona.getPrimerAtributo().toString());
	}

}
