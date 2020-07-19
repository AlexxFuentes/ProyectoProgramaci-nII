package GestionClases;

import java.util.LinkedList;

import clases.CrearCuenta;
import clases.Depositar;
import clases.PagoServiciosPublicos;
import clases.ServiciosPublicos;
import clases.TipoCuenta;
import clases.Transferencias;
import clases.Usuario;

public class GestionServiciosPublicos {
     private LinkedList<ServiciosPublicos> listaServicios = new LinkedList<>();

	public GestionServiciosPublicos() {
		super();
	}

	public LinkedList<ServiciosPublicos> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(LinkedList<ServiciosPublicos> listaServicios) {
		this.listaServicios = listaServicios;
	}
     
     /**
      * METODO PARA BUSCAR SERVICIO PUBLICO
      * @param 
      * return 
      */
	
	public ServiciosPublicos BuscarServicio(ServiciosPublicos servicios) {
		servicios = null;
		
		for(int i = 0; i < listaServicios.size(); i++) {
			if( listaServicios.get(i).equals(servicios)) {
				servicios = listaServicios.get(i);
			}
		}
		return servicios;
	}
	
	/**
	 * MÉTODO QUE AGREGAR SERVICIO PUBLICO
	 * @param servicioPagar
	 * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean AgregarServiciosPublicos(ServiciosPublicos servicioPagar) {
		
		if(BuscarServicio(servicioPagar) == null) {//Si la cuenta no esta agregada
			
			listaServicios.add(servicioPagar);
			
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * MÉTODO QUE MODIFICA EL SERVICIO PUBLICO
	 * @param servicioModificar
	 * @param posicion
	 * @return true - SI SE MODIFICA CORRECTAMENTE, CASO CONTRARIO return false
	 */
	public boolean ModificarTipoCuenta(ServiciosPublicos servicioModificar, int posicion) {
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
	 * @return true - SI TODO SE REALIZO CORRECTAMENTE , CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarServicio(ServiciosPublicos servicio) {
		Usuario UsuarioEncontrado = null;
		
		if(UsuarioEncontrado == null) {
			return false;
		}else {
			listaServicios.remove(BuscarServicio(servicio));
			return true;
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN TIPO DE CUENTA
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public ServiciosPublicos getPosicion(int posicion) {
		return listaServicios.get(posicion);
	}
	
	/**
	 * MÉTODO PARA IMPRIMIR TODA LA COLECCIÓN
	 */
	public void imprimirTodos() {
		for(int i = 0 ; i < listaServicios.size(); i++) {
			System.out.println(listaServicios.get(i));
		}
	} 
}
