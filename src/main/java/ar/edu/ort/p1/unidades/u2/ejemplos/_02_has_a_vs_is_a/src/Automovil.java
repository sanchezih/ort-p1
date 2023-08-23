package ar.edu.ort.p1.unidades.u2.ejemplos._02_has_a_vs_is_a.src;

/**
 * La clase Automovil usa el metodo encender() del objeto Motor a traves de la
 * composicion.
 * 
 * Podemos decir que la clase Automovil HAS-A Motor.
 *
 */

class Automovil extends Vehiculo {

	public void PruebaDeEncendido() {
		Motor motor = new Motor();
		motor.encender();
	}
}
