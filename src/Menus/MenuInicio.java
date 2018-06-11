/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Jugador.Jugador;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class MenuInicio {

    int opc1;
    int opc2;
    static Scanner sn = new Scanner(System.in);
    boolean salir = false;

    public int Menu() {

        while (!salir) {

            System.out.println("1. Crear Jugador");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opc1 = sn.nextInt();
                opc2 = 0;

                switch (opc1) {
                    case 1:
                        Jugador J1 = new Jugador();
                        while (opc2 != 4) {
                            System.out.println("Jugador Creado");
                            System.out.println("1.Crear Soldado");
                            System.out.println("2. Opcion 2");
                            System.out.println("3. Opcion 3");
                            System.out.println("4. Salir");

                            opc1 = sn.nextInt();

                            switch (opc1) {
                                case 1:

                                    System.out.println("juaz");
                                    break;
                            }
                        }
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        return 0;
    }
}


