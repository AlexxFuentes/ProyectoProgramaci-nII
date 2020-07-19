package GestionClases;

import java.util.LinkedList;

import clases.Transferencias;
import clases.TransferenciasEntreCuentas;

public class GestionTransferenciasEntreCuentas {
      //COLECCION
	private LinkedList<TransferenciasEntreCuentas> listaTransCuentas=new LinkedList<>();

	 //CONSTRUCTOR POR DEFECTO
	public GestionTransferenciasEntreCuentas() {
		super();
	}

	//GENERAR LOS SET Y GET
	public LinkedList<TransferenciasEntreCuentas> getListaTransCuentas() {
		return listaTransCuentas;
	}

	public void setListaTransCuentas(LinkedList<TransferenciasEntreCuentas> listaTransCuentas) {
		this.listaTransCuentas = listaTransCuentas;
	}
       
      /**
       * METODO PARA BUSCAR LA TRASNFERENCIA ENTRE CUENTA
       * @param
       * return
       */
	public TransferenciasEntreCuentas BuscarTEC(TransferenciasEntreCuentas cuenta) {
		TransferenciasEntreCuentas CuentaEncontrada=null;
		
		for(int j=0; j<listaTransCuentas.size();j++) {
			if(listaTransCuentas.get(j).get_cuentaDestino().equals(cuenta)) {
				
				cuenta = listaTransCuentas.get(j);
			}
		}
		return CuentaEncontrada;
	}
	
	/**
     * METODO PARA AGREGAR LA TRASNFERENCIA ENTRE CUENTA
     * @param
     * return
     */
	
	public boolean agregarTEC(TransferenciasEntreCuentas tec) {
		if(tec.get_cuentaDestino() == null){
			listaTransCuentas.add(tec);
		}
		return false;
		
	}
	
	/**
     * METODO PARA AGREGAR LA TRASNFERENCIA ENTRE CUENTA
     * @param
     * return
     */
	
	public boolean ModificarTEC(TransferenciasEntreCuentas tecModificado, int posicion ) {
		if(posicion<0 || posicion>listaTransCuentas.size()) {
			return false;
		}else {
			
			if(tecModificado.get_cuentaDestino() != null) {
				listaTransCuentas.set(posicion, tecModificado);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
	
	/**
	 * METODO UTILIZADO PARA ELIMINAR EL DEPOSITO
	 * @param MONTO 
	 * @return true - SI TODO SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarMonto(TransferenciasEntreCuentas tecEliminado) {
		if(tecEliminado.get_cuentaDestino() == null) {
			return false;
		}else {
			listaTransCuentas.remove(tecEliminado.get_cuentaDestino());
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
	public TransferenciasEntreCuentas getPosicion(int posicion) {
		return listaTransCuentas.get(posicion);
	}
}
