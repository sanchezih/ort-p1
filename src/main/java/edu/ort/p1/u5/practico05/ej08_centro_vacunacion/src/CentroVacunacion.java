package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class CentroVacunacion {

	private static final int CANT_COLAS = 3;
	private ColaDePersonas[] pacientes;
	
	
		
	public CentroVacunacion() {
		
		this.pacientes = new ColaDePersonas[CANT_COLAS];
	}

	public ColaNodos<Persona> obtenerColaPorPrioridadYOrden() {
		
		ColaDePersonas colaFinal = new ColaDePersonas();
		ListaPersonasXPrioridadOrden lista = new ListaPersonasXPrioridadOrden();
		
		
		cargarLista ( lista) ;
				 
		pasarListaAcola(lista, colaFinal);
						
		return colaFinal;
				
	}

	
	public void cargarColas(ColaDePersonas colaCargar1, ColaDePersonas colaCargar2, ColaDePersonas colaCargar3){
			
					
			pacientes[0] = colaCargar1; 
			
			pacientes[1] = colaCargar2; 
			
			pacientes[2] = colaCargar3; 
				
	}
	
	
	
	public void mostrarLista() {
		
		ColaNodos<Persona> colaFinal = obtenerColaPorPrioridadYOrden();
		
		colaFinal.add(null);
		
		Persona aux = colaFinal.remove();
		
		while( aux != null ) {
			
			System.out.println(aux);		
			
			colaFinal.add(aux);
			
			aux = colaFinal.remove();
			
		}
		
		
		
	}
	
	
	private void pasarListaAcola(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		
		for (PersonaEnCola penCola : lista) {
			
			 cola.add( penCola.getLaPersona());
		}	
		
	}

		
	private void cargarLista(ListaPersonasXPrioridadOrden lista) {
		
		for (int i = 0; i < CANT_COLAS; i++) {
			
			ColaDePersonas cola = this.pacientes[i]; 
			
			cargarLista(lista, cola);
			
			
		}
		
		
	}

	private void cargarLista(ListaPersonasXPrioridadOrden lista, ColaDePersonas cola) {
		int orden = 0;
		
		
		while ( !cola.isEmpty() )  {
			
				
			Persona p = cola.remove();
			
			orden++;
			
			PersonaEnCola perEnCola = new PersonaEnCola (  p , orden, p.getprioridad()  );
			 
						
			lista.add(perEnCola);
								
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
