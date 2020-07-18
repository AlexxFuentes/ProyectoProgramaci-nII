package GestionClases;

import java.util.LinkedList;

import clases.Depositar;
import clases.Transferencias;

public class GestionTransferencias {
      private LinkedList<Transferencias> listaTransferencias = new LinkedList<>();

	public GestionTransferencias() {
		super();
	}

	public LinkedList<Transferencias> getListaTransferencias() {
		return listaTransferencias;
	}

	public void setListaTransferencias(LinkedList<Transferencias> listaTransferencias) {
		this.listaTransferencias = listaTransferencias;
	}
      
      /**
       * METODO PARA BUSCAR UNA TRANSFERENCIA
       * @param 
       * 
       */
	
	public Transferencias BuscarTransferencias(Depositar transferencia) {
		Transferencias transferenciaEncontrada = null;
		 
		for(int i=0; i<listaTransferencias.size();++i) {
			if(listaTransferencias.get(i).get_internacionales()==null) {
				
			}
		}
		return transferenciaEncontrada;
	}
}
