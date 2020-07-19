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
	
		//ATRIBUTOS 
		private TipoCuenta _tipoCuenta;
        private double _montodepositado;
        private double _saldoFinal;

        //CONSTRUCTOR POR DEFECTO
		public Depositar() {
			super();
		}
        
		//CONSTRUCTOR CON TODOS LOS CAMPOS
		public Depositar(TipoCuenta tipoCuenta, double montodeposito, double saldoFinal) {
			super();
			this._tipoCuenta = tipoCuenta;
			this._montodepositado = montodeposito;
			this._saldoFinal = saldoFinal;
			
		}

		//SETTERS AND GETTERS
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

		
		public TipoCuenta get_tipoCuenta() {
			return _tipoCuenta;
		}

		public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
			this._tipoCuenta = _tipoCuenta;
		}

		//SOBREESCRITURA DE TOSTRING
		@Override
		public String toString() {
			return "Depositar [_tipoCuenta=" + _tipoCuenta + ", _montodeposito=" + _montodepositado + ", _saldoFinal="
					+ _saldoFinal + "]";
		}
		
}
