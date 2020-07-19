package GestionClases;

import java.util.LinkedList;

import clases.NumeroCuenta;

/**
 * CLASE GESTIÓN NÚMERO DE CUENTA: GENERA NÚMERO DE CUENTA DEL USUARIO
 * @author alexm
 * 
 *FECHA 16/07/20
 */

public class GestionNumeroCuenta {

	//ATRIBUTOS (COLECCIÓN)
	LinkedList<NumeroCuenta> listaNumeroCuenta = new LinkedList<>();
	
	//CONSTRUCTOR POR DEFECTO
	public GestionNumeroCuenta() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public GestionNumeroCuenta(LinkedList<NumeroCuenta> listaNumeroCuenta) {
		super();
		this.listaNumeroCuenta = listaNumeroCuenta;
	}

	/**
	 * MÉTODO QUE OBTIENE UN NÚMERO DE CUENTA DE LA COLECCIÓN.
	 * @return NÚMERO DE CUENTA
	 */
	public LinkedList<NumeroCuenta> getNumeroCuenta(){
		return listaNumeroCuenta;
	}
	
	/**
	 * MÉTODO QUE OBTIENE LA POCIÓN/INDICE DE LA COLECCIÓN
	 * @param posicion
	 * @return INDICE/POSICIÓN DE LA COLECCION NUMERO DE CUENTA
	 */
	public NumeroCuenta getPosicion(int posicion) {
		return listaNumeroCuenta.get(posicion);
	}
	
	/**
	 * MÉTODO QUE GENERA UN NÚMERO DE CUENTA PARA EL USUARIO
	 * @return numCuenta
	 */
	public String GeneraNumeroCuenta() {
		String [] Cuenta1 = {"10","20","30","40","50","60","70","80","90","00"};
		
		String numCuenta = "2020" + (int)(Math.random() * Cuenta1.length) + (int)(Math.random() * Cuenta1.length) + (int)(Math.random() * Cuenta1.length)+(int)(Math.random() * Cuenta1.length);
		
		return numCuenta;
	}
	
}
