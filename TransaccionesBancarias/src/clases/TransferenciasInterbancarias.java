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
    private Usuario _usuario;
    private String _cuentaAtransferir;
    private double _monto;
    private String _tipoMoneda;
    private Retirar _retirar;
    private String _bancoDeDestino;
    
	public TransferenciasInterbancarias() {
		super();
	}

	public TransferenciasInterbancarias(double monto, Usuario usuario, String cuentaAtransferir, 
			String tipoMoneda, Retirar retirar, String bancoDeDestino) {
		super();
		this._monto = monto;
		this._usuario = usuario;
		this._cuentaAtransferir = cuentaAtransferir;
		this._tipoMoneda = tipoMoneda;
		this._retirar = retirar;
		this._bancoDeDestino = bancoDeDestino;
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

	

	public double get_monto() {
		return _monto;
	}

	public void set_monto(double _monto) {
		this._monto = _monto;
	}

	public String get_tipoMoneda() {
		return _tipoMoneda;
	}

	public void set_tipoMoneda(String _tipoMoneda) {
		this._tipoMoneda = _tipoMoneda;
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
		return "TransferenciasInterbancarias [_monto=" + _monto + ", _usuario=" + _usuario
				+ ", _cuentaAtransferir=" + _cuentaAtransferir + ", _tipoMoneda=" + _tipoMoneda + ", _retirar=" + _retirar
				+ ", _bancoDeDestino=" + _bancoDeDestino + "]";
	}

	
}
