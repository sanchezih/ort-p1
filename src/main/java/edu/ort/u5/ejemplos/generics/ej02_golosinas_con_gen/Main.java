package edu.ort.u5.ejemplos.generics.ej02_golosinas_con_gen;

public class Main {
	public static void main(String[] args) {
		Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(3);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		Chocolatina c3 = new Chocolatina("sdf");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		//bolsa.add(c2);

		for (Chocolatina chocolatina : bolsa) {
			System.out.println(chocolatina.getMarca());
		}
	}
}