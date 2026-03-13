package ar.edu.ort.p1.unidades.unidad01.practico01.ej09_ortify.src;

public class Main {

	public static void main(String[] args) {

		// Creo los usuarios
		Usuario jperez = new Usuario("jperez", Estado.HABILITADO);
		Usuario mfernandez = new Usuario("mfernandez", Estado.HABILITADO);
		Usuario frodriguez = new Usuario("frodriguez", Estado.HABILITADO);
		Usuario alopez = new Usuario("alopez", Estado.HABILITADO);

		// Creo las canciones y los likes
		
		Cancion abacab01 = new Cancion("c1", "Abacab", 417);
		abacab01.addLiker(jperez);
		abacab01.addLiker(mfernandez);

		Cancion abacab02 = new Cancion("c2", "No Reply at All", 274);
		abacab02.addLiker(jperez);
		abacab02.addLiker(mfernandez);

		Cancion abacab03 = new Cancion("c3", "Me and Sarah Jane", 363);
		abacab03.addLiker(jperez);
		abacab03.addLiker(mfernandez);

		Cancion abacab04 = new Cancion("c4", "Keep It Dark", 273);
		abacab04.addLiker(jperez);
		abacab04.addLiker(mfernandez);

		Cancion abacab05 = new Cancion("c5", "Dodo-Lurker", 452);
		abacab05.addLiker(jperez);
		abacab05.addLiker(mfernandez);

		Cancion abacab06 = new Cancion("c6", "Who dunnit?", 205);
		abacab06.addLiker(jperez);
		abacab06.addLiker(mfernandez);

		Cancion abacab07 = new Cancion("c7", "Man On The Corner", 270);
		abacab07.addLiker(jperez);
		abacab07.addLiker(mfernandez);

		Cancion abacab08 = new Cancion("c8", "Like It Or Not", 300);
		abacab08.addLiker(jperez);
		abacab08.addLiker(mfernandez);

		Cancion abacab09 = new Cancion("c9", "Another Record", 280);
		abacab09.addLiker(jperez);
		abacab09.addLiker(mfernandez);

		/*------------------*/

		Cancion innuendo01 = new Cancion("c10", "Innuendo", 390);
		innuendo01.addLiker(mfernandez);

		Cancion innuendo02 = new Cancion("c11", "I'm Going Slightly Mad", 263);
		innuendo02.addLiker(mfernandez);

		Cancion innuendo03 = new Cancion("c12", "Headlong", 280);
		innuendo03.addLiker(mfernandez);

		Cancion innuendo04 = new Cancion("c13", "I Can't Live With You", 276);
		innuendo04.addLiker(mfernandez);

		Cancion innuendo05 = new Cancion("c14", "Don't Try So Hard", 220);
		innuendo05.addLiker(mfernandez);

		Cancion innuendo06 = new Cancion("c15", "Ride The Wild Wind", 284);
		innuendo06.addLiker(mfernandez);

		Cancion innuendo07 = new Cancion("c16", "All God's People", 260);
		innuendo07.addLiker(mfernandez);

		Cancion innuendo08 = new Cancion("c17", "These Are The Days Of Our Lives", 254);
		innuendo08.addLiker(mfernandez);

		Cancion innuendo09 = new Cancion("c18", "Delilah»", 216);
		innuendo09.addLiker(mfernandez);

		Cancion innuendo10 = new Cancion("c19", "The Hitman", 300);
		innuendo10.addLiker(mfernandez);

		Cancion innuendo11 = new Cancion("c20", "Bijou", 220);
		innuendo11.addLiker(mfernandez);

		Cancion innuendo12 = new Cancion("c21", "The Show Must Go On", 280);
		innuendo12.addLiker(mfernandez);

		/*------------------*/

		Cancion outofthisworld01 = new Cancion("c22", "Superstitious", 275);
		Cancion outofthisworld02 = new Cancion("c23", "Let the Good Times Rock", 244);
		Cancion outofthisworld03 = new Cancion("c24", "Open Your Heart", 244);
		Cancion outofthisworld04 = new Cancion("c25", "More Than Meets the Eye", 200);
		Cancion outofthisworld05 = new Cancion("c26", "Coast to Coast", 240);
		Cancion outofthisworld06 = new Cancion("c27", "Ready or Not", 245);
		Cancion outofthisworld07 = new Cancion("c28", "Sign of the Times", 255);
		Cancion outofthisworld08 = new Cancion("c29", "Just the Beginning", 272);
		Cancion outofthisworld09 = new Cancion("c30", "Never Say Die", 240);
		Cancion outofthisworld10 = new Cancion("c31", "Lights and Shadows", 244);
		Cancion outofthisworld11 = new Cancion("c32", "Tower's Callin'", 228);
		Cancion outofthisworld12 = new Cancion("c33", "Tomorrow", 184);

		/*----------------------------------------------------------------------------*/

		// Creo los artistas
		Artista genesis = new Artista("a01", "Genesis");
		genesis.addCancion(abacab01);
		genesis.addCancion(abacab02);
		genesis.addCancion(abacab03);
		genesis.addCancion(abacab04);
		genesis.addCancion(abacab05);
		genesis.addCancion(abacab06);
		genesis.addCancion(abacab07);
		genesis.addCancion(abacab08);
		genesis.addCancion(abacab09);

		Artista queen = new Artista("a02", "Queen");
		queen.addCancion(innuendo01);
		queen.addCancion(innuendo02);
		queen.addCancion(innuendo03);
		queen.addCancion(innuendo04);
		queen.addCancion(innuendo05);
		queen.addCancion(innuendo06);
		queen.addCancion(innuendo07);
		queen.addCancion(innuendo08);
		queen.addCancion(innuendo09);
		queen.addCancion(innuendo10);
		queen.addCancion(innuendo11);
		queen.addCancion(innuendo12);

		Artista europe = new Artista("a03", "Europe");
		europe.addCancion(outofthisworld01);
		europe.addCancion(outofthisworld02);
		europe.addCancion(outofthisworld03);
		europe.addCancion(outofthisworld04);
		europe.addCancion(outofthisworld05);
		europe.addCancion(outofthisworld06);
		europe.addCancion(outofthisworld07);
		europe.addCancion(outofthisworld08);
		europe.addCancion(outofthisworld09);
		europe.addCancion(outofthisworld10);
		europe.addCancion(outofthisworld11);
		europe.addCancion(outofthisworld12);

		// Creo la aplicacion
		Aplicacion ortify = new Aplicacion("ORTify");

		ortify.addArtista(europe);
		ortify.addArtista(queen);
		ortify.addArtista(genesis);

		ortify.addUsuario(alopez);
		ortify.addUsuario(frodriguez);
		ortify.addUsuario(mfernandez);
		ortify.addUsuario(jperez);

		/*----------------------------------------------------------------------------*/

		System.out.println("Muestro la lista de usuarios al momento");
		System.out.println(ortify.getUsuarios());

		System.out.println();

		// Teste ejercicio B
		System.out.println("Ejercicio B: Duraciones promedio");
		genesis.mostraDuracionPromedio();
		queen.mostraDuracionPromedio();
		europe.mostraDuracionPromedio();

		System.out.println();

		// Test ejercicio C
		System.out.println("Ejercicio C: Fans destacados");
		System.out.println("Es mfernandez fan destacado de Queen?: " + queen.esFanDestacado(mfernandez));
		System.out.println("Es jperez fan destacado de Queen?: " + queen.esFanDestacado(jperez));

		System.out.println();

		// Test ejercicio D
		System.out.println("Ejercicio D: Las primeras 5 canciones de Europe:");
		System.out.println(europe.primeras5Canciones());

		System.out.println();

		// Test ejercicio E
		System.out.println("Ejercicio E: Elimino usuarios");
		System.out.println("Elimino el usuario: " + ortify.borrarUsuario("alopez").getUserName());
		System.out.println("Elimino el usuario: " + ortify.borrarUsuario("mfernandez").getUserName());

		System.out.println();

		System.out.println("Muestro la lista de usuarios al momento");
		System.out.println(ortify.getUsuarios());

		System.out.println();

		// Test ejercicio C
		System.out.println("Ejercicio C: Fans destacados");
		System.out.println("Es mfernandez fan destacado de Queen?: " + queen.esFanDestacado(mfernandez));
		System.out.println("Es jperez fan destacado de Queen?: " + queen.esFanDestacado(jperez));

	}

}
