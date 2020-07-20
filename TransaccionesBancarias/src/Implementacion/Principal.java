package Implementacion;

import java.util.Scanner;
import clases.*;
import GestionClases.*;

public class Principal {

	public static void main(String[] args) {
		
		//INSTANCIAS DE SCANNER
		Scanner sc = new Scanner(System.in);//Para lectura de cadena
		Scanner scnum = new Scanner(System.in);
		
		//VARIABLES A UTILIZAR
		byte opcionPrincipal = 0, opcionTipoCuenta = 0; 
		String nombres, apellidos, constrasena, constrasenaconfirm, correo, direccion, rtn, telefono, usuarioConfir, usuario;
		
		String nombresReferencia, apellidoReferencia, direccionReferencia, telefonoReferencia, correoReferencia, rtnReferencia;
		String NumCuenta = null;
		double montoInicial = 0, interesRemunerado = 0;
		
		//CENTINELAS
		boolean centinalaPrincipal = true, centinelaContraseña = true, centinelaUsuario = true, centinelaTipoCuenta = true;
		
		//INSTANCIAS DE CLASES DE GESTIÓN
		GestionCrearCuenta gestioncrearcuenta = new GestionCrearCuenta();
		
		GestionTipoCuenta gestionTipoCuenta = new GestionTipoCuenta();
		GestionCuentaAhorro gestionCuentaAhorro = new GestionCuentaAhorro();
		GestionCuentaCheques gestionCuentaCheques = new GestionCuentaCheques();
		GestionCuentaCorrientePersonal gestionCuenCorrienPersonal = new GestionCuentaCorrientePersonal();
		GestionCuentaNomina gestionCuentaNomina = new GestionCuentaNomina();
		
		GestionDepositar gestionDepositar = new GestionDepositar();
		GestionNumeroCuenta gestionNumeroCuenta = new GestionNumeroCuenta();
		GestionReferencia gestionReferencia = new GestionReferencia();		
		GestionUsuario gestionUsuario = new GestionUsuario();
		
		while(centinalaPrincipal) {
			
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1. REGISTRAR SUS DATOS Y CREAR UNA CUENTA BANCARIA.");
			System.out.println("2. INGRESAR USUARIO Y CONTRASEÑA");
			System.out.println("3. SALIR");
			opcionPrincipal = scnum.nextByte();
			
			//TIPO CUENTA, USUARIO, CREAR CUENTA, REFERENCIA,
			//TipoCuenta tipoCuentaCreada = new TipoCuenta();//
			TipoCuenta tipoCuentaCreada1 = new TipoCuenta();
			Usuario UsuarioCreado = new Usuario();//
			CrearCuenta CuentaCreada = new CrearCuenta();
			Referencia referencia1 = new Referencia();//
			
			switch(opcionPrincipal) {
			case 1: //CREAR CUENTA
				
				System.out.println("CREAR NUEVA CUENTA");
				System.out.println("\nDATOS PERSONALES DEL TITULAR DE LA CUENTA\n");
				
				System.out.println("Nombres: ");
				nombres = sc.nextLine();
				UsuarioCreado.set_nombre(nombres);
				
				System.out.println("Apellidos: ");
				apellidos = sc.nextLine();
				UsuarioCreado.set_apellido(apellidos);
				
				System.out.println("Direción");
				direccion = sc.nextLine();
				UsuarioCreado.set_direccion(direccion);
				
				System.out.println("Telefono: ");
				telefono = sc.nextLine();
				UsuarioCreado.set_telefono(telefono);
				
				System.out.println("RTN: ");
				rtn = sc.nextLine();
				UsuarioCreado.set_rtn(rtn);
				
				System.out.println("Correo electronico: ");
				correo = sc.nextLine();
				UsuarioCreado.set_correoelectronico(correo);
				
				//CREAR NOMBRE DE USUARIO
				System.out.println("\nCree un nombre de usuario.\n");
				while(centinelaUsuario) {
					System.out.println("Usuario: ");
					usuario = sc.nextLine();
					CuentaCreada.set_nombreUsuario(usuario);
					
					System.out.println("Confirmar Usuario: ");
					usuarioConfir = sc.nextLine();
					CuentaCreada.set_nombreUsuarioConfir(usuarioConfir);
					
					if(gestioncrearcuenta.Confirmar(usuario, usuarioConfir)) {
						System.out.println("Nombre de usuario creado correctamente.");
						centinelaUsuario = false;
					}else {
						System.out.println("Los nombres de usuario no coinciden.");
					}
				}//FIN DE CODIGO PARA CREAR NOMBRE DE USUARIO
				
				//CREAR CONTRASEÑA
				System.out.println("\nCree una contraseña. \n");
				while(centinelaContraseña) {
					System.out.println("Contraseña: ");
					constrasena = sc.nextLine();
					CuentaCreada.set_contrasena(constrasena);
					
					System.out.println("Confirmar contraseña: ");
					constrasenaconfirm = sc.nextLine();
					CuentaCreada.set_Confirmarcontrasena(constrasenaconfirm);
					
					if(gestioncrearcuenta.Confirmar(constrasena, constrasenaconfirm)) {
						System.out.println("Contraseña creada con exito");
						centinelaContraseña = false;
					}else {
						System.out.println("Las constraseñas no coinciden.");
					}
				}//FIN DE CODIGO PARA CREAR CONTRASEÑA
				
				//CREAR TIPO DE CUENTA
				while(centinelaTipoCuenta) {
					System.out.println("\nCREAR CUENTA BANCARIA");
					System.out.println("SELECCIONES EL TIPO DE CUENTA A CREAR");
					System.out.println("1. Cuenta de ahorro.");
					System.out.println("2. Cuenta de cheques.");
					System.out.println("3. Cuenta corriente persoanl.");
					System.out.println("4. Cuenta nomina.");
					opcionTipoCuenta = scnum.nextByte();
					
					//CREACIÓN DEL TIPO DE CUENTA SELECCIONADA
					switch(opcionTipoCuenta) {
					
					case 1: //CUENTA DE AHORRO
						
						System.out.println("APERTURA DE CUENTA DE AHORRO\n");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						interesRemunerado = gestionCuentaAhorro.InteresRemunerado(montoInicial);
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						System.out.println("Su número de cuenta es:" + NumCuenta + "\n");
						
						CuentaAhorro cuentaAhorroCreada = new CuentaAhorro(NumCuenta,montoInicial,interesRemunerado);
						
						//COMPROBACIÓN DE QUE SE CREO LA CUENTA DE AHORRO
						if(gestionCuentaAhorro.AgregarCuentaAhorro(cuentaAhorroCreada)) {
							System.out.println("CUENTA DE AHORRO CREADA EXITOSAMENTE.\n");
						}else {
							System.out.println("ERROR AL CREAR CUENTA DE AHORRO.\n");
						}
						tipoCuentaCreada1.set_cuentaahorro(cuentaAhorroCreada);
						UsuarioCreado.set_tipocuenta(tipoCuentaCreada1);
						
						//AGREGAR TIPO CUENTA: CUENTA DE AHORRO
						if(gestionTipoCuenta.AgregarTipoCuenta(tipoCuentaCreada1)) {
							System.out.println("TIPO DE CUENTA AGREGADA CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL AGREGAR TIPO DE CUENTA.\n");
						}
						
						//REALIZACIÓN DE DEPOSITO DE APERTURA
						Depositar deposito1 = new Depositar(tipoCuentaCreada1,montoInicial,(montoInicial + interesRemunerado ));
						if(gestionDepositar.AgregarDeposito(deposito1)) {
							System.out.println("DEPOSITO DE APERTURA REALIZADO CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL REALIZAR DEPOSITO DE APERTURA.\n");
						}
						
						break;
						
					case 2: //CUENTA DE CHEQUES
						
						System.out.println("APERTURA DE CUENTA DE CHEQUES\n");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						interesRemunerado = gestionCuentaCheques.InteresRemunerados(montoInicial);
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						
						System.out.println("Su número de cuenta es:" + NumCuenta + "\n");
						
						CuentaCheques cuentaChequeCreada = new CuentaCheques(NumCuenta,montoInicial,interesRemunerado);
						
						//COMPROBACIÓN DE QUE SE AGREGO LA CUENTA DE AHORRO
						if(gestionCuentaCheques.AgregarCuentaCheques(cuentaChequeCreada) == true) {
							System.out.println("CUENTA DE CHEQUES AGREGADA CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL AGREGAR CUENTA DE CHEQUES");
						}
						tipoCuentaCreada1.set_cuentacheques(cuentaChequeCreada);
						UsuarioCreado.set_tipocuenta(tipoCuentaCreada1);
						
						//AGREGAR TIPO CUENTA: CUENTA DE CHEQUES
						if(gestionTipoCuenta.AgregarTipoCuenta(tipoCuentaCreada1)) {
							System.out.println("TIPO DE CUENTA AGREGADA CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL AGREGAR TIPO DE CUENTA.\n");
						}
						
						//REALIZACIÓN DE DEPOSITO DE APERTURA
						Depositar deposito2 = new Depositar(tipoCuentaCreada1,montoInicial,(montoInicial + interesRemunerado ));
						if(gestionDepositar.AgregarDeposito(deposito2)) {
							System.out.println("DEPOSITO DE APERTURA REALIZADO CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL REALIZAR DEPOSITO DE APERTURA.\n");
						}
						
						break;

					case 3: //CUENTA DE CORRIENTE PERSONAL
						
						System.out.println("APERTURA DE CUENTA CORRIENTE PERSONAL.\n");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						System.out.println("Su número de cuenta es:" + NumCuenta + "\n");
						
						CuentaCorrientePersonal cuentaCorrientePersonalCreada = new CuentaCorrientePersonal(NumCuenta,montoInicial);
						
						//COMPROBACIÓN DE QUE SE AGREGO LA CUENTA CORRIENTE PERSONAL
						if(gestionCuenCorrienPersonal.AgregarCuentaCorrientePersonal(cuentaCorrientePersonalCreada)) {
							System.out.println("CUENTA CORRIENTE PERSONAL AGREGADA CON EXITO.\n");
						}else {
							System.out.println("ERROR AL AGREGAR LA CUENTA CORRIENTE PERSONAL.\n");
						}
						tipoCuentaCreada1.set_cuentacorrientepersonal(cuentaCorrientePersonalCreada);
						UsuarioCreado.set_tipocuenta(tipoCuentaCreada1);
						
						//AGREGAR TIPO CUENTA: CUENTA CORRIENTE PERSONAL
						if(gestionTipoCuenta.AgregarTipoCuenta(tipoCuentaCreada1)) {
							System.out.println("TIPO DE CUENTA AGREGADA CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL AGREGAR TIPO DE CUENTA.\n");
						}
						
						//REALIZACIÓN DE DEPOSITO DE APERTURA
						Depositar deposito3 = new Depositar(tipoCuentaCreada1,montoInicial,(montoInicial + interesRemunerado ));
						if(gestionDepositar.AgregarDeposito(deposito3)) {
							System.out.println("DEPOSITO DE APERTURA REALIZADO CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL REALIZAR DEPOSITO DE APERTURA.\n");
						}
						
						break;
						
					case 4: //CUENTA NOMINA

						System.out.println("APERTURA DE CUENTA NOMINA.\n");
						System.out.println("Empresa que le realizara sus depositos:");
						String empresa = sc.nextLine();
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						System.out.println("Su número de cuenta es:" + NumCuenta + "\n");
						
						CuentaNomina cuentaNominaCreada = new CuentaNomina(NumCuenta,montoInicial,empresa);
						
						//COMPROBACIÓN DE QUE SE AGREGO LA CUENTA NOMINA
						if(gestionCuentaNomina.AgregarCuentaNomina(cuentaNominaCreada)) {
							System.out.println("CUENTA NOMINA CREADA EXITOSAMENTE.\n");
						}else {
							System.out.println("ERROR AL CREAR CUENTA NOMINA.\n");
						}
						tipoCuentaCreada1.set_cuentanomina(cuentaNominaCreada);
						UsuarioCreado.set_tipocuenta(tipoCuentaCreada1);
						
						//AGREGAR TIPO CUENTA: CUENTA NOMINA
						if(gestionTipoCuenta.AgregarTipoCuenta(tipoCuentaCreada1)) {
							System.out.println("TIPO DE CUENTA AGREGADA CORRECTAMENTE.\n");
						}else {
							System.out.println("ERROR AL AGREGAR TIPO DE CUENTA.\n");
						}
						
						break;
						
						default:
							System.out.println("OPCIÓN NO VALIDA.\n");
							break;
					}
					System.out.println("¿Desea crear otro tipo de cuenta?\n 1. Si \n 2.NO");
					byte opcioncrearcuenta = scnum.nextByte();
					if(opcioncrearcuenta == 2) {
						centinelaTipoCuenta = false;
					}
					
				}//FIN DE CODIGO PARA AGREGAR OTRO TIPO DE CUENTA
				
				//PEDIR DATOS DE REFERENCIA AL USUARIO
				boolean CentinelaReferencia = true;
				while(CentinelaReferencia) {
					System.out.println("Referencia:");
					System.out.println("Nombres: ");
					nombresReferencia = sc.nextLine();
					referencia1.set_nombre(nombresReferencia);
					
					System.out.println("Apellidos: ");
					apellidoReferencia = sc.nextLine();
					referencia1.set_apellido(apellidoReferencia);
					
					System.out.println("Direción");
					direccionReferencia = sc.nextLine();
					referencia1.set_direccion(direccionReferencia);
					
					System.out.println("Telefono: ");
					telefonoReferencia = sc.nextLine();
					referencia1.set_telefono(telefonoReferencia);
					
					System.out.println("RTN: ");
					rtnReferencia = sc.nextLine();
					referencia1.set_rtn(rtnReferencia);
					
					System.out.println("Correo electronico: ");
					correoReferencia = sc.nextLine();
					referencia1.set_correoElectronico(correoReferencia);
					
					//COMPROBACIÓN QUE REFERECIA SE AGREGO CORRECTAMENTE
					if(gestionReferencia.AgregarReferencia(referencia1) == true) {
						System.out.println("Referencia agregada correctamente.");
					}else {
						System.out.println("Error al agregar referencia.");
					}
					
					System.out.println("¿Desea Agregar otra referencia? 1.Si / 2.NO");
					byte opcionRefencia = scnum.nextByte();
					if(opcionRefencia == 2) {
						CentinelaReferencia = false;
					}
					
				}//FIN DE CODIGO PARA AGREGAR REFERENCIAS
				CuentaCreada.set_usuario(UsuarioCreado);
				CuentaCreada.set_referencia(referencia1);
				
				//AGREGADOS: REFERENCIA, Usuario, tipocuenta, Crear cuenta
				if(gestionUsuario.AgregarUsuario(UsuarioCreado) == true) {
					System.out.println("Usuario agregado correctamente.");
				}else {
					System.out.println("Error al agregar Usuario.");
				}
				
				
				if(gestioncrearcuenta.AgregarNuevaCuenta(CuentaCreada) == true) {
					System.out.println("CUENTA CREADA EXITOSAMENTE.");
				}else {
					System.out.println("ERROR A CREAR CUENTA.");
				}
				
				gestionUsuario.imprimirTodos();
				gestionReferencia.imprimirTodos();
				gestionTipoCuenta.imprimirTodos();
				gestioncrearcuenta.imprimirTodos();
				gestionCuentaAhorro.imprimirTodos();
				gestionDepositar.imprimirTodos();
				
				break;
			case 2: //INGRESAR USUARIO Y CONTRASEÑA
				
				boolean centinelaConfirmarUsuario = true; 
				
				while(centinelaConfirmarUsuario) {
				
					System.out.println("Ingrese su nombre de usuario:");
					usuario = sc.nextLine();
					
					System.out.println("Ingrese su contraseña: ");
					constrasena = sc.nextLine();
					
					//corregir
					
					if(gestioncrearcuenta.BuscarNombreUsuario(usuario) && gestioncrearcuenta.BuscarContrasena(constrasena)) {
						centinelaConfirmarUsuario = false;
					}else {
						System.out.println("Usuario y contraseña incorrecto o Usuario no registrado.");
					}
				}
				
				boolean centinelaMenuTransferencias = true;
				byte opcionMenuTransferencias, opcion_menu;
				
				while(centinelaMenuTransferencias) {
					
					System.out.println("MENU DE OPERACIONES BANCARIAS");
					System.out.println("1. Depositar.");
					System.out.println("2. Retirar.");
					System.out.println("3. Consultar saldo.");
					System.out.println("4. Transferencias.");
					System.out.println("5. Pago de servicios publicos.");
					System.out.println("6. salir.");
					System.out.println("Ingrese una de las opciones: ");
					opcion_menu = scnum.nextByte();
					
					
					switch(opcion_menu) {
					case 1: // DEPOSITAR
						break;
					case 2: //RETIRAR
						break;
					case 3: // CONSULTAR SALDO
						break;
					case 4: //TRANSFERENCIAS
						break;
					case 5: //PAGO DE SERVICIOS PUBLICOS
						break;
					case 6: //SALIR
						centinelaMenuTransferencias = false;
						break;
						default:
							System.out.println("Opcion no valida.");
							break;
					}
					
					System.out.println("¿Desea realizar otra Transacción?\n1. SI\n2.NO");
					opcionMenuTransferencias = scnum.nextByte();
					if(opcionMenuTransferencias == 2) {
						centinelaMenuTransferencias = false;
					}
				}//FIN DE CODIGO DE TRANSFERENCIAS
				
				break;
			case 3://SALIR
				centinalaPrincipal = false;
				break;
				default:
					System.out.println("OPCIÓN NO VALIDA.");
					break;
			}
		}
		sc.close();
		scnum.close();
	}

}
