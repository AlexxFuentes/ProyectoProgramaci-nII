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
    private Depositar _depositar;
    private Retirar _retirar;
    private String _bancoDeDestino;
    
	public TransferenciasInterbancarias() {
		super();
	}

	public TransferenciasInterbancarias(TipoCuenta tipoCuenta, Usuario usuario, String cuentaAtransferir,
			Depositar depositar, Retirar retirar, String bancoDeDestino) {
		super();
		this._tipoCuenta = tipoCuenta;
		this._usuario = usuario;
		this._cuentaAtransferir = cuentaAtransferir;
		this._depositar = depositar;
		this._retirar = retirar;
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

	public String get_bancoDeDestino() {
		return _bancoDeDestino;
	}

	public void set_bancoDeDestino(String _bancoDeDestino) {
		this._bancoDeDestino = _bancoDeDestino;
	}

	@Override
	public String toString() {
		return "TransferenciasInterbancarias [_tipoCuenta=" + _tipoCuenta + ", _usuario=" + _usuario
				+ ", _cuentaAtransferir=" + _cuentaAtransferir + ", _depositar=" + _depositar + ", _retirar=" + _retirar
				+ ", _bancoDeDestino=" + _bancoDeDestino + "]";
	}

	
}
