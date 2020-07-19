package clases;

/**
 * CLASE REFERENCIA: AMINISTRA LOS DATOS DE REFERENCIA QUE 
 * PROPONE EL USUARIO AL MOMENTO DE CREAR UNA CUENTA DE 
 * CUALQUIER TIPO
 * 
 * @author Alex Fuentes
 *
 *Fecha: 12/07/2020
 */
public class Referencia {
	
	//ATRIBUTOS
	private String _nombre;//1
	private String _apellido;//2
	private String _direccion;//3
	private String _telefono;//4
	private String  _correoElectronico;//6
	private String _rtn;//5
	
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

	//GETTER AND SETTER
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
