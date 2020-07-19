package GestionClases;

import java.util.LinkedList;

import clases.NumeroCuenta;

/**
 * CLASE GESTI�N N�MERO DE CUENTA: GENERA N�MERO DE CUENTA DEL USUARIO
 * @author alexm
 * 
 *FECHA 16/07/20
 */

public class GestionNumeroCuenta {

	//ATRIBUTOS (COLECCI�N)
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
	 * M�TODO QUE OBTIENE UN N�MERO DE CUENTA DE LA COLECCI�N.
	 * @return N�MERO DE CUENTA
	 */
	public LinkedList<NumeroCuenta> getNumeroCuenta(){
		return listaNumeroCuenta;
	}
	
	/**
	 * M�TODO QUE OBTIENE LA POCI�N/INDICE DE LA COLECCI�N
	 * @param posicion
	 * @return INDICE/POSICI�N DE LA COLECCION NUMERO DE CUENTA
	 */
	public NumeroCuenta getPosicion(int posicion) {
		return listaNumeroCuenta.get(posicion);
	}
	
	/**
	 * M�TODO QUE GENERA UN N�MERO DE CUENTA PARA EL USUARIO
	 * @return numCuenta
	 */
	public String GeneraNumeroCuenta() {
		String [] Cuenta1 = {"10","20","30","40","50","60","70","80","90","00"};
		
		String numCuenta = "2020" + (int)(Math.random() * Cuenta1.length) + (int)(Math.random() * Cuenta1.length) + (int)(Math.random() * Cuenta1.length)+(int)(Math.random() * Cuenta1.length);
		
		return numCuenta;
	}
	
}
