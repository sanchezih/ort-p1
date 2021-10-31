package ar.edu.ort.p1.u1.ejemplos._static._02_contador_de_tickets.src;

public class Main {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("2020/03/08", "31789201");
		Ticket t2 = new Ticket("2020/03/08", "37882910");
		Ticket t3 = new Ticket("2020/03/08", "32918772");
		Ticket t4 = new Ticket("2020/03/08", "32786566");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
