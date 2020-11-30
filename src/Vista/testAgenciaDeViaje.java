package Vista;

import Controlador.CLogin;
import Controlador.FacadeServicios;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tavoGeek
 */
public class testAgenciaDeViaje {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String usuario = "";
        String password = "";
        String origen = "";
        String destino = "";

        // Login
        boolean permisoAcceder = false;

        System.out.println("Ingresa tu usuario");
        usuario = leer.next();

        System.out.println("Ingresan tu contraseña");
        password = leer.next();

        CLogin login = CLogin.getInstance(usuario, password);
        permisoAcceder = login.concederAcceso();

        if (!permisoAcceder) {
            System.out.println("Usuario y/o contraseña incorrectos");
            return;
        }

        System.out.println("Bienvenido al sistema");
        System.out.println("");
         System.out.println("Ingresa el origen");
        origen = leer.next();
        System.out.println("");
        System.out.println("Ingresa el destino");
        destino = leer.next();
        System.out.println("");
       

        FacadeServicios servicios = FacadeServicios.getInstance();
        servicios.cotizacionViaje(origen, destino);
    }
}
