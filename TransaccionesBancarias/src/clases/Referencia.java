package clases;

/*
 * autor: Alex Fuentes
 * Fecha: 12/07/20
 * 
 * clase: Referencia
 * Descripcion: toma los datos de una persona recomendada para
 *              la creacion de una nueva cuenta.
 * 
 * */
public class Referencia {
	private String _nombre;
	private String _apellido;
	private String _direccion;
	private String _telefono;
	private String  _correoElectronico;
	private String _rtn;
	
	//CONSTRUCTOR POR DEFECTO
	public Referencia() {
		super();
	}

	//CONSTRUCTOR DE LA CLASE CON TODOS LOS CAMPOS
	public Referencia(String _nombre, String _apellido, String _direccion, String _telefono, String _correoElectronico,
			String _rtn) {
		super();
		this._nombre = _nombre;
		this._apellido = _apellido;
		this._direccion = _direccion;
		this._telefono = _telefono;
		this._correoElectronico = _correoElectronico;
		this._rtn = _rtn;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public String get_apellido() {
		return _apellido;
	}

	public void set_apellido(String _apellido) {
		this._apellido = _apellido;
	}

	public String get_direccion() {
		return _direccion;
	}

	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}

	public String get_telefono() {
		return _telefono;
	}

	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}

	public String get_correoElectronico() {
		return _correoElectronico;
	}

	public void set_correoElectronico(String _correoElectronico) {
		this._correoElectronico = _correoElectronico;
	}

	public String get_rtn() {
		return _rtn;
	}

	public void set_rtn(String _rtn) {
		this._rtn = _rtn;
	}
	
	//SOBREESCRITURA DE TOSTRING
	@Override
	public String toString() {
		return "Referencia [_nombre=" + _nombre + ", _apellido=" + _apellido + ", _direccion=" + _direccion
				+ ", _telefono=" + _telefono + ", _correoElectronico=" + _correoElectronico + ", _rtn=" + _rtn + "]";
	}

}
