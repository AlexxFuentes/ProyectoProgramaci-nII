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

	  private ServiciosPublicos _servicioaPagar;
	    private int _tasaSeguridad;
	    private TipoCuenta _tipoCuenta;
	    private Depositar _depositar;
	    
		public PagoServiciosPublicos() {
			super();
		}

		public PagoServiciosPublicos(ServiciosPublicos _servicioaPagar, int _tasaSeguridad, TipoCuenta _tipoCuenta,
				Depositar _depositar) {
			super();
			this._servicioaPagar = _servicioaPagar;
			this._tasaSeguridad = _tasaSeguridad;
			this._tipoCuenta = _tipoCuenta;
			this._depositar = _depositar;
		}

		public ServiciosPublicos get_servicioaPagar() {
			return _servicioaPagar;
		}

		public void set_servicioaPagar(ServiciosPublicos _servicioaPagar) {
			this._servicioaPagar = _servicioaPagar;
		}

		public int get_tasaSeguridad() {
			return _tasaSeguridad;
		}

		public void set_tasaSeguridad(int _tasaSeguridad) {
			this._tasaSeguridad = _tasaSeguridad;
		}

		public TipoCuenta get_tipoCuenta() {
			return _tipoCuenta;
		}

		public void set_tipoCuenta(TipoCuenta _tipoCuenta) {
			this._tipoCuenta = _tipoCuenta;
		}

		public Depositar get_depositar() {
			return _depositar;
		}

		public void set_depositar(Depositar _depositar) {
			this._depositar = _depositar;
		}

		@Override
		public String toString() {
			return "PagoServiciosPublicos [_servicioaPagar=" + _servicioaPagar + ", _tasaSeguridad=" + _tasaSeguridad
					+ ", _tipoCuenta=" + _tipoCuenta + ", _depositar=" + _depositar + "]";
		}

		
}
