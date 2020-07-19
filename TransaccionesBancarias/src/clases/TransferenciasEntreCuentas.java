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
    private String _cuentaDestino;
    private String _tipoMoneda;

    //CONSTRUCTOR POR DEFECTO
	public TransferenciasEntreCuentas() {
		super();
	}

	//CONSTRUCTOR CON TODOS LOS PARAMETROS
	public TransferenciasEntreCuentas(double monto, Usuario usuario, String _cuentaDestino,
			String _tipoMoneda) {
		super();
		this._monto = monto;
		this._cuentaDestino = _cuentaDestino;
		this._tipoMoneda = _tipoMoneda;
	}


    //GETTERS Y SETTERS
	public double get_monto() {
		return _monto;
	}

	public void set_monto(double _monto) {
		this._monto = _monto;
	}

	public String get_cuentaDestino() {
		return _cuentaDestino;
	}

	public void set_cuentaDestino(String _cuentaAtransferir) {
		this._cuentaDestino = _cuentaAtransferir;
	}

	public String get_tipoMoneda() {
		return _tipoMoneda;
	}

	public void set_tipoMoneda(String _tipoMoneda) {
		this._tipoMoneda = _tipoMoneda;
	}


	@Override
	public String toString() {
		return "TransferenciasEntreCuentas [_monto=" + _monto + ", _cuentaDestino=" + _cuentaDestino + ", _tipoMoneda="
				+ _tipoMoneda + "]";
	}

	
}
