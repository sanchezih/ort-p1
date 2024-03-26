package ar.edu.ort.p1.unidades.unidad02.ejemplos._04_constructores._3_sobrecarga_de_constructor;

public class Main {

	public static void main(String args[]) {

		Estudiante estudiante1 = new Estudiante(111, "Maria");
		Estudiante estudiante2 = new Estudiante(222, "Tomas", 25);

		estudiante1.mostrar();
		estudiante2.mostrar();
	}

}
