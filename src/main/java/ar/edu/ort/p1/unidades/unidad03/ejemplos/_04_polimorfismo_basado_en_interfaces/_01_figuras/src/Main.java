package ar.edu.ort.p1.unidades.unidad03.ejemplos._04_polimorfismo_basado_en_interfaces._01_figuras.src;

import java.util.ArrayList;
import java.util.List;

/**
 * En este ejemplo comprobamos que la interface Figura define un tipo. Podemos
 * crear un ArrayList de figuras donde tenemos figuras de distintos tipos
 * (cuadrados, circulos, rectangulos) aprovechandonos del polimorfismo.
 * 
 * Esto nos permite darle un tratamiento comun a todas las figuras. En concreto,
 * usamos un bucle for-each para recorrer la lista de figuras y obtener un area
 * total.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] Args) {

		Figura cuadrado1 = new Cuadrado(3.5f);
		Figura cuadrado2 = new Cuadrado(2.2f);
		Figura cuadrado3 = new Cuadrado(8.9f);
		Figura circulo1 = new Circulo(3.5f);
		Figura circulo2 = new Circulo(4f);
		Figura rectangulo1 = new Rectangulo(2.25f, 2.55f);
		Figura rectangulo2 = new Rectangulo(12f, 3f);

		List<Figura> listaDeFiguras; // Declaro una variable de tipo Figura (Interface)
		listaDeFiguras = new ArrayList<>(); // Inicializo la variable

		listaDeFiguras.add(cuadrado1);
		listaDeFiguras.add(cuadrado2);
		listaDeFiguras.add(cuadrado3);
		listaDeFiguras.add(circulo1);
		listaDeFiguras.add(circulo2);
		listaDeFiguras.add(rectangulo1);
		listaDeFiguras.add(rectangulo2);

		float areaTotal = 0;

		for (Figura figura : listaDeFiguras) {
			areaTotal = areaTotal + figura.calcularArea();
		}

		System.out.println("Tenemos un total de " + listaDeFiguras.size() + " figuras y su area total es de "
				+ areaTotal + " unidades cuadradas");
	}
}