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
		byte opcionPrincipal, opcionTipoCuenta; 
		String nombres, apellidos, constrasena, constrasenaconfirm, correo, direccion, rtn, telefono, usuarioConfir, usuario;
		
		String nombresReferencia, apellidoReferencia, direccionReferencia, telefonoReferencia, correoReferencia, rtnReferencia;
		
		//CENTINELAS
		boolean centinalaPrincipal = true, centinelaContrase�a = true, centinelaUsuario = true, centinelaTipoCuenta = true;
		
		//INSTANCIAS DE CLASES DE GESTI�N
		GestionCrearCuenta gestioncrearcuenta = new GestionCrearCuenta();
		
		GestionTipoCuenta gestionTipoCuenta = new GestionTipoCuenta();
		GestionCuentaAhorro gestionCuentaAhorro = new GestionCuentaAhorro();
		GestionCuentaCheques gestionCuentaCheques = new GestionCuentaCheques();
		GestionCuentaCorrientePersonal gestionCuenCorrienPersonal = new GestionCuentaCorrientePersonal();
		GestionCuentaNomina gestionCuentaNomina = new GestionCuentaNomina();
		
		//GestionDepositar gestionDepositar = new GestionDepositar();
		GestionNumeroCuenta gestionNumeroCuenta = new GestionNumeroCuenta();
		GestionReferencia gestionReferencia = new GestionReferencia();		
		GestionUsuario gestionUsuario = new GestionUsuario();
		
		//TipoCuenta tipoCuentaCreada = new TipoCuenta();
		
		while(centinalaPrincipal) {
			
			System.out.println("MEN� PRINCIPAL");
			System.out.println("1. CREAR CUENTA");
			System.out.println("2. INGRESAR USUARIO Y CONTRASE�A");
			System.out.println("3. SALIR");
			opcionPrincipal = scnum.nextByte();
			
			//REFERENCIA, Usuario, tipocuenta
			TipoCuenta tipoCuentaCreada = new TipoCuenta();//
			Usuario UsuarioCreado = new Usuario();//
			CrearCuenta CuentaCreada = new CrearCuenta();
			Referencia referencia1 = new Referencia();//
			
			switch(opcionPrincipal) {
			case 1: //CREAR CUENTA
				/**
				 * PASOS PARA CREAR UNA NUEVA CUENTA CUENTA
				 * 1. PEDIR LOS DATOS AL USUARIO
				 */
				
				System.out.println("CREAR CUENTA");
				System.out.println("Nombres: ");
				nombres = sc.nextLine();
				UsuarioCreado.set_nombre(nombres);
				
				System.out.println("Apellidos: ");
				apellidos = sc.nextLine();
				UsuarioCreado.set_apellido(apellidos);
				
				System.out.println("Direci�n");
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
				
				
				//CREAR CUENTA
				while(centinelaTipoCuenta) {
					System.out.println("Seleccione Tipo de cuenta a crear: ");
					System.out.println("1. Cuenta de ahorro.");
					System.out.println("2. Cuenta de cheques.");
					System.out.println("3. Cuenta corriente persoanl.");
					System.out.println("4. Cuenta nomina.");
					opcionTipoCuenta = scnum.nextByte();
					
					
					double montoInicial, interesRemunerado;
					String NumCuenta;
					
					switch(opcionTipoCuenta) {
					case 1: //CUENTA DE AHORRO
						/*
						CuentaAhorro cuenta1 = new CuentaAhorro();
						tipoCuenta.set_cuentaahorro(cuenta1);
						*/
						
						System.out.println("Apertura de Cuenta de Ahorro");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						
						interesRemunerado = gestionCuentaAhorro.InteresRemunerado(montoInicial);
						
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						
						System.out.println("\n Su n�mero de cuenta es:" + NumCuenta);
						
						CuentaAhorro cuentaAhorroCreada = new CuentaAhorro(NumCuenta,montoInicial,interesRemunerado);
						
						
						tipoCuentaCreada.set_cuentaahorro(cuentaAhorroCreada);
						
						if(gestionCuentaAhorro.AgregarCuentaAhorro(cuentaAhorroCreada) == true) {
							System.out.println("Cuenta de ahorro creada exitosamente.");
						}else {
							System.out.println("Error al crear cuenta de ahorro.");
						}
						
						
						break;
						
					case 2: //CUENTA DE CHEQUES
						
						System.out.println("Apertura de Cuenta de Cheques");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						
						interesRemunerado = gestionCuentaCheques.InteresRemunerados(montoInicial);
						
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						
						System.out.println("\n Su n�mero de cuenta es:" + NumCuenta);
						
						CuentaCheques cuentaChequeCreada = new CuentaCheques(NumCuenta,montoInicial,interesRemunerado);
						
						tipoCuentaCreada.set_cuentacheques(cuentaChequeCreada);
						
						if(gestionCuentaCheques.AgregarCuentaCheques(cuentaChequeCreada) == true) {
							System.out.println("Cuenta de cheques creada exitosamente.");
						}else {
							System.out.println("Error al crear cuenta de ahorro.");
						}
						
						break;

					case 3: //CUENTA DE CORRIENTE PERSONAL
						
						System.out.println("Apertura de Cuenta Corriente Personal");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						
						System.out.println("\n Su n�mero de cuenta es:" + NumCuenta);
						
						CuentaCorrientePersonal cuentaCorrientePersonalCreada = new CuentaCorrientePersonal(NumCuenta,montoInicial);
						
						tipoCuentaCreada.set_cuentacorrientepersonal(cuentaCorrientePersonalCreada);
						
						if(gestionCuenCorrienPersonal.AgregarCuentaCorrientePersonal(cuentaCorrientePersonalCreada) == true) {
							System.out.println("Cuenta Corriente personal creada exitosamente.");
						}else {
							System.out.println("Error al crear cuenta corriente personal.");
						}
						
						break;
						
					case 4: //CUENTA NOMINA
						
						//gestionCuentaNomina
						
						System.out.println("Apertura de Cuenta Nomina");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						System.out.println("Empresa que le realizara sus depositos:");
						String empresa = sc.nextLine();
						
						NumCuenta = gestionNumeroCuenta.GeneraNumeroCuenta();
						
						System.out.println("\n Su n�mero de cuenta es:" + NumCuenta);
						
						CuentaNomina cuentaNominaCreada = new CuentaNomina(NumCuenta,montoInicial,empresa);
						
						tipoCuentaCreada.set_cuentanomina(cuentaNominaCreada);
						
						if(gestionCuentaNomina.AgregarCuentaNomina(cuentaNominaCreada) == true) {
							System.out.println("Cuenta nomina creada exitosamente.");
						}else {
							System.out.println("Error al crear cuenta nomina.");
						}
						
						break;
						
						default:
							System.out.println("Opci�n no valida.");
							break;
					}
					System.out.println("�Desea crear otro tipo de cuenta? 1. Si 2.NO");
					byte opcioncrearcuenta = scnum.nextByte();
					if(opcioncrearcuenta == 2) {
						centinelaTipoCuenta = false;
					}
					UsuarioCreado.set_tipocuenta(tipoCuentaCreada);
					
					//Agregar A tipoCUenta
					if(gestionTipoCuenta.AgregarTipoCuenta(tipoCuentaCreada) == true) {
						System.out.println("Cuenta Agregada correctamente");
					}else {
						System.out.println("Error al crear cuenta.");
					}
				}//FIN DE CODIGO PARA AGREGAR OTRO TIPO DE CUENTA
				
				
				while(centinelaContrase�a) {//CREAR CONTRASE�A
					System.out.println("Contrase�a: ");
					constrasena = sc.nextLine();
					CuentaCreada.set_contrasena(constrasena);
					
					System.out.println("Confirmar contrase�a: ");
					constrasenaconfirm = sc.nextLine();
					CuentaCreada.set_Confirmarcontrasena(constrasenaconfirm);
					
					if(gestioncrearcuenta.Confirmar(constrasena, constrasenaconfirm)) {
						centinelaContrase�a = false;
					}else {
						System.out.println("Las constrase�as no coinciden.");
					}
				}//FIN DE CODIGO PARA CREAR CONTRASE�A
				
				while(centinelaUsuario) {//CREAR NOMBRE DE USUARIO
					System.out.println("Usuario: ");
					usuario = sc.nextLine();
					CuentaCreada.set_nombreUsuario(usuario);
					
					System.out.println("Confirmar Usuario: ");
					usuarioConfir = sc.nextLine();
					CuentaCreada.set_nombreUsuarioConfir(usuarioConfir);
					
					if(gestioncrearcuenta.Confirmar(usuario, usuarioConfir)) {
						centinelaUsuario = false;
					}else {
						System.out.println("Los nombres de usuario no coinciden.");
					}
				}//FIN DE CODIGO PARA CREAR NOMBRE DE USUARIO
				
				boolean CentinelaReferencia = true;
				while(CentinelaReferencia) {
					System.out.println("Referencia:");
					System.out.println("Nombres: ");
					nombresReferencia = sc.nextLine();
					referencia1.set_nombre(nombresReferencia);
					
					System.out.println("Apellidos: ");
					apellidoReferencia = sc.nextLine();
					referencia1.set_apellido(apellidoReferencia);
					
					System.out.println("Direci�n");
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
					
					//COMPROBACI�N QUE REFERECIA SE AGREGO CORRECTAMENTE
					if(gestionReferencia.AgregarReferencia(referencia1) == true) {
						System.out.println("Referencia agregada correctamente.");
					}else {
						System.out.println("Error al agregar referencia.");
					}
					
					
					System.out.println("�Desea Agregar otra referencia? 1.Si / 2.NO");
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
				
				break;
			case 2: //INGRESAR USUARIO Y CONTRASE�A
				break;
			case 3://SALIR
				centinalaPrincipal = false;
				break;
				default:
					System.out.println("OPCI�N NO VALIDA.");
					break;
			}
		}
		sc.close();
		scnum.close();
	}

}
