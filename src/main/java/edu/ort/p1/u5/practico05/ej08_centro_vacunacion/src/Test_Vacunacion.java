package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class Test_Vacunacion {

	public static void main(String[] args) {
		
		CentroVacunacion elCentro = new CentroVacunacion();

		ColaDePersonas cola1 = new ColaDePersonas();
		cola1.add(new Persona("11223344", "Jose", 30, true));
		cola1.add(new Persona("1223344", "Marcos", 30, false));
		cola1.add(new Persona("223344", "Tomas", 30, false));
		cola1.add(new Persona("22223344", "Martin", 76, false));
		cola1.add(new Medico("22223344", "Martin", 76, false, "qwe123"));
		cola1.add(new Educador("22223344", "Martin", 76, false, NivelEducacion.PRIMARIO));

		ColaDePersonas cola2 = new ColaDePersonas();

		cola2.add(new Persona("323344", "Maria", 30, true));
		cola2.add(new Persona("3423344", "Marta", 31, false));
		cola2.add(new Medico("3123344", "Sofia", 35, false, "asd123"));
		cola2.add(new Educador("333344", "Cata", 65, false, NivelEducacion.SECUNDARIO));

		ColaDePersonas cola3 = new ColaDePersonas();

		cola3.add(new Persona("423344", "John", 30, true));
		cola3.add(new Persona("4423344", "Michel", 30, false));
		cola3.add(new Medico("4123344", "Michael", 55, false, "zxc123"));
		cola3.add(new Educador("433344", "Alex", 45, false, NivelEducacion.SECUNDARIO));
		cola3.add(new Educador("433344", "Marhie", 45, false, NivelEducacion.INICIAL));
		cola3.add(new Educador("433344", "Archi", 45, false, NivelEducacion.INICIAL));

		elCentro.cargarColas(cola1, cola2, cola3);

		elCentro.mostrarLista();

	}

}
