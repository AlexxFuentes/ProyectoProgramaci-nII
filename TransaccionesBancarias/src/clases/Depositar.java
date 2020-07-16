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
        private Usuario _usuario;
        private double _monto;
        
		public Depositar() {
			super();
		}

		public Depositar(Usuario usuario, double monto) {
			super();
			this._usuario = usuario;
			this._monto = monto;
		}

		public Usuario get_usuario() {
			return _usuario;
		}

		public void set_usuario(Usuario _usuario) {
			this._usuario = _usuario;
		}

		public double get_monto() {
			return _monto;
		}

		public void set_monto(double _monto) {
			this._monto = _monto;
		}

	

		@Override
		public String toString() {
			return "Depositar [_usuario=" + _usuario + ", _monto=" + _monto +"]";
		}
        
        
}
