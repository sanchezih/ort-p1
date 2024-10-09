package ar.edu.ort.p1.unidades.unidad04.practico04.ej06_frigorifico.src;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int idVendedor;
	private String CUITCliente;
	private List<ItemPedido> items = new ArrayList<ItemPedido>();

	public Pedido(int idVendedor, String cUITCliente, ArrayList<ItemPedido> items) {

		this.idVendedor = idVendedor;
		CUITCliente = cUITCliente;
		this.items = items;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getCUITCliente() {
		return CUITCliente;
	}

	public void setCUITCliente(String cUITCliente) {
		CUITCliente = cUITCliente;
	}

	public List<ItemPedido> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}

	public double costo() {
		double acu = 0;
		for (ItemPedido item : this.items) {
			acu += item.costo();
		}
		return acu;
	}

}
