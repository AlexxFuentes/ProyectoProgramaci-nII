package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION TRANSFERENCIAS ENTRE CUENTAS
* DESCRIPCION: PERMITE QUE EL USUARIO HAGA LAS
*              TRANSFERENCIAS ENTRE CUENTA.
* FECHA: 18/07/2020
*/

import java.util.LinkedList;


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
	public TransferenciasEntreCuentas BuscarTrasnEntreCuentas(TransferenciasEntreCuentas trasn_entre_cuentas) {
		trasn_entre_cuentas = null;
		for(int j=0; j<listaTransCuentas.size();j++) {
			if( listaTransCuentas.get(j).equals(trasn_entre_cuentas) ) {
				trasn_entre_cuentas = listaTransCuentas.get(j);
			}
		}
		return trasn_entre_cuentas;
	}
	
	/**
     * METODO PARA AGREGAR LA TRASNFERENCIA ENTRE CUENTA
     * @param
     * return
     */
	public boolean agregarTrasEntreCuentas(TransferenciasEntreCuentas trasn_entre_cuentas) {
		if(BuscarTrasnEntreCuentas(trasn_entre_cuentas) == null){
			listaTransCuentas.add(trasn_entre_cuentas);
			return true;
		} else {
			return false;
		}
	}
	
	/**
     * METODO PARA AGREGAR LA TRASNFERENCIA ENTRE CUENTA
     * @param
     * return
     */
	
	public boolean ModificarTransEntreCuentas(TransferenciasEntreCuentas tecModificado, int posicion ) {
		if(posicion<0 || posicion>listaTransCuentas.size()) {
			return false;
		}else {
			
			if(BuscarTrasnEntreCuentas(tecModificado) != null) {
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
	 * @return true - SI TODOs SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarTransEntreCuenta(TransferenciasEntreCuentas tecEliminado) {
		if(BuscarTrasnEntreCuentas(tecEliminado) == null) {
			return false;
		}else {
			listaTransCuentas.remove(BuscarTrasnEntreCuentas(tecEliminado));
			return true;
		}
	}
	
	/**
	 * METODO PARA IMPRIMIR TODOS
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
