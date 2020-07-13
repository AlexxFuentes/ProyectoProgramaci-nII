package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: TransferenciasEntreCuentas
 * Descripcion: Los requisitos que se necesitan
 *            para reaalizar una transferencia entre cuentas.
 * */

public class TransferenciasEntreCuentas {
	private TipoCuenta _tipoCuenta;
    private Usuario _usuario;
    private String _cuentaAtransferir;
    private CuentaBancaria _cuentaBancaria;
    
	public TransferenciasEntreCuentas() {
		super();
	}

	public TransferenciasEntreCuentas(TipoCuenta tipoCuenta, Usuario usuario, String cuentaAtransferir,
			CuentaBancaria cuentaBancaria) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._usuario = usuario;
		this._cuentaAtransferir = cuentaAtransferir;
		this._cuentaBancaria = cuentaBancaria;
	}

	public TipoCuenta get_tipoCuenta() {
		return _tipoCuenta;
	}

	public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
		this._tipoCuenta = _tipoCuenta;
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

	public CuentaBancaria get_cuentaBancaria() {
		return _cuentaBancaria;
	}

	public void set_cuentaBancaria(CuentaBancaria _cuentaBancaria) {
		this._cuentaBancaria = _cuentaBancaria;
	}

	@Override
	public String toString() {
		return "TransferenciasEntreCuentas [_tipoCuenta=" + _tipoCuenta + ", _usuario=" + _usuario
				+ ", _cuentaAtransferir=" + _cuentaAtransferir + ", _cuentaBancaria=" + _cuentaBancaria + "]";
	}
    
	
    
}
