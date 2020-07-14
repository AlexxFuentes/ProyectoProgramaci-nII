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
      private TipoCuenta _tipoCuenta;
      private NumeroCuenta _numeroCuenta;
      private double _saldoFinal;
      
	public ConsultarSaldo() {
		super();
	}

	public ConsultarSaldo(Usuario usuario, TipoCuenta tipoCuenta, NumeroCuenta numeroCuenta, double saldoFinal) {
		super();
		this._usuario = usuario;
		this._tipoCuenta = tipoCuenta;
		this._numeroCuenta = numeroCuenta;
		this._saldoFinal = saldoFinal;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
	}

	public NumeroCuenta get_numeroCuenta() {
		return _numeroCuenta;
	}

	public void set_numeroCuenta(NumeroCuenta _numeroCuenta) {
		this._numeroCuenta = _numeroCuenta;
	}

	public double get_saldoFinal() {
		return _saldoFinal;
	}

	public void set_saldoFinal(double _saldoFinal) {
		this._saldoFinal = _saldoFinal;
	}

	@Override
	public String toString() {
		return "ConsultarSaldo [_usuario=" + _usuario + ", _tipoCuenta=" + _tipoCuenta + ", _numeroCuenta="
				+ _numeroCuenta + ", _saldoFinal=" + _saldoFinal + "]";
	}
      
      
}
