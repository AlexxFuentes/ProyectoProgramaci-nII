package clases;

/*
 * autor: Gleny Nihimaya
 * Fecha: 13/07/20
 * 
 * clase: PagoServiciosPublicos
 * Descripcion: Permite que el usuario elija el
 *              servicio pubico que pagara;
 * 
 * */
public class PagoServiciosPublicos {

	  private ServiciosAPagar _servicioaPagar;
	    private double _tasaSeguridad;
	    private double _monto;
	    private Usuario _usuario;

	    
		public PagoServiciosPublicos() {
			super();
		}

		public PagoServiciosPublicos(ServiciosAPagar servicioaPagar, double tasaSeguridad, Usuario usuario,
				double monto, Retirar retirar) {
			super();
			this._servicioaPagar = servicioaPagar;
			this._tasaSeguridad = tasaSeguridad;
			this._usuario = usuario;
			this._monto = monto;
		
		}

		public ServiciosAPagar get_servicioaPagar() {
			return _servicioaPagar;
		}

		public void set_servicioaPagar(ServiciosAPagar _servicioaPagar) {
			this._servicioaPagar = _servicioaPagar;
		}

		public double get_tasaSeguridad() {
			return _tasaSeguridad;
		}

		public void set_tasaSeguridad(double _tasaSeguridad) {
			this._tasaSeguridad = _tasaSeguridad;
		}

		public Usuario get_usuario() {
			return _usuario;
		}

		public void set_usuario(Usuario _usuario) {
			this._usuario = _usuario;
		}

		public double get_monto() {
			return _monto;
		}

		public void set_monto(double _monto) {
			this._monto = _monto;
		}



		@Override
		public String toString() {
			return "PagoServiciosPublicos [_servicioaPagar=" + _servicioaPagar + ", _tasaSeguridad=" + _tasaSeguridad
					+ ", _usuario=" + _usuario + ", _monto=" + _monto + "]";
		}

		
}
