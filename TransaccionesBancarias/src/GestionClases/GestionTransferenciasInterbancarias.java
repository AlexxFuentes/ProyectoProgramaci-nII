package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION TRANSFERENCIAS INTERBANCARIAS
* DESCRIPCION: PERMITE QUE EL USUARIO REALICE UNA
*              TRANSFERENCIA INTERBANCARIA.
* FECHA: 18/07/2020
*/

import java.util.LinkedList;

import clases.Transferencias;
import clases.TransferenciasInterbancarias;

public class GestionTransferenciasInterbancarias {
	//COLECCION
		private LinkedList<TransferenciasInterbancarias> listaTransCuentas=new LinkedList<>();

	      /**
	       * METODO PARA BUSCAR LA TRASNFERENCIA ENTRE CUENTA
	       * @param
	       * return
	       */
		
		public  TransferenciasInterbancarias BuscarTI(Transferencias transEncontrado) {
			TransferenciasInterbancarias CuentaEncontrada=null;
			
			for(int j=0; j<listaTransCuentas.size();j++) {
				if(listaTransCuentas.get(j).get_numeroCuenta().equals(transEncontrado)) {
					
					CuentaEncontrada = listaTransCuentas.get(j);
				}
			}
			return CuentaEncontrada;
		}
		
		/**
	     * METODO PARA AGREGAR LA TRASNFERENCIA ENTRE CUENTA
	     * @param tec
	     * return
	     */
		
		public boolean agregarTEC(TransferenciasInterbancarias tec) {
			if(tec.get_numeroCuenta() == null){
				listaTransCuentas.add(tec);
			}
			return false;
			
		}
		
		/**
	     * METODO PARA MODIFICAR LA TRASNFERENCIA ENTRE CUENTA
	     * @param tecModificado
	     * @param posicion
	     * return
	     */
		
		public boolean ModificarTEC(TransferenciasInterbancarias tecModificado, int posicion ) {
			if(posicion<0 || posicion>listaTransCuentas.size()) {
				return false;
			}else {
				
				if(tecModificado.get_numeroCuenta() != null) {
					listaTransCuentas.set(posicion, tecModificado);
					return true;
				}else {
					return false;
				}
				
			}
			
		}
		
		/**
	     * METODO PARA ELIMINAR LA TRASNFERENCIA ENTRE CUENTA
	     * @param transEliminar
	     * return
	     */
		public boolean EliminarTI(TransferenciasInterbancarias transEliminar) {
			Transferencias transEncontrado = null;
			
			if(BuscarTI(transEncontrado) == null) {
				return false;
			}else {
				listaTransCuentas.remove(transEliminar);
		     	return true;
		    }
		}
		
		/**
		 * METODO PARA IMPRIMIR TODO
		 */
		public void imprimirTodos() {
			for(int i=0;i<listaTransCuentas.size();i++) {
				System.out.println(listaTransCuentas.get(i));
			}
		}
		
		/**
		 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN DEPOSITAR
		 * @param posicion
		 * @return POSICIÓN O INDICE DE LA COLECIÓN
		 */
		public TransferenciasInterbancarias getPosicion(int posicion) {
			return listaTransCuentas.get(posicion);
		}
}
