package GestionClases;

import java.util.LinkedList;

import clases.Referencia;

/**
 * CLASE GESTIÓN DE REFERENCIA: ADMISTRA LOS DATOS PERSONALES DEL USUARIO
 * @author Alex Fuentes
 * 
 * FECHA: 17/07/2020
 */

public class GestionReferencia {
	
	//ATRIBUTOS (COLECCIÓN)
	LinkedList<Referencia> listaReferencia = new LinkedList<>();
	
	/**
	 * MÉTODO QUE OBTIENE ELEMENTO DE LA COLEECIÓN REFERENCIA
	 * @return listaReferencia
	 */
	public LinkedList<Referencia> getReferencia(){
		return listaReferencia;
	}
	
	/**
	 * MÉTODO BUSCAR REFERENCIA POR POCISIÓN EN LA COLECCIÓN
	 * @param RTN
	 * @return -1 -  SI NO ENCUENTRA LA REFERENCIA, CASO CONTRARIO return i - POSICIÓN EN LA COLECCIÓN
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
	 * MÉTODO PARA AGREGAR REFERENCIA DEL USUARIO
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
	 * MÉTODO PARA ELIMINAR REFERENCIA POR POSICIÓN
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
	 * MÉTODO PARA MODIFICAR REFERENCIA
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
	 * MÉTODO PARA OBTENER INDICE/POSICIÓN DE LA COLECIÓN
	 * @param posicion
	 * @return POSICIÓN/INDICE DE LA COLECCIÓN
	 */
	public Referencia getRTN(int posicion) {
		return listaReferencia.get(posicion);
	}
	
	/**
	 * MÉTODO PARA IMPRIMIR TODA LA COLECCIÓN
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaReferencia.size();i++) {
			System.out.println(listaReferencia.get(i));
		}
	}
}
