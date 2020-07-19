package GestionClases;

import java.util.LinkedList;

import clases.Depositar;
import clases.Seguros;
import clases.ServiciosPublicos;

public class GestionSeguros {
	//COLECCIÓN
      private LinkedList<Seguros> listaSeguros = new LinkedList<>();

      //CONSTRUCTOR POR DEFECTO
	public GestionSeguros() {
		super();
	}
    
	//GENERADOR DEL GET
	public LinkedList<Seguros> getListaSeguros() {
		return listaSeguros;
	}

	//GENERADOR DEL SET
	public void setListaSeguros(LinkedList<Seguros> listaSeguros) {
		this.listaSeguros = listaSeguros;
	}
      
    /**
     * METODO PARA BUSCAR SEGURO
     * @param seguro
     * return seguroEncontrado
     */ 
	
	public Seguros BuscarSeguro(String seguro) {
		Seguros seguroEncontrado = null;
		for(int i=0; i<listaSeguros.size();i++) {
			if(listaSeguros.get(i).get_seguroAuto().equals(seguro) || listaSeguros.get(i).get_seguroMedico().equals(seguro) || listaSeguros.get(i).get_seguroDeVida().equals(seguro)) {
				
				seguroEncontrado = listaSeguros.get(i);
			}
		}
		return seguroEncontrado;
	}
	
	/**
     * METODO PARA AGREGAR SEGURO
     * @param seguro
     * return seguroEncontrado
     */ 
	
	public boolean AgregarSeguro(Seguros agregarSeguro) {
		if(BuscarSeguro(agregarSeguro.get_seguroAuto()) == null ||
		   BuscarSeguro(agregarSeguro.get_seguroMedico()) == null ||
		   BuscarSeguro(agregarSeguro.get_seguroDeVida()) == null) {
			
			return false;
		}else {
			listaSeguros.add(agregarSeguro);
		}
		return true;
	}
	
	/**
     * METODO PARA MODIFICAR SEGURO
     * @param seguroModificado
     * return TRUE. SI TODO SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNARA FALSE.
     */ 
	
	public boolean ModificarSeguro(Seguros seguroModificado, int posicion ) {
		if(posicion<0 || posicion>listaSeguros.size()) {
			return false;
		}else {
			
			if(BuscarSeguro(seguroModificado.get_seguroAuto()) != null || 
				BuscarSeguro(seguroModificado.get_seguroMedico()) != null ||
				BuscarSeguro(seguroModificado.get_seguroDeVida()) != null) {
				
				listaSeguros.set(posicion, seguroModificado);
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
	
	public boolean EliminarSeguro(Seguros seguroEliminado) {
		if(BuscarSeguro(seguroEliminado.get_seguroAuto()) == null ||
			BuscarSeguro(seguroEliminado.get_seguroMedico()) == null ||
			BuscarSeguro(seguroEliminado.get_seguroDeVida()) == null) {
			
			return false;
		}else {
			listaSeguros.remove(BuscarSeguro(seguroEliminado.get_seguroAuto()));
			return true;
		}
	}
	
	
	/**
	 * METODO PARA IMPRIMIR TODO
	 */
	public void imprimirTodos() {
		for(int i=0;i<listaSeguros.size();i++) {
			System.out.println(listaSeguros.get(i));
		}
	}
	
	/**
	 * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN DEPOSITAR
	 * @param posicion
	 * @return POSICIÓN O INDICE DE LA COLECIÓN
	 */
	public Seguros getPosicion(int posicion) {
		return listaSeguros.get(posicion);
	}
	
	
}
