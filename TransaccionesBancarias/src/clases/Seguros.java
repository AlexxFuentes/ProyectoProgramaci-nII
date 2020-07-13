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
      private double _seguroaAuto;
      private double _seguroMedico;
      private double _seguroDeVida;
      
	public Seguros() {
		super();
	}

	public Seguros(double seguroaAuto, double seguroMedico, double seguroDeVida) {
		super();
		this._seguroaAuto = seguroaAuto;
		this._seguroMedico = seguroMedico;
		this._seguroDeVida = seguroDeVida;
	}

	public double get_seguroaAuto() {
		return _seguroaAuto;
	}

	public void set_seguroaAuto(double _seguroaAuto) {
		this._seguroaAuto = _seguroaAuto;
	}

	public double get_seguroMedico() {
		return _seguroMedico;
	}

	public void set_seguroMedico(double _seguroMedico) {
		this._seguroMedico = _seguroMedico;
	}

	public double get_seguroDeVida() {
		return _seguroDeVida;
	}

	public void set_seguroDeVida(double _seguroDeVida) {
		this._seguroDeVida = _seguroDeVida;
	}

	@Override
	public String toString() {
		return "Seguros [_seguroaAuto=" + _seguroaAuto + ", _seguroMedico=" + _seguroMedico + ", _seguroDeVida="
				+ _seguroDeVida + "]";
	}
	
	
      
      
}
