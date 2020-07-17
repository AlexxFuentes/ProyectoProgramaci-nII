package GestionClases;

import java.util.LinkedList;

import clases.Referencia;

/**
 * CLASE GESTI�N DE REFERENCIA: ADMISTRA LOS DATOS PERSONALES DEL USUARIO
 * @author Alex Fuentes
 * 
 * FECHA: 17/07/2020
 */

public class GestionReferencia {
	
	//ATRIBUTOS (COLECCI�N)
	LinkedList<Referencia> listaReferencia = new LinkedList<>();
	
	/**
	 * M�TODO QUE OBTIENE ELEMENTO DE LA COLEECI�N REFERENCIA
	 * @return listaReferencia
	 */
	public LinkedList<Referencia> getReferencia(){
		return listaReferencia;
	}
	
	/**
	 * M�TODO BUSCAR REFERENCIA POR POCISI�N EN LA COLECCI�N
	 * @param RTN
	 * @return -1 -  SI NO ENCUENTRA LA REFERENCIA, CASO CONTRARIO return i - POSICI�N EN LA COLECCI�N
	 */
	public int BuscarReferencia(String RTN) {
		int posicion = -1;
		for(int i= 0; i < listaReferencia.size(); i++) {
			if(listaReferencia.get(i).get_rtn().equals(RTN)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	/**
	 * M�TODO PARA AGREGAR REFERENCIA DEL USUARIO
	 * @param referencia
	 * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false.
	 */
	public boolean AgregarReferencia(Referencia referencia) {
		if(BuscarReferencia(referencia.get_rtn()) == -1) {
			listaReferencia.add(referencia);
			return true;
		}else {
			return false;
		}
	}
	/**
	 * M�TODO PARA ELIMINAR REFERENCIA POR POSICI�N
	 * @param posicion
	 * @return false - SI NO ENCUENTRA LA REFERENCIA, CASO CONTRARIO return true - SI SE ELIMINO CORRECTAMENTE
	 */
	public boolean EliminarReferencia(int posicion) {
		if(posicion < 0 || posicion > listaReferencia.size()) {
			return false;
		}else {
			listaReferencia.remove(posicion);
			return true;
		}
	}

	/**
	 * M�TODO PARA MODIFICAR REFERENCIA
	 * @param referenciaModificado
	 * @param posicion
	 * @return true - SI SE MODIFICO CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarReferencia(Referencia referenciaModificado, int posicion) {
		
		if(posicion < 0 || posicion > listaReferencia.size()) {
			return false;
		}else {
			int posicionrefencia = BuscarReferencia(referenciaModificado.get_rtn());
	
			if(posicionrefencia != -1) {
				listaReferencia.set(posicion, referenciaModificado);
				return true;
			}else {
				return false;
			}
		
		}
	} 
	
	/**
	 * M�TODO PARA OBTENER INDICE/POSICI�N DE LA COLECI�N
	 * @param posicion
	 * @return POSICI�N/INDICE DE LA COLECCI�N
	 */
	public Referencia getRTN(int posicion) {
		return listaReferencia.get(posicion);
	}
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaReferencia.size();i++) {
			System.out.println(listaReferencia.get(i));
		}
	}
}
