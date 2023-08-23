package ar.edu.ort.p1.unidades.u1.ejemplos._03_static._02_contador_de_tickets.src;

public class Main {

	public static void main(String[] args) {

		Ticket ticket1 = new Ticket("2020/03/08", "11111111");
		Ticket ticket2 = new Ticket("2020/03/08", "22222222");
		Ticket ticket3 = new Ticket("2020/03/08", "33333333");
		Ticket ticket4 = new Ticket("2020/03/08", "44444444");

		System.out.println(ticket1);
		System.out.println(ticket2);
		System.out.println(ticket3);
		System.out.println(ticket4);
	}
}
