package edu.ort.u5.ejemplos.generics._00_apunte.ejemplo_urna;

public class Main {

	public static void main(String[] args) {
		Urna<Integer> numerosSorteo = new Urna<>();

		numerosSorteo.add(1);
		numerosSorteo.add(2);
		numerosSorteo.add(3);
		numerosSorteo.add(4);
		numerosSorteo.add(5);
		numerosSorteo.add(6);
		
		System.out.println(numerosSorteo.remove());
		System.out.println(numerosSorteo.remove());
		System.out.println(numerosSorteo.remove());
		System.out.println(numerosSorteo.remove());
		System.out.println(numerosSorteo.remove());

	}

}
