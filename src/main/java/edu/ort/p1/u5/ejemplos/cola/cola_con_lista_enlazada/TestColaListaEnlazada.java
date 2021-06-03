package edu.ort.p1.u5.ejemplos.cola.cola_con_lista_enlazada;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestColaListaEnlazada {

	static FileReader f = null;
	static BufferedReader reader = null;

	public static void main(String args[]) {

		String line = null;
		ColaListaEnlazada cola = new ColaListaEnlazada();

		if (args.length < 2) {
			System.err.println("Please invoke the program like this:" + "\\tLinkedQueue file1 file2");
		} else {
			for (int i = 0; i < args.length; i++) {
				try {
					f = new FileReader(args[i]);
					reader = new BufferedReader(f);
					while ((line = reader.readLine()) != null) {
						cola.add(line);
					}
				} catch (Exception e) {
					System.err.println("File not found " + args[i]);
					return;
				}
			}
		}

		while ((line = (String) cola.remove()) != null) {
			System.out.println(line);
		}
	}

}