package GestionClases;

import java.util.LinkedList;
import clases.TipoCuenta;

/**
 * M�TODO DE GESTI�N DE TIPO DE CUENTA: ADMINISTRA LAS CUENTAS DEL USUARIO.
 * @author Alex Fuentes
 *
 *FECHA: 17/07/2020
 */

public class GestionTipoCuenta {
	
	//ATRIBUTOS (COLECCI�N)
	LinkedList<TipoCuenta> listaTipoCuenta = new LinkedList<>();
	
	//CONSTRUCTOR POR DEFECTO
	public GestionTipoCuenta() {
		super();
	}
	
	//CONSTRUCTOR CON TODOS LOS CAMPOS
	public GestionTipoCuenta(LinkedList<TipoCuenta> listaTipoCuenta) {
		super();
		this.listaTipoCuenta = listaTipoCuenta;
	}

	/**
	 * M�TODO QUE OBTIENE TIPO DE CUENTA DE LA COLECCI�N
	 * @return TipoCuenta
	 */
	public LinkedList<TipoCuenta> getTipoCuenta(){
		return listaTipoCuenta;
	}
	
	/**
	 * M�TODO QUE BUSCA TIPO DE CUENTA
	 * @param tipocuenta
	 * @return null, SI NO SE AGREGA TIPO DE CUENTA, CASO CONTRARIO return OBJETO TIPO DE CUENTA
	 */
	public TipoCuenta BucarTipoCuenta(TipoCuenta tipocuenta) {
		 tipocuenta = null;
		for(int i = 0; i < listaTipoCuenta.size(); i++) {
			if( listaTipoCuenta.get(i).equals(tipocuenta)) {
				tipocuenta = listaTipoCuenta.get(i);
			}
		}
		return tipocuenta;
	}
	
	/**
	 * M�TODO QUE AGREGA TIPO DE CUENTA
	 * @param tipocuenta
	 * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean AgregarTipoCuenta(TipoCuenta tipocuenta) {
		if(BucarTipoCuenta(tipocuenta) == null) {//Si la cuenta no esta agregada
			listaTipoCuenta.add(tipocuenta);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * M�TODO QUE MODIFICA EL TIPO DE CUENTA
	 * @param tipoCuentaModificar
	 * @param posicion
	 * @return true - SI SE MODIFICA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarTipoCuenta(TipoCuenta tipoCuentaModificar, int posicion) {
		if(posicion<0 || posicion>listaTipoCuenta.size()) {
			return false;
		}else {
	
			if(BucarTipoCuenta(tipoCuentaModificar) != null) {
				listaTipoCuenta.set(posicion, tipoCuentaModificar);
				return true;
			}else {
				return false;
			}
		
		}
	}

	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N TIPO DE CUENTA
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public TipoCuenta getPosicion(int posicion) {
		return listaTipoCuenta.get(posicion);
	}
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i = 0 ; i < listaTipoCuenta.size(); i++) {
			System.out.println(listaTipoCuenta.get(i));
		}
	} 
}
