package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: Seguros
 * Descripcion: Da a conocer los tipos
 *              de seguros disponibles.
 * 
 * */

public class Seguros {
      private String _seguroAuto;
      private String _seguroMedico;
      private String _seguroDeVida;
      
	public Seguros() {
		super();
	}

	public Seguros(String seguroAuto, String seguroMedico, String seguroDeVida) {
		super();
		this._seguroAuto = seguroAuto;
		this._seguroMedico = seguroMedico;
		this._seguroDeVida = seguroDeVida;
	}

	public String get_seguroAuto() {
		return _seguroAuto;
	}

	public void set_seguroaAuto(String _seguroAuto) {
		this._seguroAuto = _seguroAuto;
	}

	public String get_seguroMedico() {
		return _seguroMedico;
	}

	public void set_seguroMedico(String _seguroMedico) {
		this._seguroMedico = _seguroMedico;
	}

	public String get_seguroDeVida() {
		return _seguroDeVida;
	}

	public void set_seguroDeVida(String _seguroDeVida) {
		this._seguroDeVida = _seguroDeVida;
	}

	@Override
	public String toString() {
		return "Seguros [_seguroAuto=" + _seguroAuto + ", _seguroMedico=" + _seguroMedico + ", _seguroDeVida="
				+ _seguroDeVida + "]";
	}
	
	
      
      
}
