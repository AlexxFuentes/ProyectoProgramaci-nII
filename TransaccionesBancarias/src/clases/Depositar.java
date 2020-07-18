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
        private Usuario _usuario;
        private CrearCuenta _crearCuenta;
        
        
		public Depositar() {
			super();
		}


		public Depositar(double _monto, Usuario _usuario, CrearCuenta _crearCuenta) {
			super();
			this._monto = _monto;
			this._usuario = _usuario;
			this._crearCuenta = _crearCuenta;
		}


		public double get_monto() {
			return _monto;
		}


		public void set_monto(double _monto) {
			this._monto = _monto;
		}


		public Usuario get_usuario() {
			return _usuario;
		}


		public void set_usuario(Usuario _usuario) {
			this._usuario = _usuario;
		}


		public CrearCuenta get_crearCuenta() {
			return _crearCuenta;
		}


		public void set_crearCuenta(CrearCuenta _crearCuenta) {
			this._crearCuenta = _crearCuenta;
		}


		@Override
		public String toString() {
			return "Depositar [_monto=" + _monto + ", _usuario=" + _usuario + ", _crearCuenta=" + _crearCuenta + "]";
		}
        
		
        
		
}
