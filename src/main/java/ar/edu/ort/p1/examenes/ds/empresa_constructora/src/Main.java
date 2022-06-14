package ar.edu.ort.p1.examenes.ds.empresa_constructora.src;

public class Main {

	public static void main(String[] args) {
	//	Civil civil01 = new Civil("Susana", Dificultad.ALTO, 2);
		//System.out.println(civil01.estimar());
		
		Puente puente01= new Puente("Pepe", Dificultad.ALTO, 1, TipoPuente.ARCO);
		
		Ruta ruta01= new Ruta("Pepe", Dificultad.MEDIO, 80, 1);
		ruta01.agregarPuente(puente01);
		
		System.out.println(ruta01.estimar());

	}

}
