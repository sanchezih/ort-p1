package ar.edu.ort.p1.u3.ejemplos.interfacesEjemploFigura.src;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.p1.u3.ejemplos.interfacesEjemploFigura.src.figuras.Circulo;
import ar.edu.ort.p1.u3.ejemplos.interfacesEjemploFigura.src.figuras.Cuadrado;
import ar.edu.ort.p1.u3.ejemplos.interfacesEjemploFigura.src.figuras.Figura;
import ar.edu.ort.p1.u3.ejemplos.interfacesEjemploFigura.src.figuras.Rectangulo;

public class Main {
	public static void main(String[] Args) {

		Figura cuad1 = new Cuadrado(3.5f);
		Figura cuad2 = new Cuadrado(2.2f);
		Figura cuad3 = new Cuadrado(8.9f);
		Figura circ1 = new Circulo(3.5f);
		Figura circ2 = new Circulo(4f);
		Figura rect1 = new Rectangulo(2.25f, 2.55f);
		Figura rect2 = new Rectangulo(12f, 3f);

		List<Figura> serieDeFiguras; // Declaro una variable con el tipo de la interface Figura
		serieDeFiguras = new ArrayList<Figura>(); // Inicializo la variable

		serieDeFiguras.add(cuad1);
		serieDeFiguras.add(cuad2);
		serieDeFiguras.add(cuad3);
		serieDeFiguras.add(circ1);
		serieDeFiguras.add(circ2);
		serieDeFiguras.add(rect1);
		serieDeFiguras.add(rect2);

		float areaTotal = 0;

		for (Figura tmp : serieDeFiguras) {
			areaTotal = areaTotal + tmp.area();
		}

		System.out.println("Tenemos un total de " + serieDeFiguras.size() + " figuras y su �rea total es de "
				+ areaTotal + " unidades cuadradas");
	}
}

/*
 * En este ejemplo comprobamos que la interface Figura define un tipo. Podemos
 * crear un ArrayList de figuras donde tenemos figuras de distintos tipos
 * (cuadrados, c�rculos, rect�ngulos) aprovech�ndonos del polimorfismo. Esto nos
 * permite darle un tratamiento com�n a todas las figuras. En concreto, usamos
 * un bucle for-each para recorrer la lista de figuras y obtener un area total.
 */