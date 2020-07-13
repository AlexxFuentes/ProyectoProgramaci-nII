package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: Transferencias
 * Descripcion: Tipo de transferencias que
 *             puedan realizarse.
 * */

public class Transferencias {
	private String _nacionales;
    private String _internacionales;
    private String _tipoMoneda;
    private TransferenciasEntreCuentas _transferenciasEntreCuentas;
    private TransferenciasInterbancarias _transferenciasInterbancarias;
    private CuentaBancaria _cuentaBancaria;
    
	public Transferencias() {
		super();
	}

	public Transferencias(String nacionales, String internacionales, String tipoMoneda,
			TransferenciasEntreCuentas transferenciasEntreCuentas,
			TransferenciasInterbancarias transferenciasInterbancarias, CuentaBancaria cuentaBancaria) {
		super();
		this._nacionales = nacionales;
		this._internacionales = internacionales;
		this._tipoMoneda = tipoMoneda;
		this._transferenciasEntreCuentas = transferenciasEntreCuentas;
		this._transferenciasInterbancarias = transferenciasInterbancarias;
		this._cuentaBancaria = cuentaBancaria;
	}

	public String get_nacionales() {
		return _nacionales;
	}

	public void set_nacionales(String _nacionales) {
		this._nacionales = _nacionales;
	}

	public String get_internacionales() {
		return _internacionales;
	}

	public void set_internacionales(String _internacionales) {
		this._internacionales = _internacionales;
	}

	public String get_tipoMoneda() {
		return _tipoMoneda;
	}

	public void set_tipoMoneda(String _tipoMoneda) {
		this._tipoMoneda = _tipoMoneda;
	}

	public TransferenciasEntreCuentas get_transferenciasEntreCuentas() {
		return _transferenciasEntreCuentas;
	}

	public void set_transferenciasEntreCuentas(TransferenciasEntreCuentas _transferenciasEntreCuentas) {
		this._transferenciasEntreCuentas = _transferenciasEntreCuentas;
	}

	public TransferenciasInterbancarias get_transferenciasInterbancarias() {
		return _transferenciasInterbancarias;
	}

	public void set_transferenciasInterbancarias(TransferenciasInterbancarias _transferenciasInterbancarias) {
		this._transferenciasInterbancarias = _transferenciasInterbancarias;
	}

	public CuentaBancaria get_cuentaBancaria() {
		return _cuentaBancaria;
	}

	public void set_cuentaBancaria(CuentaBancaria _cuentaBancaria) {
		this._cuentaBancaria = _cuentaBancaria;
	}

	@Override
	public String toString() {
		return "Transferencias [_nacionales=" + _nacionales + ", _internacionales=" + _internacionales
				+ ", _tipoMoneda=" + _tipoMoneda + ", _transferenciasEntreCuentas=" + _transferenciasEntreCuentas
				+ ", _transferenciasInterbancarias=" + _transferenciasInterbancarias + ", _cuentaBancaria="
				+ _cuentaBancaria + "]";
	}
    
    
    
}
