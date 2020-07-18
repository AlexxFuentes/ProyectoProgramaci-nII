package GestionClases;

import java.util.LinkedList;

import clases.Retirar;
import clases.ServiciosPublicos;

public class GestionServiciosPublicos {
	private LinkedList<ServiciosPublicos> listaServiciosPublico = new LinkedList<>();

	public GestionServiciosPublicos() {
		super();
	}

	public LinkedList<ServiciosPublicos> getListaServiciosPublico() {
		return listaServiciosPublico;
	}

	public void setListaServiciosPublico(LinkedList<ServiciosPublicos> listaServiciosPublico) {
		this.listaServiciosPublico = listaServiciosPublico;
	}
	
	/**
	 * METODO UTILIZADO PARA BUSCAR SERVICIO PUBLICO
	 * @param retModificado
	 * @return usuarioEncontrado
	 */
	public ServiciosPublicos BuscarServiciosPublicos(ServiciosPublicos servicio) {
		ServiciosPublicos MontoBuscado = null;
		
		for(int i=0;i<listaServiciosPublico.size();i++) {
			if(listaServiciosPublico.get(i).get_aguaPotable() == monto) {
				MontoBuscado = listaServiciosPublico.get(i);
				break;
			}
		}
		return MontoBuscado;
	}
	
}
