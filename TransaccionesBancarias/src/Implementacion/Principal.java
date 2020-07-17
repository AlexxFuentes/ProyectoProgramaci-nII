package Implementacion;

import java.util.Scanner;
import clases.*;
import GestionClases.*;

public class Principal {

	public static void main(String[] args) {
		
		//INSTANCIAS DE SCANNER
		Scanner sc = new Scanner(System.in);//Para lectura de cadena
		//Scanner scnum = new Scanner(System.in);
		
		//VARIABLES A UTILIZAR
		byte opcionPrincipal; 
		String nombres, apellidos, constrasena, constrasenaconfirm, correo, direccion, rtn, telefono, usuario, usuarioConfir,
		      numCuenta;
		
		//CENTINELAS
		boolean centinalaPrincipal = true, centinelaContraseña = true, centinelaUsuario = true;
		
		//INSTANCIAS DE CLASES
		GestionCrearCuenta gestioncrearcuenta = new GestionCrearCuenta();
		GestionNumeroCuenta gestionnumerocuenta = new GestionNumeroCuenta();
		
		while(centinalaPrincipal) {
			
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("1. CREAR CUENTA");
			System.out.println("2. INGRESAR USUARIO Y CONTRASEÑA");
			System.out.println("3. SALIR");
			opcionPrincipal = sc.nextByte();
			
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
				System.out.println("RTN: ");
				rtn = sc.nextLine();
				System.out.println("Telefono: ");
				telefono = sc.nextLine();
				System.out.println("Correo electronico: ");
				correo = sc.nextLine();
				
				while(centinelaContraseña) {
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
				while(centinelaUsuario) {
					System.out.println("Usuario: ");
					usuario = sc.nextLine();
					System.out.println("Confirmar Usuario: ");
					usuarioConfir = sc.nextLine();
					
					if(gestioncrearcuenta.Confirmar(usuario, usuarioConfir)) {
						centinelaContraseña = false;
					}else {
						System.out.println("Los nombres de usuario no coinciden.");
					}
				}
				System.out.println("Número de cuenta: " + gestionnumerocuenta.GeneraNumeroCuenta());
			
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
		
	}

}
