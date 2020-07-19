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
        private double _montodepositado;
        private double _saldoFinal;
        private PagoServiciosPublicos _pagoServicios;


		public Depositar() {
			super();
		}
        
		public Depositar(Usuario usuario, double montodeposito, double saldoFinal, PagoServiciosPublicos pagoServicios) {
			super();
			this._usuario = usuario;
			this._montodepositado = montodeposito;
			this._saldoFinal = saldoFinal;
			this._pagoServicios = pagoServicios;
		}


		public double get_montodepositado() {
			return _montodepositado;
		}

		public void set_montodepositado(double _montodeposito) {
			this._montodepositado = _montodeposito;
		}

		public double get_saldoFinal() {
			return _saldoFinal;
		}

		public void set_saldoFinal(double _saldoFinal) {
			this._saldoFinal = _saldoFinal;
		}

		
		public Usuario get_usuario() {
			return _usuario;
		}

		public void set_usuario(Usuario _usuario) {
			this._usuario = _usuario;
		}

		public PagoServiciosPublicos get_pagoServicios() {
			return _pagoServicios;
		}

		public void set_pagoServicios(PagoServiciosPublicos _pagoServicios) {
			this._pagoServicios = _pagoServicios;
		}

		@Override
		public String toString() {
			return "Depositar [_usuario=" + _usuario + ", _montodeposito=" + _montodepositado + ", _saldoFinal="
					+ _saldoFinal + ", _pagoServicio=" + _pagoServicios + "]";
		}
		
}
