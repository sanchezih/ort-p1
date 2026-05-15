package ar.edu.ort.p1.unidades.unidad04.practico04.ej06_frigorifico.src;

import java.util.ArrayList;
import java.util.List;

public class Frigorifico {
	private static int CANT_VENDEDORES = 20;

	private String nombre;
	private String[] paises;
	private Vendedor[] vendedores = new Vendedor[CANT_VENDEDORES];
	private List<Cliente> clientes = new ArrayList<>();
	private List<Producto> productos = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();

	/*----------------------------------------------------------------------------*/

	public Frigorifico(String nombre, String[] paises) {
		this.nombre = nombre;
		this.paises = paises;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public String[] getPaises() {
		return paises;
	}

	public void setPaises(String[] paises) {
		this.paises = paises;
	}

	public Vendedor[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	/**
	 * Este metodo podria estar en alguna clase generica y ser reutilizado en otro
	 * proyecto
	 * 
	 * @param valores
	 * @return
	 */
	private int indexMaximo(double[] valores) {
		double max = -1;
		int idxMax = -1;

		for (int i = 0; i <= valores.length; i++) {
			if (valores[i] > max) {
				max = valores[i];
				idxMax = i;
			}
		}
		return idxMax;
	}

	/**
	 * 
	 * @return
	 */
	private double[] recaudacionesPorPais() {
		double[] recaudaciones;
		int cantPaises = Pais.values().length;
		Cliente cli;
		recaudaciones = new double[cantPaises];
		for (Pedido pedido : this.pedidos) {
			cli = buscarCliente(pedido.getCUITCliente());
			// cantidades[cli.getPais().ordinal] += pedido.costo();
		}
		return recaudaciones;
	}// Metodos 'values()' y 'ordinal()': https://youtu.be/-Q1f3eCPsfY

	/**
	 * 
	 * @param CUITCliente
	 * @return
	 */
	private Cliente buscarCliente(String CUITCliente) {
		Cliente cliEncontrado = null;
		int i = 0;

		while (i < this.clientes.size() && cliEncontrado == null) {
			if (this.clientes.get(i).getCuit().equals(CUITCliente)) {
				cliEncontrado = this.clientes.get(i);
			} else {
				i++;
			}
		}
		return cliEncontrado;
	}

}
