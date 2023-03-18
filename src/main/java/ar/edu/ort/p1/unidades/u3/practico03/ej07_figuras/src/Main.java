package ar.edu.ort.p1.unidades.u3.practico03.ej07_figuras.src;

public class Main {

	public static void main(String[] args) {
		
		GrupoDeFiguras gdf = new GrupoDeFiguras();
		
		gdf.agregarFigura(new Rectangulo("Verde", 2.3, 3.1));
		gdf.agregarFigura(new Cincunferencia("Rojo", 5.4));
		gdf.agregarFigura(new TrianguloEquilatero("Amarillo", 1.3));
		
		gdf.mostrarInfoDeFiguras();
	}

}
