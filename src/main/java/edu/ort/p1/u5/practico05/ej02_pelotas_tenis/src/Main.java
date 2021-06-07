package edu.ort.p1.u5.practico05.ej02_pelotas_tenis.src;

public class Main {

	public static void main(String[] args) {

		PelotaDeTenis pelota1 = new PelotaDeTenis();
		PelotaDeTenis pelota2 = new PelotaDeTenis();
		PelotaDeTenis pelota3 = new PelotaDeTenis();

		TuboPelotasDeTenis tubo1 = new TuboPelotasDeTenis();

		tubo1.push(pelota1);
		tubo1.push(pelota2);
		tubo1.push(pelota3);

		System.out.println(ClubDeTenis.esTuboUsado(tubo1));

	}

}
