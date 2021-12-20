package ar.edu.ort.p1.unidades.u1.ejemplos._enum._01_ejemplo_nivel_estudio.src;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarPersona(new Persona("Pepe", "Fulano", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Maria", "Sultana", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Luis", "Mengano", NivelEstudio.TERCIARIO));
		empresa.agregarPersona(new Persona("Lito", "García", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Arón", "Quilez", NivelEstudio.PRIMARIO));
		empresa.agregarPersona(new Persona("Rita", "Perez", NivelEstudio.UNIVERSITARIO));
		empresa.agregarPersona(new Persona("Alex", "Gomez", NivelEstudio.SECUNDARIO));
		empresa.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.SECUNDARIO));

		empresa.mostrarPorNivel(NivelEstudio.SECUNDARIO);
	}
}
