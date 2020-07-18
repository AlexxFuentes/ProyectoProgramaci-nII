package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 14/07/20
 * 
 * clase: Depositar
 * Descripcion: Da a conocer la cantidad de
 *           dinero que depositara el usuario.  
 * */

public class Depositar {
        private double _monto;
        
		public Depositar() {
			super();
		}

		public Depositar(double _monto) {
			super();
			this._monto = _monto;
		}

		public double get_monto() {
			return _monto;
		}

		public void set_monto(double _monto) {
			this._monto = _monto;
		}

		@Override
		public String toString() {
			return "Depositar [_monto=" + _monto + "]";
		}

		
}
