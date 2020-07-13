package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: TransferenciasInterbancarias
 * Descripcion: Selecciona la cantidad de dinero
 *            y las opciones de bancos a transferir.
 * */

public class TransferenciasInterbancarias {
	private TipoCuenta _tipoCuenta;
    private Usuario _usuario;
    private String _cuentaAtransferir;
    private CuentaBancaria _cuentaBancaria;
    private String _bancoDeDestino;
    
	public TransferenciasInterbancarias() {
		super();
	}

	public TransferenciasInterbancarias(TipoCuenta tipoCuenta, Usuario usuario, String cuentaAtransferir,
			CuentaBancaria cuentaBancaria, String bancoDeDestino) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._usuario = usuario;
		this._cuentaAtransferir = cuentaAtransferir;
		this._cuentaBancaria = cuentaBancaria;
		this._bancoDeDestino = bancoDeDestino;
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

	public String get_bancoDeDestino() {
		return _bancoDeDestino;
	}

	public void set_bancoDeDestino(String _bancoDeDestino) {
		this._bancoDeDestino = _bancoDeDestino;
	}

	@Override
	public String toString() {
		return "TransferenciasInterbancarias [_tipoCuenta=" + _tipoCuenta + ", _usuario=" + _usuario
				+ ", _cuentaAtransferir=" + _cuentaAtransferir + ", _cuentaBancaria=" + _cuentaBancaria
				+ ", _bancoDeDestino=" + _bancoDeDestino + "]";
	}
	
	
    
    
}
