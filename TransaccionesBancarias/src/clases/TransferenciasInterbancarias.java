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

    private String _numeroCuenta;
    private double _monto;
    private String _tipoMoneda;
    private String _bancoDeDestino;
    
	public TransferenciasInterbancarias() {
		super();
	}

	public TransferenciasInterbancarias(double monto,
			String tipoMoneda, String numeroCuenta, String bancoDeDestino) {
		super();
		this._monto = monto;
		this._tipoMoneda = tipoMoneda;
		this._numeroCuenta = numeroCuenta;
		this._bancoDeDestino = bancoDeDestino;
	}

	
    //GENERAR GET Y SET
	
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

	public String get_numeroCuenta() {
		return _numeroCuenta;
	}

	public void set_numeroCuenta(String _numeroCuenta) {
		this._numeroCuenta = _numeroCuenta;
	}

	public String get_bancoDeDestino() {
		return _bancoDeDestino;
	}

	public void set_bancoDeDestino(String _bancoDeDestino) {
		this._bancoDeDestino = _bancoDeDestino;
	}

	@Override
	public String toString() {
		return "TransferenciasInterbancarias [_numeroCuenta=" + _numeroCuenta + ", _monto=" + _monto + ", _tipoMoneda="
				+ _tipoMoneda + ", _bancoDeDestino=" + _bancoDeDestino + "]";
	}

	
}
