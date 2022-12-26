package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear.array.miarraylist;

public class Main {
	
	public static void main(String[] args) {
	
		MiArrayListDeChars miArray = new MiArrayListDeChars();
		
		System.out.println(miArray.toString());

		miArray.add('R');
		miArray.add('S');
		
		System.out.println(miArray.toString());
	}
}
