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
	    private CuentaBancaria _cuentaBancaria;
	    
		public PagoServiciosPublicos() {
			super();
		}

		public PagoServiciosPublicos(ServiciosPublicos servicioaPagar, int tasaSeguridad, TipoCuenta tipoCuenta,
				CuentaBancaria cuentaBancaria) {
			super();
			this._servicioaPagar = servicioaPagar;
			this._tasaSeguridad = tasaSeguridad;
			this._tipoCuenta = tipoCuenta;
			this._cuentaBancaria = cuentaBancaria;
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

		public CuentaBancaria get_cuentaBancaria() {
			return _cuentaBancaria;
		}

		public void set_cuentaBancaria(CuentaBancaria _cuentaBancaria) {
			this._cuentaBancaria = _cuentaBancaria;
		}

		@Override
		public String toString() {
			return "PagoServiciosPublicos [_servicioaPagar=" + _servicioaPagar + ", _tasaSeguridad=" + _tasaSeguridad
					+ ", _tipoCuenta=" + _tipoCuenta + ", _cuentaBancaria=" + _cuentaBancaria + "]";
		}

		
}
