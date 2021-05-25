package edu.ort.u5.ejemplos.generics._02_clases_genericas_propias;

public class Main {

	public static void main(String[] args) {
		
		MiGenerica<String> genericaString = new MiGenerica<String>();
		MiGenerica<Persona> genericaPersona = new MiGenerica<Persona>();
		MiGenerica<Automovil> genericaAutomovil = new MiGenerica<Automovil>();

		Persona persona1 = new Persona("Veronica");

		genericaString.setPrimero("Un String");
		genericaPersona.setPrimero(persona1);

		System.out.println(genericaString.getPrimero());
		System.out.println(genericaPersona.getPrimero().toString());
	}

}
