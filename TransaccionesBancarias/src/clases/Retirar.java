package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 14/07/20
 * 
 * clase: Retirar
 * Descripcion: Da a conocer la cantidad de
 *           dinero que retirara el usuario.  
 * */

public class Retirar {
      private Usuario _usuario;
      private double _monto;
      private TipoCuenta _tipoCuenta;
      private NumeroCuenta _numeroCuenta;
      
	public Retirar() {
		super();
	}

	public Retirar(Usuario usuario, double monto, TipoCuenta tipoCuenta, NumeroCuenta numeroCuenta) {
		super();
		this._usuario = usuario;
		this._monto = monto;
		this._tipoCuenta = tipoCuenta;
		this._numeroCuenta = numeroCuenta;
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

	@Override
	public String toString() {
		return "Retirar [_usuario=" + _usuario + ", _monto=" + _monto + ", _tipoCuenta=" + _tipoCuenta
				+ ", _numeroCuenta=" + _numeroCuenta + "]";
	}
      
      
}
