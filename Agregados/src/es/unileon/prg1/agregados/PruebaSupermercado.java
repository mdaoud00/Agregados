package es.unileon.prg1.agregados;

/**
 * Clase de prueba que sirve para comprobar el funcionamiento 
 * del supermercado.
 *
 * @author MTP
 * @version 1.0
 */
class PruebaSupermercado{
	public static void main(String args[]){
		Supermercado supermercado;
		supermercado = new Supermercado("Galenas");
		supermercado.anyadir(new Producto("libreta", 3.5, 10));
		supermercado.anyadir(new Producto("lapiz", 1.0, 100));
		supermercado.anyadir(new Producto("papel", 2, 50));
		supermercado.anyadir(new Producto("goma", 0.5, 60));
		supermercado.anyadir(new Producto("carpeta", 1.5, 200));
		supermercado.anyadir(new Producto("calendario", 1.8, 40));
		supermercado.anyadir(new Producto("rotulador", 0.4, 150));
		supermercado.anyadir(new Producto("tiza", 0.1, 90));
		supermercado.anyadir(new Producto("borrador", 2.0, 30));
		supermercado.anyadir(new Producto("dvd", 0.10, 500));
		supermercado.anyadir(new Producto("toner", 100.0, 10));
		System.out.println(supermercado);
	}
}
