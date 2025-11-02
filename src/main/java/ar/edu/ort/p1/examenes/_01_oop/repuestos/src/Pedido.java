package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private String id;
	private Date fecha;
	private float impTotPed;
	private ArrayList<RepuestoPedido> repuestos;
	private Zona zona;
	private Distribuidor distribuidor;

	/*----------------------------------------------------------------------------*/

	public Pedido(String id, Date fecha, float impTotPed, ArrayList<RepuestoPedido> repuestos, Zona zona,
			Distribuidor distribuidor) {
		this.id = id;
		this.fecha = fecha;
		this.impTotPed = impTotPed;
		this.repuestos = repuestos;
		this.zona = zona;
		this.distribuidor = distribuidor;
	}

	/*----------------------------------------------------------------------------*/

	public String getId() {
		return id;
	}

	public boolean esPosibleEnviar() {
		return verificarStock() && !this.zona.estaBloqueado() && !this.distribuidor.estaBloqueado();
	}

	private boolean verificarStock() {
		int x = 0;
		boolean ok = true;
		RepuestoPedido rp;

		while (x < repuestos.size() && ok) {
			rp = repuestos.get(x);
			ok = rp.verificarStock();
			x++;
		}
		return ok;
	}
	
	
	public float calcularComisionAPagar() {
		float impComi =0;
		impComi=this.distribuidor.calcularComision(this.impTotPed);
		return impComi;
	}
	
	

}
