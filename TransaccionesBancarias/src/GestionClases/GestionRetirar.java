package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION RETIRAR
* DESCRIPCION: OPERAACIONES REALIZADAS CON DICHA CLASE.
* FECHA: 17/07/2020
*/

import java.util.LinkedList;

import clases.Retirar;

public class GestionRetirar {
	
	private LinkedList<Retirar> listaRetirar=new LinkedList<>();

	public GestionRetirar() {
		super();
	}

	public LinkedList<Retirar> getListaRetirar() {
		return listaRetirar;
	}

	public void setLstRetirar(LinkedList<Retirar> lstRetirar) {
		this.listaRetirar = lstRetirar;
	}
	
	/**
	 * METODO UTILIZADO PARA BUSCAR RETIRO
	 * @param retModificado
	 * @return usuarioEncontrado
	 */
	public Retirar BuscarRetiro(Retirar retiro) {
		retiro = null;
		
		for(int i=0;i<listaRetirar.size();i++) {
			if(listaRetirar.get(i).equals(retiro)) {
				retiro = listaRetirar.get(i);
				break;
			}
		}
		return retiro;
	}
	
	/**
	 * Método utilizado para agregar deposito
	 * @param depoito de la cuenta
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	public boolean AgregarRetiro(Retirar retiro) {
		if(BuscarRetiro(retiro) == null) {
			return false;
		}else {
			listaRetirar.add(retiro);
			return true;
		}	
	}
	
	/**
	 * Método utilizado para modificar el deposito
	 * @param retiroModificado
	 * @return true - si todo se realizó correctamente , caso contrario retorna false
	 */
	
	public boolean ModificarRetiro(Retirar retiroModificado, int posicion ) {
		if(posicion<0 || posicion>listaRetirar.size()) {
			return false;
		}else {
			
			if(BuscarRetiro(retiroModificado) != null) {
				listaRetirar.set(posicion, retiroModificado);
				return true;
			}else {
				return false;
			}
			
		}
		
	}
		
	/**
	 * METODO UTILIZADO PARA ELIMINAR RETIRO
	 * @param MONTO 
	 * @return true - SI TODO SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarMonto(Retirar retiroModificado) {
		if(BuscarRetiro(retiroModificado) == null) {
			return false;
		}else {
			listaRetirar.remove(retiroModificado);
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODOS
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaRetirar.size();i++) {
			System.out.println(listaRetirar.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN RETIRAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Retirar getPosicion(int posicion) {
		return listaRetirar.get(posicion);
	}
	
}
