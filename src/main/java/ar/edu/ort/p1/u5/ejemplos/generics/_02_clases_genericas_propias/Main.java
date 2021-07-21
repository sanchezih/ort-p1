package ar.edu.ort.p1.u5.ejemplos.generics._02_clases_genericas_propias;

public class Main {

	public static void main(String[] args) {
		
		MiGenerica<String> genericaString = new MiGenerica<String>();
		MiGenerica<Persona> genericaPersona = new MiGenerica<Persona>();
		MiGenerica<Automovil> genericaAutomovil = new MiGenerica<Automovil>();

		Persona persona1 = new Persona("Veronica");

		genericaString.setPrimerAtributo("Un String...");
		genericaPersona.setPrimerAtributo(persona1);

		System.out.println(genericaString.getPrimerAtributo());
		System.out.println(genericaPersona.getPrimerAtributo().toString());
	}

}
