package es.unileon.prg1.agregados;

/**
 * Clase que representa un almacen de productos de capacidad
 * limitada.
 *
 * @author PRG
 * @version 1.0
 */
class Almacen{

	/**
	 * Matriz de productos que contiene el almacen
	 */
	private Producto productos[];
	/**
	 * Capacidad del almacen en tipos de productos distintos
	 */
	final int MAXIMO_PROD = 10;
	/**
	 * Numero de tipos de productos almacenados en cada momento
	 * en el almacen (o primera posicion libre de la matriz de
	 * productos)
	 */
	private int siguiente;

	/**
	 * Constructor de la clase que inicializa sus atributos
	 */
	Almacen(){
		//COMPLETAR
		productos = new Producto[this.MAXIMO_PROD];
		siguiente = 0;
	}

	/**
	 * Metodo que sirve para aniadir un producto al almacen,
	 * siempre que no este repetido y haya sitio.
	 *
	 * @param producto el producto que se desea aniadir
	 * @return verdadero si el producto ya sido aniadido con exito
	 * y falso en caso contrario
	 */
	boolean anyadir(Producto producto){
		//COMPLETAR
		 boolean correcto;
		 correcto = false;
		 if (buscar(producto.obtenerNombre()) != null) {
			 System.out.println("Error. El elemento ya existe.");
		 } else if (siguiente == MAXIMO_PROD) {
			 System.out.println("Error. Agregado lleno.");
		 } else {
			 productos[siguiente] = new Producto(producto);
			 siguiente++;
			 correcto = true;
		 }
		 return correcto; 
	}

	/**
	 * Comprueba si un producto se encuentra ya en el almacen.
	 *
	 * @param producto el producto buscado
	 * @return verdadero si el producto ya se encuentra en el almacen
	 * y falso en caso contrario
	 */
	boolean existe(Producto producto){
		//COMPLETAR
		int i = 0;
		while (i < siguiente) {
			if (producto.equals(productos[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Utiliza el algoritmo de la busqueda binaria sobre la
	 * coleccion ordenada de los productos.
	 *
	 * @param nombre nombre del producto que se desea localizar
	 * @return el producto buscado si se encuentra en el almacen
	 * o nulo en caso contrario
	 */
	Producto buscar(String nombre){
		//COMPLETAR
		
		Producto producto;
		int mitad, limiteInferior, limiteSuperior;
		mitad = 0;
		limiteInferior = 0;
		limiteSuperior = productos.length - 1;
		producto = null;
		while ( (limiteInferior <= limiteSuperior) &&
				(producto == null)) {
			mitad = (limiteInferior + limiteSuperior) / 2 ;
			if (productos[mitad].esMenor(nombre)){
				limiteInferior = mitad + 1;
			} else if (productos[mitad].esMenor(nombre)) {
				limiteSuperior = mitad - 1;
			} else {
				producto = productos[mitad];
			}
		}
		return producto; 
	}

	/**
	 * Intercambia la posicion de dos productos dentro 
	 * de la matriz.
	 *
	 * @param i posicion del primer producto
	 * @param j posicion del segundo producto
	 */
	void cambiar(int i, int j){		
		//COMPLETAR
		Producto aux = null;
		productos[i] = aux;
		aux = productos[j];
		productos[j] = productos[i];
	}

	/**
	 * Utiliza el algoritmo de la burbuja bidireccional para 
	 * ordenar los productos del almacen de manera ascente en orden
	 * alfabetico por su nombre.
	 */
	void ordenar(){
		int limiteSuperior, limiteInferior;
		boolean fin, cambiado;

		limiteSuperior = productos.length;
		limiteInferior = -1;
		fin = false;

		while ( (limiteInferior < limiteSuperior) && !fin ) {
			limiteInferior++;
			limiteSuperior--;
			cambiado = false;
			for (int j = limiteInferior; j < limiteSuperior; j++){
				if ( productos[j].esMayor(productos[j + 1]) ) {
					cambiar(j,j+1);
					cambiado = true;
				}
			}
			if (!cambiado){
				fin = true;
			}else{
				cambiado = false;
				for (int j = limiteSuperior; --j >= limiteInferior; ) {
					if ( productos[j].esMayor(productos[j + 1]) ) {
						cambiar(j,j+1);
						cambiado = true;
					}
				}
				if (!cambiado) {
					fin = true;
				}
			}
		}
	}

	/**
	 * Devuelve una cadena de caracteres con los productos del almacen ordenados.
	 */
	public String toString(){
		StringBuffer salida = new StringBuffer();
		ordenar();
		salida.append("---------");
		salida.append("PRODUCTOS");
		salida.append("---------");
		for (int i=0; i < siguiente; i++){
			salida.append(productos[i].toString());
		}
		return salida.toString();
	}

}
