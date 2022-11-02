package ar.edu.ort.p1.examenes.oop.lib_componentes.src;

public class Main {

	public static void main(String[] args) {

		Boton boton01 = new Boton("Aceptar", "Blanco", true, new Tamanio(300, 100), new Posicion(500, 750));
		// boton01.dibujar();

		Etiqueta etiqueta01 = new Etiqueta("Nuevo", "Rojo", true, new Tamanio(300, 100), new Posicion(500, 750),
				"Arial");
		// etiqueta01.dibujar();

		CampoDeTexto campoDeTexto01 = new CampoDeTexto("", "Blanco", true, new Tamanio(300, 100),
				new Posicion(500, 750), true, true);
		// campoDeTexto01.dibujar();

		Ventana ventana01 = new Ventana("Un texto", "Negro", false, new Tamanio(640, 480), new Posicion(100, 100), true,
				Estado.ABIERTA);
		System.out.println(ventana01.agregar(boton01));
		System.out.println(ventana01.agregar(etiqueta01));
		System.out.println(ventana01.agregar(campoDeTexto01));

		ventana01.dibujar();

		VentanaDeError ve01 = new VentanaDeError("Numero incorrecto", "Blanco", true, new Tamanio(640, 480),
				new Posicion(100, 100), true, Estado.ABIERTA);

		ve01.dibujar();
	}

}
