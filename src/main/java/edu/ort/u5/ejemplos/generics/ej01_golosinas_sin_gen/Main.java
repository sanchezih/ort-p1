package edu.ort.u5.ejemplos.generics.ej01_golosinas_sin_gen;

public class Main {
	public static void main(String[] args) {
		Bolsa bolsa = new Bolsa(5);

		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		Golosina g1 = new Golosina("gominola");
		Golosina g2 = new Golosina("chicle");
		Golosina g3 = new Golosina("pastillas");
		Golosina g4 = new Golosina("pastillas");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);
		// bolsa.add(g3);
		// bolsa.add(g4);

		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());
			} else {
				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}
	}
}

/*
 * La clase Bolsa es una clase que nos permitira almacenar objetos de varios
 * tipos. Esta clase tendra un limite de objetos a almacenar. Alcanzado el
 * limite no se podran añadir mas. En nuestro caso vamos a disponer de dos
 * clases con las cuales rellenar la bolsa: Golosina y Chocolatina. Main llena
 * la Bolsa de Chocolatinas y Golosinas para luego recorrer los elementos que
 * estan en la bolsa y sacarlos por pantalla. El programa funcionara
 * correctamente, pero nos podremos dar cuenta que resulta bastante poco
 * amigable la estructura if /else en la cual se chequean cada uno de los tipos
 * a la hora de presentarlo por pantalla.
 */