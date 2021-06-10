package edu.ort.p1.u5.practico05.ej02_pelotas_tenis.src;

public class Main {

	public static void main(String[] args) {

		/* Creo 3 pelotas nuevas */
		PelotaDeTenis pNueva1 = new PelotaDeTenis();
		PelotaDeTenis pNueva2 = new PelotaDeTenis();
		PelotaDeTenis pNueva3 = new PelotaDeTenis();

		/* Creo 2 pelotas usadas */
		PelotaDeTenis pUsada1 = new PelotaDeTenis();
		pUsada1.setEstado(Estado.USADA);

		PelotaDeTenis pUsada2 = new PelotaDeTenis();
		pUsada2.setEstado(Estado.USADA);

		/* Creo 2 pelotas gastadas */
		PelotaDeTenis pGastada1 = new PelotaDeTenis();
		pGastada1.setEstado(Estado.GASTADA);

		PelotaDeTenis pGastada2 = new PelotaDeTenis();
		pGastada1.setEstado(Estado.GASTADA);

		/*----------------------------------------------------------------------------*/

		/* Creo 1 tubo con 3 pelotas nuevas */
		TuboPelotasDeTenis tubo3nuevas = new TuboPelotasDeTenis();
		tubo3nuevas.push(pNueva1);
		tubo3nuevas.push(pNueva2);
		tubo3nuevas.push(pNueva3);

		/* Creo 1 tubo con 2 nuevas y 1 gastada */
		TuboPelotasDeTenis tubo2nuevas1gastada = new TuboPelotasDeTenis();
		tubo2nuevas1gastada.push(pNueva2);
		tubo2nuevas1gastada.push(pNueva1);
		tubo2nuevas1gastada.push(pGastada1);

		/* Creo 1 tubo con 1 nuevas y 2 usadas */
		TuboPelotasDeTenis tubo1nueva2usadas = new TuboPelotasDeTenis();
		tubo1nueva2usadas.push(pNueva3);
		tubo1nueva2usadas.push(pUsada1);
		tubo1nueva2usadas.push(pUsada2);

		/* Creo 1 tubo con 2 pelotas con cualquier estado (Incompleto) */
		TuboPelotasDeTenis tubo2pelotas = new TuboPelotasDeTenis();
		tubo2pelotas.push(pNueva1);
		tubo2pelotas.push(pNueva2);

		/*----------------------------------------------------------------------------*/

		/*
		 * Un tubo de pelotas se considerara usado cuando no este lleno o al menos una
		 * de sus pelotas no sea nueva.
		 */

		System.out.println("Muestro cuales tubos son usados...");
		System.out.println("tubo3nuevas: " + ClubDeTenis.esTuboUsado(tubo3nuevas));
		System.out.println("tubo2nuevas1gastada: " + ClubDeTenis.esTuboUsado(tubo2nuevas1gastada));
		System.out.println("tubo1nueva2usadas: " + ClubDeTenis.esTuboUsado(tubo1nueva2usadas));
		System.out.println("tubo2pelotas: " + ClubDeTenis.esTuboUsado(tubo2pelotas));

	}

}
