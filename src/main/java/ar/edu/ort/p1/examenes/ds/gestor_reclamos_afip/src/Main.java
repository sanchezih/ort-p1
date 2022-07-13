package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Main {
	public static void main(String[] args) {

		// Creo a un ciudadano con sus bienes
		Ciudadano c1 = new Ciudadano(11111111, "Pedro", "Perez");
		 c1.agregarBien(new Inmueble(220, "Cabildo 2211", 500000));
		// c1.agregarBien(new Auto(false));

		// Creo a un ciudadano con sus bienes
		Ciudadano c2 = new Ciudadano(22222222, "Clara", "Martinez");
		c2.agregarBien(new Auto(true));
		c2.agregarBien(new Moto(Tipo.CALLE));
		c2.agregarBien(new Moto(Tipo.CALLE));
		c2.agregarBien(new Moto(Tipo.CHOPERA));

		// Creo a un ciudadano con sus bienes
		Ciudadano c3 = new Ciudadano(33333333, "Felipe", "Collado");
		c3.agregarBien(new Auto(false));
		c3.agregarBien(new Inmueble(150, "Cabildo 2211", 75000));
		c3.agregarBien(new Inmueble(500, "Cabildo 2211", 2000000));

		/*----------------------------------------------------------------------------*/

		GestionAfip gestionAfip = new GestionAfip();
		gestionAfip.agregarCiudadano(c1);
		 gestionAfip.agregarCiudadano(c2);
		 gestionAfip.agregarCiudadano(c3);

		gestionAfip.agregarReclamo(new Reclamo(2500, 11111111, true));

		ColaDeReclamos reclamos = gestionAfip.procesarReclamos();
		recorrerCola(reclamos);

	}

	public static void recorrerCola(ColaDeReclamos reclamos) {
		Reclamo reclamoCent;
		Reclamo reclamo;
		reclamoCent = new Reclamo(0, -1, true);
		reclamos.add(reclamoCent);
		reclamo = reclamos.remove();

		while (reclamo.getDni() != reclamoCent.getDni()) {
			System.out.println(reclamo);
			reclamos.add(reclamo);
			reclamo = reclamos.remove();
		}
	}

}
