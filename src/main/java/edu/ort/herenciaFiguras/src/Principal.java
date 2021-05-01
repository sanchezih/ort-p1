package edu.ort.herenciaFiguras.src;

/**
 * Write a description of class Principal here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3, 4);
		t1.calculaArea();
		System.out.println("El area del triangulo es: " + t1.accedeArea());
	}
}