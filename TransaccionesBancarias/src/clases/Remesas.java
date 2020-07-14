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
	    private Retirar _retirar;
	    
		public Remesas() {
			super();
		}

		public Remesas(double montoRemesa, Usuario usuario, String tipodeMoneda, Retirar retirar) {
			super();
			this._montoRemesa = montoRemesa;
			this._usuario = usuario;
			this._tipodeMoneda = tipodeMoneda;
			this._retirar = retirar;
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

		public Retirar get_retirar() {
			return _retirar;
		}

		public void set_retirar(Retirar _retirar) {
			this._retirar = _retirar;
		}

		@Override
		public String toString() {
			return "Remesas [_montoRemesa=" + _montoRemesa + ", _usuario=" + _usuario + ", _tipodeMoneda="
					+ _tipodeMoneda + ", _retirar=" + _retirar + "]";
		}

		
}
