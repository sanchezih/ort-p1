package ar.edu.ort.p1.unidades.unidad03.practico03.ej07_figuras.src;

public class Main {

	public static void main(String[] args) {
		
		GrupoDeFiguras grupoDeFiguras = new GrupoDeFiguras();
		
		grupoDeFiguras.agregarFigura(new Rectangulo("Verde", 2.3, 3.1));
		grupoDeFiguras.agregarFigura(new Cincunferencia("Rojo", 5.4));
		grupoDeFiguras.agregarFigura(new TrianguloEquilatero("Amarillo", 1.3));
		
		// Test ejercicio C
		grupoDeFiguras.mostrarInfoDeFiguras();
	}

}
