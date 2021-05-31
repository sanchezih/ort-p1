package edu.ort.u5.ejemplos.cola.cola_con_lista_enlazada;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestLinkedQueue {

	public static void main(String args[]) {

		FileReader f = null; // to read files
		BufferedReader reader = null; // reading buffer
		String line = null; // read lines
		LinkedQueue queue = new LinkedQueue(); // initialization

		if (args.length < 1) {
			System.err.println("Please invoke the program like this:");
			System.err.println("\tLinkedQueue file1 file2");
		}

		// opens the first file
		try {
			f = new FileReader(args[0]);
			reader = new BufferedReader(f);
			while ((line = reader.readLine()) != null)
				queue.enqueue(line);
		} catch (Exception e) {
			System.err.println("File not found " + args[0]);
			return;
		}

		// opens the second file
		try {
			f = new FileReader(args[1]);
			reader = new BufferedReader(f);
			while ((line = reader.readLine()) != null)
				queue.enqueue(line);
		} catch (Exception e) {
			System.err.println("File not found " + args[1]);
			return;
		}

		// Gets the strings from the queue and prints them
		while ((line = (String) queue.dequeue()) != null) {
			System.out.println(line);
		}
	}

}