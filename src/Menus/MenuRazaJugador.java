/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import static Menus.Menu.sn;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class MenuRazaJugador {

    int opc1;
    static Scanner sn = new Scanner(System.in);
    boolean salir = false;

    public int menuRazaJugador() {
        while (opc1 != 4) {
            System.out.println("Jugadore Creados, ahora seleccione la raza.");
            System.out.println("1.R1");
            System.out.println("2. R2");
            System.out.println("3. R3");
            System.out.println("4. Salir");
            
            J1.get

            opc1 = sn.nextInt();

            switch (opc1) {
                case 1:

                    System.out.println("juaz");
                    break;
            }
        }
        return 0;
    }

}
