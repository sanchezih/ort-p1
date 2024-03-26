package ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._4_public._01_ejemplo_ok.package_externo;

import ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._4_public._01_ejemplo_ok.package_interno.Saludador;

public class Main {

	public static void main(String[] args) {

		System.out.println("Accedo al atributo publico directamente: " + Saludador.atributoPublico);
		Saludador.saludadorPublico(); // Metodo1 tambien es publico
	}
}