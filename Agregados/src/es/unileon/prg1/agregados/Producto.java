package es.unileon.prg1.agregados;
/**
 * Clase que representa un producto caracterizado por su nombre,
 * precio y numero de unidades almacenadas.
 *
 * @author PRG
 * @version 1.0
 */
class Producto{

	/**
	 * Nombre del producto
	 */
	private String nombre;
	/**
	 * Precio unitario en euros
	 */
	private double precio;
	/**
	 * Numero de unidades disponibles
	 */
	private int cantidad;

	/**
	 * Constructor de un producto a partir de sus datos
	 * caracteristicos
	 *
	 * @param nombre nombre del producto
	 * @param precio precio unitario en euros
	 * @param cantidad numero de unidades disponibles
	 */
	Producto(String nombre, double precio, int cantidad){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * Constructor de copia que crea un producto como replica
	 * del recibido como parametro
	 *
	 * @param otro producto a partir del cual se efectua la copia
	 */
	Producto(Producto otro){
		nombre = otro.obtenerNombre();
		precio = otro.obtenerPrecio();
		cantidad = otro.obtenerCantidad();
	}

	/**
	 * Devuelve el nombre del producto
	 *
	 * @return nombre del producto
	 */
	String obtenerNombre(){
		return nombre;
	}

	/**
	 * Devuelve el precio del producto en euros
	 *
	 * @return precio unitario en euros
	 */
	double obtenerPrecio(){
		return precio;
	}

	/**
	 * Devuelve la cantidad de unidades disponibles
	 *
	 * @return unidades disponibles
	 */
	int obtenerCantidad(){
		return cantidad;
	}

	/**
	 * Compara si el producto es igual al recibido como 
	 * parametro.
	 *
	 * @param otro producto con el que se compara el actual
	 * @return verdadero si los dos productos son iguales y
	 * falso en otro caso
	 */
	boolean esIgualA(Producto otro){
		return nombre.equalsIgnoreCase(otro.obtenerNombre());
	}

	/**
	 * Compara si el producto tiene el mismo nombre que
	 * el recibido como parametro
	 *
	 * @param nombre nombre con el que se compara el nombre del actual
	 * @return verdadero si los dos nombres son iguales y
	 * falso en otro caso
	 */
	boolean esIgualA(String nombre){
		return nombre.equalsIgnoreCase(nombre);
	}

	/**
	 * Comprueba si el nombre del producto actual es menor 
	 * alfabeticamente que el recibido como parametro
	 *
	 * @param otro nombre con el que se compara el del producto actual
	 * @return verdadero si el nombre del producto actual es menor
	 * alfabeticamente que el recibido como parametro y falso en 
	 * caso contrario
	 */
	boolean esMenor (String otro){
		return nombre.toLowerCase().compareTo(otro.toLowerCase()) < 0;
	}

	/**
	 * Comprueba si el nombre del producto actual es mayor
	 * alfabeticamente que el recibido como parametro
	 *
	 * @param otro nombre con el que se compara el del producto actual
	 * @return verdadero si el nombre del producto actual es mayor
	 * alfabeticamente que el recibido como parametro y falso en 
	 * caso contrario
	 */
	boolean esMayor (String otro){
		return nombre.toLowerCase().compareTo(otro.toLowerCase()) > 0;
	}

	/**
	 * Comprueba si nombre del producto actual es menor 
	 * alfabeticamente que el del producto recibido como parametro
	 *
	 * @param otro producto con el que se compara el producto actual
	 * @return verdadero si el nombre del producto actual es menor
	 * alfabeticamente que el de el producto recibido como parametro
	 * y falso en caso contrario
	 */
	boolean esMenor (Producto otro){
		return nombre.toLowerCase().compareTo
				(otro.obtenerNombre().toLowerCase() ) < 0;
	}

	/**
	 * Comprueba si nombre del producto actual es mayor 
	 * alfabeticamente que el del producto recibido como parametro
	 *
	 * @param otro producto con el que se compara el producto actual
	 * @return verdadero si el nombre del producto actual es mayor
	 * alfabeticamente que el de el producto recibido como parametro
	 * y falso en caso contrario
	 */
	boolean esMayor (Producto otro){
		return nombre.toLowerCase().compareTo
				(otro.obtenerNombre().toLowerCase() ) > 0;
	}

	/**
	 * Devuelve una cadena de caracteres con toda la informacion relativa al producto
	 */
	public String toString(){
		return "\t" + nombre + ":" + precio + ":" + cantidad;
	}

}
