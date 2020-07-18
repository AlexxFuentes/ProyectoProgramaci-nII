package GestionClases;

import java.util.LinkedList;

import clases.Depositar;
import clases.PagoServiciosPublicos;
import clases.ServiciosPublicos;

public class GestionPagoServiciosPublicos {
	private LinkedList<PagoServiciosPublicos> lstPagoServicios=new LinkedList<>();

	public GestionPagoServiciosPublicos() {
		super();
	}

	public LinkedList<PagoServiciosPublicos> getLstPagoServicios() {
		return lstPagoServicios;
	}

	public void setLstPagoServicios(LinkedList<PagoServiciosPublicos> lstPagoServicios) {
		this.lstPagoServicios = lstPagoServicios;
	}
       
	/**
	 * METODO UTILIZADO PARA BUSCAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	
	public PagoServiciosPublicos BuscarPago(ServiciosPublicos serviciopagar) {
		PagoServiciosPublicos servicioBuscado = null;
		
		for(int i=0;i<lstPagoServicios.size();i++) {
			if(lstPagoServicios.get(i).get_servicioaPagar() == serviciopagar) {
				servicioBuscado = lstPagoServicios.get(i);
				break;
			}
		}
		return servicioBuscado;
	}
	/**
	 * METODO UTILIZADO PARA AGREGAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	public boolean AgregarServicioAPagar(PagoServiciosPublicos servPagar) {
		if(BuscarPago(servPagar.get_servicioaPagar())==null) {
			return false;
		}else {
			lstPagoServicios.add(servPagar);
			return true;
		}
	}
	
	/**
	 * METODO UTILIZADO PARA MODIFICAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	public boolean ModificarPago(PagoServiciosPublicos pagoModificado, int posicion ) {
		if(posicion<0 || posicion>lstPagoServicios.size()) {
			return false;
		}else {
			PagoServiciosPublicos posicionEncontrada=BuscarPago(pagoModificado.get_servicioaPagar());
			
			if(posicionEncontrada==null) {
				lstPagoServicios.set(posicion, pagoModificado);
			}
		}
		return false;
		
	}
	
	/**
	 * METODO UTILIZADO PARA ELIMINAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarPago(PagoServiciosPublicos servicioPagar) {
		if(BuscarPago(servicioPagar.get_servicioaPagar()) != null) {
			return false;
		}else {
		     lstPagoServicios.remove(servicioPagar);
		     return true;
	    }
	
	}
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstPagoServicios.size();i++) {
			System.out.println(lstPagoServicios.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN PagoServiciosPublicos
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public PagoServiciosPublicos getPosicion(int posicion) {
		return lstPagoServicios.get(posicion);
	}
}
