package ar.edu.ort.p1.u3.ejemplos.herenciaFiguras.src;

/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangulo extends Figura {
	private float base;
	private float altura;

	public Triangulo(float b, float a) {
		base = b;
		altura = a;
	}

	public void calculaArea() {
		area = base * altura / 2;
	}
}