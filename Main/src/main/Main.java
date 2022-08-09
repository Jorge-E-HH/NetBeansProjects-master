
package main;

import java.io.*;

import java.util.*;

 

public class Main {

 

    public static Scanner teclado = new Scanner(System.in);

    public static PrintStream out = System.out;

 

    public static void pausar(String mensage) {

        out.print(mensage + "\nPresione <ENTER> para continuar . . . ");

        teclado.nextLine();

        out.println();

    }

 

    public static String leer_cadena(String mensaje) {

        out.print(mensaje + ": ");

        return teclado.nextLine();

    }

 

    public static int leer_entero(String mensaje) {

        try {

            return Integer.parseInt(leer_cadena(mensaje));

        } catch (NumberFormatException e) {

            out.print("N\u00FAmero incorrecto.");

            return leer_entero(mensaje);

        }

    }