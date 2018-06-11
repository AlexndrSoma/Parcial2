/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Jugador.Jugador;
import static Menus.MenuRazaJugador.sn;
import Milicia.FabricaSoldados;
import Milicia.Soldado;
import Milicia.TipoSoldado;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Menu {

    int opc1;
    int opc2;
    int raza;
    int ataque;
    static Scanner sn = new Scanner(System.in);
    boolean salir = false;

    Jugador J1 = new Jugador();
    Jugador J2 = new Jugador();

    ArrayList<Soldado> SoldadosJ1 = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ2 = new ArrayList<>();

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        if (raza <= 3) {

            this.raza = raza;
        } else {
            System.out.println("Opción incorrecta");
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int menuInicio() {

        while (!salir) {

            System.out.println("1. Crear Jugadores");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opc1 = sn.nextInt();

                switch (opc1) {
                    case 1:

                        J1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del primer jugador:"));
                        J2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador:"));
                        menuRazaJugador();
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        return 0;
    }

    public int menuRazaJugador() {
        while (opc1 != 4) {
            System.out.println("JugadoreS Creados, ahora seleccione la raza.");
            System.out.println("1.R1");
            System.out.println("2. R2");
            System.out.println("3. R3");
            System.out.println("4. Salir");

            try {

                opc1 = sn.nextInt();

                switch (opc1) {
                    case 1:
                        J1.setRaza(1);
                        menuCreacionSoldado();
                        break;

                    case 2:
                        J1.setRaza(2);
                        menuCreacionSoldado();
                        break;

                    case 3:
                        J1.setRaza(3);
                        menuCreacionSoldado();
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();

            }
        }
        return 0;
    }

    public int menuCreacionSoldado() {
        while (opc1 != 4) {
            System.out.println("Jugador Creado");
            System.out.println("1.Crear Escuadron");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                opc1 = sn.nextInt();

                switch (opc1) {

                    case 1:

                        System.out.println("Creando Escuadron");

                        if (J1.getRaza() == 1) {
                            SoldadosJ1.add(FabricaSoldados.getEscuadron(TipoSoldado.ER1));

                        }
                        
                        if (J1.getRaza() == 2) {
                            SoldadosJ1.add(FabricaSoldados.getEscuadron(TipoSoldado.ER2));

                        }
                        
                        if (J1.getRaza() == 3) {
                            SoldadosJ1.add(FabricaSoldados.getEscuadron(TipoSoldado.ER3));

                        }

                        System.out.println("Soldado creado");
                        menuAtaque(); 
                        break;

                    case 2:
                        System.out.println("Creando Especialista");

                        if (J1.getRaza() == 1) {
                            SoldadosJ1.add(FabricaSoldados.getEspecialista(TipoSoldado.ESR1));

                        }
                        
                        if (J1.getRaza() == 2) {
                            SoldadosJ1.add(FabricaSoldados.getEspecialista(TipoSoldado.ESR2));

                        }
                        
                        if (J1.getRaza() == 3) {
                            SoldadosJ1.add(FabricaSoldados.getEspecialista(TipoSoldado.ESR3));

                        }

                        System.out.println("Soldado creado");
                        menuAtaque();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();

            }

        }
        return opc1;
    }

    public int menuAtaque() {
        while (opc1 != 4) {
            System.out.println("Soldado Creado");
            System.out.println("1.Atacar Jugador");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                opc1 = sn.nextInt();

                switch (opc1) {
                    case 1:
                        
                        SoldadosJ1.set(setAtaque, element);

                        J2.setAtaque(E1.atacar());
                        System.out.println("Soldado creado");

                        while (opc1 != 4) {
                            System.out.println("1.Atacar");
                            opc1 = sn.nextInt();
                        }

                    case 2:
                        while (opc1 != 4) {
                            System.out.println("Has seleccionado la opcion 2");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();

            }

        }
        return 0;
    }
}
