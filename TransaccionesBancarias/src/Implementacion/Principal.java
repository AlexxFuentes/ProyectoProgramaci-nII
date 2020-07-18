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
		String nombres, apellidos, constrasena, constrasenaconfirm, correo, direccion, rtn, telefono, usuario, usuarioConfir,
		      numCuenta;
		double montoInicial;
		
		//CENTINELAS
		boolean centinalaPrincipal = true, centinelaContraseña = true, centinelaUsuario = true, centinelaTipoCuenta = true;
		
		//INSTANCIAS DE CLASES
		GestionCrearCuenta gestioncrearcuenta = new GestionCrearCuenta();
		GestionNumeroCuenta gestionnumerocuenta = new GestionNumeroCuenta();
		GestionTipoCuenta gestiontipocuenta = new GestionTipoCuenta();
		GestionUsuario gestionusuario = new GestionUsuario();
		
		while(centinalaPrincipal) {
			
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1. CREAR CUENTA");
			System.out.println("2. INGRESAR USUARIO Y CONTRASEÑA");
			System.out.println("3. SALIR");
			opcionPrincipal = scnum.nextByte();
			
			switch(opcionPrincipal) {
			case 1: //CREAR CUENTA
				/**
				 * PASOS PARA CREAR UNA NUEVA CUENTA CUENTA
				 * 1. PEDIR LOS DATOS AL USUARIO
				 */
				
				System.out.println("CREAR CUENTA");
				System.out.println("Nombres: ");
				nombres = sc.nextLine();
				System.out.println("Apellidos: ");
				apellidos = sc.nextLine();
				System.out.println("Direción");
				direccion = sc.nextLine();
				System.out.println("Telefono: ");
				telefono = sc.nextLine();
				System.out.println("RTN: ");
				rtn = sc.nextLine();
				System.out.println("Correo electronico: ");
				correo = sc.nextLine();
				
				while(centinelaContraseña) {//CREAR CONTRASEÑA
					System.out.println("Contraseña: ");
					constrasena = sc.nextLine();
					System.out.println("Confirmar contraseña: ");
					constrasenaconfirm = sc.nextLine();
					
					if(gestioncrearcuenta.Confirmar(constrasena, constrasenaconfirm)) {
						centinelaContraseña = false;
					}else {
						System.out.println("Las constraseñas no coinciden.");
					}
				}
				while(centinelaUsuario) {//CREAR NOMBRE DE USUARIO
					System.out.println("Usuario: ");
					usuario = sc.nextLine();
					System.out.println("Confirmar Usuario: ");
					usuarioConfir = sc.nextLine();
					
					if(gestioncrearcuenta.Confirmar(usuario, usuarioConfir)) {
						centinelaUsuario = false;
					}else {
						System.out.println("Los nombres de usuario no coinciden.");
					}
				}
				System.out.println("Número de cuenta: " + gestionnumerocuenta.GeneraNumeroCuenta());
				
				
				while(centinelaTipoCuenta) {
					System.out.println("Seleccione Tipo de cuenta a crear: ");
					System.out.println("1. Cuenta de ahorro.");
					System.out.println("2. Cuenta de cheques.");
					System.out.println("3. Cuenta corriente persoanl.");
					System.out.println("4. Cuenta nomina.");
					opcionTipoCuenta = scnum.nextByte();
					
					TipoCuenta tipocuenta1 = null;
					
					switch(opcionTipoCuenta) {
					case 1: //CUENTA DE AHORRO
						CuentaAhorro cuentaAhorro1 = new CuentaAhorro();
						GestionDepositar deposito1 = new GestionDepositar();
						
						System.out.println("Apertura de Cuenta de Ahorro");
						System.out.println("Monto inicial: ");
						montoInicial = scnum.nextDouble();
						
						//deposito1.Agregar(montoInicial);
						
						
						if(centinelaTipoCuenta) {//aqui me quede
							
							System.out.println("Cuenta de ahorro creada con exito.");
						}else {
							System.out.println("Error a crear cuenta.");
						}
						break;
						
					case 2: //CUENTA DE CHEQUES
						break;

					case 3: //CUENTA DE CORRIENTE PERSONAL
						break;
						
					case 4: //CUENTA NOMINA
						break;
						
						default:
							System.out.println("Opción no valida.");
							break;
					}
				}
				
				CrearCuenta crearcuenta1 = new CrearCuenta();
				Usuario usuario1 = new Usuario(nombres, apellidos,direccion, telefono, rtn ,correo, crearcuenta1);
				
				gestionusuario.imprimirTodos();
				
				
				break;
			case 2: //INGRESAR USUARIO Y CONTRASEÑA
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
