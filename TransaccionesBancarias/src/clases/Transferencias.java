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
	private Usuario _usuario;
    private String _tipoMoneda;
    private TransferenciasEntreCuentas _transferenciasEntreCuentas;
    private TransferenciasInterbancarias _transferenciasInterbancarias;
    
	public Transferencias() {
		super();
	}

	public Transferencias(String tipoMoneda, Usuario usuario,
			TransferenciasEntreCuentas transferenciasEntreCuentas,
			TransferenciasInterbancarias transferenciasInterbancarias, Depositar depositar, Retirar retirar) {
		super();
		this._usuario = usuario;
		this._tipoMoneda = tipoMoneda;
		this._transferenciasEntreCuentas = transferenciasEntreCuentas;
		this._transferenciasInterbancarias = transferenciasInterbancarias;
	}

	
	public Usuario get_usuario() {
		return _usuario;
	}

	public void set_usuario(Usuario _usuario) {
		this._usuario = _usuario;
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


	@Override
	public String toString() {
		return "Transferencias [_usuario=" + _usuario + ", _tipoMoneda=" + _tipoMoneda
				+ ", _transferenciasEntreCuentas=" + _transferenciasEntreCuentas + ", _transferenciasInterbancarias="
				+ _transferenciasInterbancarias + "]";
	}

	
}
