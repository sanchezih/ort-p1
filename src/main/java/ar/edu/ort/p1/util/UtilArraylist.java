package ar.edu.ort.p1.util;

import java.util.ArrayList;

public class UtilArraylist {
	
	/**
	 * 
	 * @param lista
	 */
	public static void listarElementos(ArrayList<?> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
