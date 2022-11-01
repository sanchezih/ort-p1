package ar.edu.ort.p1.unidades.u5.ejemplos.generics._00_que_es_y_motivacion;

import java.io.File;
import java.util.ArrayList;

/**
 * https://www.youtube.com/watch?v=MFu8a_LpnIc
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		MiArrayList archivos = new MiArrayList(5);

		// Agrego 4 elementos de tipo String
		archivos.addElemento("Juan");
		archivos.addElemento("Maria");
		archivos.addElemento("Ana");
		archivos.addElemento("Sandra");

		/*
		 * IMPORTANTE: Como el array contiene Objects, si no casteamos, nos dara un
		 * error en tiempo de compilacion.
		 */
		String nombrePersona = (String) archivos.getElemento(2);
		System.out.println(nombrePersona);

		/*----------------------------------------------------------------------------*/

		/*
		 * Agregar al array un objeto de tipo File no dara un error en tiempo de
		 * compilacion porque el array contiene objetos de tipo Object
		 */
		archivos.addElemento(new File("/home/ignacio/pedidos.txt"));

		// Casteo a File porque se que el elemento en la posicion 4 es de tipo File
		File file01 = (File) archivos.getElemento(4);
		System.out.println(file01);

		// Hacer esto dara un error en tiempo de ejecucion
		File file02 = (File) archivos.getElemento(3);
		System.out.println(file02);

		/*----------------------------------------------------------------------------*/

		/*
		 * Declarar un ArrayList de String y querer agregarle un int nos dara un error
		 * en tiempo de copilacion, mas no en tiempo de ejecucion
		 */
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Hola");
		// palabras.add(2);
	}

}
