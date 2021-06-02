package edu.ort.p1.u5.ejemplos.generics._01_que_es_y_motivacion;

import java.io.File;
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		MiArrayList archivos = new MiArrayList(5);

		archivos.add("Juan");
		archivos.add("Maria");
		archivos.add("Ana");
		archivos.add("Sandra");

		archivos.add(new File("pedidos.db"));

		String nombrePersona = (String) archivos.get(3); // Estamos obligados a castear

		// File nombrePersona = (File) archivos.get(0);// Estamos obligados a castear

		System.out.println(nombrePersona);

		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Hola");
		//palabras.add(2);
	}

}
 