package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: Remesas
 * Descripcion: Muestra la remesa la cual
 *             retirara el usuario.
 * */

public class Remesas {
	  private double _montoRemesa;
	    private Usuario _usuario;
	    private String _tipodeMoneda;
	    private CuentaBancaria _cuentaBancaria;
	    
		public Remesas() {
			super();
		}

		public Remesas(double montoRemesa, Usuario usuario, String tipodeMoneda, CuentaBancaria cuentaBancaria) {
			super();
			this._montoRemesa = montoRemesa;
			this._usuario = usuario;
			this._tipodeMoneda = tipodeMoneda;
			this._cuentaBancaria = cuentaBancaria;
		}

		public double get_montoRemesa() {
			return _montoRemesa;
		}

		public void set_montoRemesa(double _montoRemesa) {
			this._montoRemesa = _montoRemesa;
		}

		public Usuario get_usuario() {
			return _usuario;
		}

		public void set_usuario(Usuario _usuario) {
			this._usuario = _usuario;
		}

		public String get_tipodeMoneda() {
			return _tipodeMoneda;
		}

		public void set_tipodeMoneda(String _tipodeMoneda) {
			this._tipodeMoneda = _tipodeMoneda;
		}

		public CuentaBancaria get_cuentaBancaria() {
			return _cuentaBancaria;
		}

		public void set_cuentaBancaria(CuentaBancaria _cuentaBancaria) {
			this._cuentaBancaria = _cuentaBancaria;
		}

		@Override
		public String toString() {
			return "Remesas [_montoRemesa=" + _montoRemesa + ", _usuario=" + _usuario + ", _tipodeMoneda="
					+ _tipodeMoneda + ", _cuentaBancaria=" + _cuentaBancaria + "]";
		}
	    
		
	    
	    
}
