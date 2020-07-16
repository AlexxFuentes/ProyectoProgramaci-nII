package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 14/07/20
 * 
 * clase: consultarSaldo
 * Descripcion: Permite que el usuario consulte el saldo
 *             existente en su cuenta.  
 * */

public class ConsultarSaldo {
      private Usuario _usuario;
      private double _saldoFinal;
      
	public ConsultarSaldo() {
		super();
	}

	public ConsultarSaldo(Usuario usuario, double saldoFinal) {
		super();
		this._usuario = usuario;
		this._saldoFinal = saldoFinal;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public double get_saldoFinal() {
		return _saldoFinal;
	}

	public void set_saldoFinal(double _saldoFinal) {
		this._saldoFinal = _saldoFinal;
	}

	@Override
	public String toString() {
		return "ConsultarSaldo [_usuario=" + _usuario + ", _saldoFinal=" + _saldoFinal + "]";
			
	}
      
      
}
