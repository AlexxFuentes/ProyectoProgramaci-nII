package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: TransferenciasEntreCuentas
 * Descripcion: Los requisitos que se necesitan
 *            para realizar una transferencia entre cuentas.
 * */

public class TransferenciasEntreCuentas {
	private double _monto;
    private Usuario _usuario;
    private String _cuentaAtransferir;
    private Depositar _depositar;
    private Retirar _retirar;
    
	public TransferenciasEntreCuentas() {
		super();
	}

	public TransferenciasEntreCuentas(double monto, Usuario usuario, String cuentaAtransferir,
			Depositar depositar, Retirar retirar) {
		super();
		this._monto = monto;
		this._usuario = usuario;
		this._cuentaAtransferir = cuentaAtransferir;
		this._depositar = depositar;
		this._retirar = retirar;
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

	public String get_cuentaAtransferir() {
		return _cuentaAtransferir;
	}

	public void set_cuentaAtransferir(String _cuentaAtransferir) {
		this._cuentaAtransferir = _cuentaAtransferir;
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

	@Override
	public String toString() {
		return "TransferenciasEntreCuentas [_monto=" + _monto +"_usuario=" + _usuario
				+ ", _cuentaAtransferir=" + _cuentaAtransferir + ", _depositar=" + _depositar + ", _retirar=" + _retirar
				+ "]";
	}

	
}
