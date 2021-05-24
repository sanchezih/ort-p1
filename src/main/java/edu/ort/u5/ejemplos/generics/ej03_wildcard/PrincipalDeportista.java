package edu.ort.u5.ejemplos.generics.ej03_wildcard;

import java.util.ArrayList;
import java.util.List;

public class PrincipalDeportista {

//	public static void main(String[] args) {
//
//		List<Persona> listaPersonas = new ArrayList<Persona>();
//		listaPersonas.add(new Persona("pepe"));
//		listaPersonas.add(new Persona("maria"));
//		imprimir(listaPersonas);
//	}
//
//	public static void imprimir(List<Persona> lista) {
//
//		for (Persona p : lista) {
//
//			System.out.println(p.getNombre());
//		}
//
//	}

	public static void main(String[] args) {

		List listaPersonas = new ArrayList();
		listaPersonas.add(new Deportista("pepe"));
		listaPersonas.add(new Deportista("maria"));
		imprimir(listaPersonas);
	}

	public static void imprimir(List<Persona> lista) {
		for (Persona p : lista) {
			System.out.println(p.getNombre());
		}
	}

}