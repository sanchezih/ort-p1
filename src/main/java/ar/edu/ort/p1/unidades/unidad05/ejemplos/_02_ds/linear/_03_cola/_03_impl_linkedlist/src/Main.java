package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._03_cola._03_impl_linkedlist.src;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * https://www.geeksforgeeks.org/queue-linked-list-implementation/?ref=rp
 * 
 * @author ihsanch
 *
 */
public class Main {

	static FileReader f = null;
	static BufferedReader reader = null;

	public static void main(String args[]) {

		if (args.length < 2) {
			System.err.println("Please invoke the program like this:" + "\tLinkedQueue file1 file2");
		} else {
			String line = null;
			ColaLinkedList<String> colaDeStrings = new ColaLinkedList<String>();
			colaDeStrings.mostrarTitulo();

			for (int i = 0; i < args.length; i++) {
				try {
					f = new FileReader(args[i]);
					reader = new BufferedReader(f);
					while ((line = reader.readLine()) != null) {
						colaDeStrings.add(line);
					}
				} catch (Exception e) {
					System.err.println("File not found " + args[i]);
					return;
				}
			}
			colaDeStrings.mostrar();
			System.out.println(colaDeStrings.remove());
			colaDeStrings.mostrar();
			System.out.println(colaDeStrings.remove());
			colaDeStrings.mostrar();
			System.out.println(colaDeStrings.remove());
			colaDeStrings.mostrar();
		}
	}
}