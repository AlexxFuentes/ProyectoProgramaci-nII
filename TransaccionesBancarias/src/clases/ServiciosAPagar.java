package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: ServiciosPublicos
 * Descripcion: Muestra los servicios publicos
 *              los cuales el usuario puede pagar.
 * 
 * */

public class ServiciosAPagar {
    private double _telefonia;
    private double _cable;
    private double _internet;
    private double _energia;
    private double _aguaPotable;
    private Seguros _seguros;
    
	public ServiciosAPagar() {
		super();
	}

	public ServiciosAPagar(double telefonia, double cable, double internet, double energia,
			double aguaPotable, Seguros seguros) {
		super();
		this._telefonia = telefonia;
		this._cable = cable;
		this._internet = internet;
		this._energia = energia;
		this._aguaPotable = aguaPotable;
		this._seguros = seguros;
	}

	public double get_telefonia() {
		return _telefonia;
	}

	public void set_telefonia(double _telefonia) {
		this._telefonia = _telefonia;
	}

	public double get_cable() {
		return _cable;
	}

	public void set_cable(double _cable) {
		this._cable = _cable;
	}

	public double get_internet() {
		return _internet;
	}

	public void set_internet(double _internet) {
		this._internet = _internet;
	}


	public double get_energia() {
		return _energia;
	}

	public void set_energia(double _energia) {
		this._energia = _energia;
	}

	public double get_aguaPotable() {
		return _aguaPotable;
	}

	public void set_aguaPotable(double _aguaPotable) {
		this._aguaPotable = _aguaPotable;
	}

	public Seguros get_seguros() {
		return _seguros;
	}

	public void set_seguros(Seguros _seguros) {
		this._seguros = _seguros;
	}

	@Override
	public String toString() {
		return "ServiciosPublicos [_telefonia=" + _telefonia + ", _cable=" + _cable + ", _internet=" + _internet
				+ ", _energia=" + _energia + ", _aguaPotable=" + _aguaPotable
				+ ", _seguros=" + _seguros + "]";
	}
    
	
    
}
