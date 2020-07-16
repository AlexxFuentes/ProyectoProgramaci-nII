package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: CuentaCheques
 * Descripcion: toma los datos de operaciones que se 
 *              pueden realiar en cuenta de cheques
 * 
 * */

public class CuentaCheques {
	private double _interesremunerado;
	private Depositar _depositar;
	private Retirar _retirar;
	private ConsultarSaldo _consultarSaldo;
	private Usuario _usuario;
	
	public CuentaCheques() {
		
	}

	public CuentaCheques(double interesremunerado, Depositar depositar, Retirar retirar,
			ConsultarSaldo consultarSaldo, Usuario usuario) {
		super();
		this._interesremunerado = interesremunerado;
		this._depositar = depositar;
		this._retirar = retirar;
		this._consultarSaldo = consultarSaldo;
		this._usuario = usuario;
	}

	public double get_interesremunerado() {
		return _interesremunerado;
	}

	public void set_interesremunerado(double _interesremunerado) {
		this._interesremunerado = _interesremunerado;
	}

	public Depositar get_depositar() {
		return _depositar;
	}

	public void set_depositar(Depositar _depositar) {
		this._depositar = _depositar;
	}

	public Retirar get_retirar() {
		return _retirar;
	}

	public void set_retirar(Retirar _retirar) {
		this._retirar = _retirar;
	}

	public ConsultarSaldo get_consultarSaldo() {
		return _consultarSaldo;
	}

	public void set_consultarSaldo(ConsultarSaldo _consultarSaldo) {
		this._consultarSaldo = _consultarSaldo;
	}

	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
	}

	@Override
	public String toString() {
		return "CuentaCheques [_interesremunerado=" + _interesremunerado + ", _depositar=" + _depositar + ", _retirar="
				+ _retirar + ", _consultarSaldo=" + _consultarSaldo + ", _usuario=" + _usuario + "]";
	}

	
}
