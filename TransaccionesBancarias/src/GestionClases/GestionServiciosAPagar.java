package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION SERVICIOS A PAGAR
* DESCRIPCION: OPERACIONES REALIZADAS CON ESTA CLASE.
* FECHA: 18/07/2020
*/

import java.util.LinkedList;
import clases.ServiciosAPagar;

public class GestionServiciosAPagar {
     private LinkedList<ServiciosAPagar> listaServicios = new LinkedList<>();

	public GestionServiciosAPagar() {
		super();
	}

	public LinkedList<ServiciosAPagar> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(LinkedList<ServiciosAPagar> listaServicios) {
		this.listaServicios = listaServicios;
	}
     
     /**
      * METODO PARA BUSCAR SERVICIO PUBLICO
      * @param 
      * return 
      */
	
	public ServiciosAPagar BuscarServicio(ServiciosAPagar servicios) {
		servicios = null;
		
		for(int i = 0; i < listaServicios.size(); i++) {
			if( listaServicios.get(i).equals(servicios)) {
				servicios = listaServicios.get(i);
			}
		}
		return servicios;
	}
	
	/**
	 * M�TODO QUE AGREGAR SERVICIO PUBLICO
	 * @param servicioPagar
	 * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean AgregarServiciosPublicos(ServiciosAPagar servicioPagar) {
		
		if(BuscarServicio(servicioPagar) == null) {//Si la cuenta no esta agregada
			
			listaServicios.add(servicioPagar);
			
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * M�TODO QUE MODIFICA EL SERVICIO PUBLICO
	 * @param servicioModificar
	 * @param posicion
	 * @return true - SI SE MODIFICA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarTipoCuenta(ServiciosAPagar servicioModificar, int posicion) {
		if(posicion<0 || posicion>listaServicios.size()) {
			return false;
		}else {
	
			if(BuscarServicio(servicioModificar) != null) {
				listaServicios.set(posicion, servicioModificar);
				return true;
			}else {
				return false;
			}
		
		}
	}
	
	/**
	 * METODO UTILIZADO PARA ELIMINAR EL SERVICIO A PAGAR
	 * @param MONTO 
	 * @return true - SI TODOS SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarServicio(ServiciosAPagar servicio) {
		
		if(BuscarServicio(servicio) == null) {
			return false;
		}else {
			listaServicios.remove(BuscarServicio(servicio));
			return true;
		}
	}
	
	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N TIPO DE CUENTA
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public ServiciosAPagar getPosicion(int posicion) {
		return listaServicios.get(posicion);
	}
	
	/**
	 * M�TODO PARA IMPRIMIR TODA LA COLECCI�N
	 */
	public void imprimirTodos() {
		for(int i = 0 ; i < listaServicios.size(); i++) {
			System.out.println(listaServicios.get(i));
		}
	} 
}
