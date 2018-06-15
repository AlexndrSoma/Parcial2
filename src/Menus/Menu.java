/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Jugador.Jugador;
import Milicia.FabricaSoldados;
import Milicia.Soldado;
import Milicia.TipoSoldado;
import static Milicia.TipoSoldado.ER1;
import Recursos.FabricaRecursos1;
import Recursos.FabricaRecursos2;
import Recursos.FabricaRecursos3;
import Vehiculos.Vehiculo;
import static java.time.Clock.system;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class Menu {

    int fase;
    int opc1;
    int raza;
    int ataque;
    static Scanner sn = new Scanner(System.in);
    boolean salir = false;

    Jugador J1 = new Jugador();
    Jugador J2 = new Jugador();

    ArrayList<Soldado> SoldadosJ1 = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ1Vivos = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ1Muertos = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ2 = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ2Vivos = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ2Muertos = new ArrayList<>();
    ArrayList<Vehiculo> VehiculosJ1 = new ArrayList<>();
    ArrayList<Vehiculo> VehiculosJ2 = new ArrayList<>();

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

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
            System.out.println("");
            System.out.println(".:.:.:.:.:.: AlexQuintana's World :.:.:.:.:.:.");
            System.out.println("");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Tutorial");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

            try {

                System.out.println("Opcion:");
                opc1 = sn.nextInt();

                switch (opc1) {
                    case 1:

                        J1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del primer jugador:"));
                        J2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador:"));
                        menuRazaJugador1();
                        break;

                    case 3:

                        System.exit(0);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        return 0;
    }

    public int menuRazaJugador1() {

        while (opc1 != 4) {

            try {
                System.out.println("");
                System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                System.out.println("");
                System.out.println(J1.getNombre() + ", elige tu raza: ");
                System.out.println("");
                System.out.println("1. Canibales");
                System.out.println("2. Asesinos");
                System.out.println("3. Bestias");
                System.out.println("4. Salir");
                System.out.println("");
                System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

                System.out.println("Opcion:");
                opc1 = sn.nextInt();
                switch (opc1) {
                    case 1:
                        J1.setRaza(1);
                        menuRazaJugador2();
                        break;

                    case 2:
                        J1.setRaza(2);
                        menuRazaJugador2();

                        break;

                    case 3:
                        J1.setRaza(3);
                        menuRazaJugador2();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

        return 0;
    }

    public int menuRazaJugador2() {

        try {
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
            System.out.println(J2.getNombre() + ", elige tu raza:");
            System.out.println("");
            System.out.println("1. Canibales");
            System.out.println("2. Asesinos");
            System.out.println("3. Bestias");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

            System.out.println("Opcion:");
            opc1 = sn.nextInt();
            switch (opc1) {
                case 1:
                    J2.setRaza(1);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;

                case 2:
                    J2.setRaza(2);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;

                case 3:
                    J2.setRaza(3);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

        return 0;
    }

    public int menuJuegoJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("TURNO DE: " + J1.getNombre() + ", FASE: " + J1.getFase());
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("1.Crear Edificios");
        System.out.println("2. Crear Milicia");
        System.out.println("3. Atacar Edificio");
        System.out.println("4. Atacar Milicia");
        System.out.println("5. Mejorar Centro de Mando");
        System.out.println("6. Terminar turno");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion:");
            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:

                    menuCreacionEdificiosJ1();
                    break;

                case 2:

                    menuCreacionSoldadoJ1();
                    break;

                case 3:
                    if (SoldadosJ1.size() == 0 || J2.getFase() == 1) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("NO DISPONES DE SOLDADOS AUN");
                        System.out.println("O ESTE ES EL PRIMER TURNO Y NO SE PUEDE ATACAR");
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        menuJuegoJ1();

                    } else {
                        menuAtaqueJ1();
                    }

                    break;

                case 4:
                    if (SoldadosJ1.size() == 0 || J2.getFase() == 1) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("NO DISPONES DE SOLDADOS AUN");
                        System.out.println("O ESTE ES EL PRIMER TURNO Y NO SE PUEDE ATACAR");
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        menuJuegoJ1();

                    } else {
                        menuAtaqueJ1();
                    }

                    break;

                case 5:

                    menuMejoraCentrodeMandoJ1();
                    break;

                case 6:
                    J1.setFase(J1.getFase() + 1);

                    if (J1.getRecurso1() >= 10000) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("CAPACIDAD MAXIMA ALCANZADA");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println(".");
                        J1.setRecurso1(10000);
                        menuJuegoJ1();
                    }

                    if (J1.isFabricaRecursosTipo1() == true) {
                        J1.setRecurso1(J1.getRecurso1() + J1.getGenerarRecurso1());
                    }

                    if (J1.isFabricaRecursosTipo2() == true) {
                        J1.setRecurso2(J1.getRecurso2() + J1.getGenerarRecurso2());
                    }

                    if (J1.isFabricaRecursosTipo3() == true) {
                        J1.setRecurso3(J1.getRecurso3() + J1.getGenerarRecurso3());
                    }
                    menuJuegoJ2();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        } catch (InputMismatchException e) {
            System.out.println("Opcion invalida");
            sn.next();

        }

        return 0;
    }

    public int menuJuegoJ2() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("TURNO DE: " + J2.getNombre() + ", FASE: " + J2.getFase());
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("");
        System.out.println("1.Crear Edificios");
        System.out.println("2. Crear Milicia");
        System.out.println("3. Atacar Edificio");
        System.out.println("4. Atacar Milicia");
        System.out.println("5. Mejorar Centro de Mando");
        System.out.println("6. Terminar turno");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion:");
            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:

                    menuCreacionEdificiosJ2();
                    break;

                case 2:

                    menuCreacionSoldadoJ2();
                    break;

                case 3:

                    if (SoldadosJ2.size() == 0 || J1.getFase() == 1) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("NO DISPONES DE SOLDADOS AUN");
                        System.out.println("O ESTE ES EL PRIMER TURNO Y NO SE PUEDE ATACAR");
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        menuJuegoJ2();
                        break;

                    } else {
                        menuAtaqueJ2();
                    }

                case 4:
                    if (SoldadosJ2.size() == 0 || J1.getFase() == 1) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("NO DISPONES DE SOLDADOS AUN");
                        System.out.println("O ESTE ES EL PRIMER TURNO Y NO SE PUEDE ATACAR");
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        menuJuegoJ2();
                        break;

                    } else {
                        menuAtaqueJ2();
                    }

                case 5:

                    menuMejoraCentrodeMandoJ1();
                    break;

                case 6:
                    J2.setFase(J2.getFase() + 1);

                    if (J2.getRecurso1() >= 10000) {
                        System.out.println("");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println("CAPACIDAD MAXIMA ALCANZADA");
                        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
                        System.out.println(".");
                        J2.setRecurso1(10000);
                        menuJuegoJ2();
                    }

                    if (J2.isFabricaRecursosTipo1() == true) {
                        J2.setRecurso1(J2.getRecurso1() + J2.getGenerarRecurso1());
                    }

                    if (J2.isFabricaRecursosTipo2() == true) {
                        J2.setRecurso2(J2.getRecurso2() + J2.getGenerarRecurso2());
                    }

                    if (J2.isFabricaRecursosTipo3() == true) {
                        J2.setRecurso3(J2.getRecurso3() + J2.getGenerarRecurso3());
                    }
                    menuJuegoJ1();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuMejoraCentrodeMandoJ1() {

        try {
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
            System.out.println("");
            System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
            System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
            System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
            System.out.println("");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
            System.out.println("1. Mejora Nivel 1. Costo: ");
            System.out.println("Petroleo: 11000 ");
            System.out.println("Metales: 5500  ");
            System.out.println("Uranio: 3300");
            System.out.println("2. Mejora Nivel 2");
            System.out.println("3. Mejora Nivel 3");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

            System.out.println("Opcion:");
            opc1 = sn.nextInt();
            switch (opc1) {
                case 1:
                    if (J1.getRecurso1() >= 11000 || J1.getRecurso2() >= 5500 || J1.getRecurso3() >= 3300) {

                        J1.setMejoraRecursosN1(true);
                        System.out.println("MEJORA DE NIVEL 1");

                        menuMejoraCentrodeMandoJ1();
                    } else {
                        System.out.println("Recursos insuficientes");
                        menuMejoraCentrodeMandoJ1();
                    }

                case 2:
                    if (J1.getRecurso1() >= 11000 || J1.getRecurso2() >= 5500 || J1.getRecurso3() >= 3300) {

                        J1.setMejoraRecursosN1(true);
                        System.out.println("MEJORA DE NIVEL 2");

                        menuMejoraCentrodeMandoJ1();
                    } else {
                        System.out.println("Recursos insuficientes");
                        menuMejoraCentrodeMandoJ1();
                    }

                case 3:
                    if (J1.getRecurso1() >= 11000 || J1.getRecurso2() >= 5500 || J1.getRecurso3() >= 3300) {

                        J1.setMejoraRecursosN1(true);
                        System.out.println("MEJORA DE NIVEL 3");

                        menuMejoraCentrodeMandoJ1();
                    } else {
                        System.out.println("Recursos insuficientes");
                        menuMejoraCentrodeMandoJ1();
                    }
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

        return 0;
    }

    public int menuMejoraCentrodeMandoJ2() {

        try {
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
            System.out.println("");
            System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
            System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
            System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
            System.out.println("");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
            System.out.println("1. Mejora Nivel 1. Costo: ");
            System.out.println("Petroleo: 11000 ");
            System.out.println("Metales: 5500  ");
            System.out.println("Uranio: 3300");
            System.out.println("2. Mejora Nivel 2");
            System.out.println("3. Mejora Nivel 3");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

            System.out.println("Opcion:");
            opc1 = sn.nextInt();
            switch (opc1) {
                case 1:
                    J2.setRaza(1);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;

                case 2:
                    J2.setRaza(2);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;

                case 3:
                    J2.setRaza(3);
                    System.out.println(".:.:.:.:.:.:.:.:.:||INICIA EL JUEGO||:.:.:.:.:.:.:.:.:.");
                    System.out.println("");
                    menuJuegoJ1();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

        return 0;
    }

    public int menuCreacionEdificiosJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("CREAR EDIFICACIONES");
        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("1. Crear Fabrica de Recursos");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("2. Crear Fabrica de Soldados. Costo:");
        System.out.println("Petroleo: 2000");
        System.out.println("Metales: 1000");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("3. Crear Fabrica de Vehiculos Tipo1. Costo: ");
        System.out.println("Metales: 1000");
        System.out.println("Uranio: 600");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("4. Crear Fabrica de Vehiculos Tipo2");
        System.out.println("Petroleo: 4000");
        System.out.println("Metales: 2000");
        System.out.println("Uranio: 600");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("5. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {

            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:
                    menuFabricaRecursosJ1();
                    break;

                case 2:

                    System.out.println("Creando Fabrica de Soldados");
                    if (J1.getRecurso1() >= 2000 && J1.getRecurso2() >= 1000) {
                        J1.setFabricaSoldados(true);
                        System.out.println("Fabrica de Soldados creada");
                        J1.setRecurso1(J1.getRecurso1() - 2000);
                        J1.setRecurso2(J1.getRecurso2() - 1000);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
                        menuCreacionEdificiosJ1();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ1();

                        break;

                    }

                case 3:

                    System.out.println("Creando Fabrica de Vehiculos Tipo1");
                    if (J1.getRecurso2() >= 1000 && J1.getRecurso3() >= 600) {
                        J1.setFabricaVehiculosTipo1(true);
                        System.out.println("Fabrica de Vehiculos Tipo 1 creada");
                        J1.setRecurso2(J1.getRecurso2() - 1000);
                        J1.setRecurso3(J1.getRecurso3() - 600);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
                        menuCreacionEdificiosJ1();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ1();

                        break;

                    }

                case 4:
                    System.out.println("Creando Fabrica de Vehiculos Tipo2");
                    if (J1.getRecurso1() >= 4000 && J1.getRecurso2() >= 2000 && J1.getRecurso3() >= 600) {
                        J1.setFabricaVehiculosTipo2(true);
                        System.out.println("Fabrica de Vehiculos Tipo 2 creada");
                        J1.setRecurso1(J1.getRecurso1() - 4000);
                        J1.setRecurso2(J1.getRecurso2() - 2000);
                        J1.setRecurso3(J1.getRecurso3() - 600);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
                        menuCreacionEdificiosJ1();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ1();

                        break;

                    }

                case 5:
                    menuJuegoJ1();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 5");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuCreacionEdificiosJ2() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("CREAR EDIFICACIONES");
        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("1. Crear Fabrica de Recursos");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("2. Crear Fabrica de Soldados. Costo:");
        System.out.println("Petroleo: 2000");
        System.out.println("Metales: 1000");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("3. Crear Fabrica de Vehiculos Tipo1. Costo: ");
        System.out.println("Metales: 1000");
        System.out.println("Uranio: 600");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("4. Crear Fabrica de Vehiculos Tipo2");
        System.out.println("Petroleo: 4000");
        System.out.println("Metales: 2000");
        System.out.println("Uranio: 600");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("5. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {

            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:
                    menuFabricaRecursosJ2();
                    break;

                case 2:

                    System.out.println("Creando Fabrica de Soldados");
                    if (J2.getRecurso1() >= 2000 && J2.getRecurso2() >= 1000) {
                        J2.setFabricaSoldados(true);
                        System.out.println("Fabrica de Soldados creada");
                        J2.setRecurso1(J2.getRecurso1() - 2000);
                        J2.setRecurso2(J2.getRecurso2() - 1000);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
                        menuCreacionEdificiosJ2();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ2();

                        break;

                    }

                case 3:

                    System.out.println("Creando Fabrica de Vehiculos Tipo1");
                    if (J2.getRecurso2() >= 1000 && J2.getRecurso3() >= 600) {
                        J2.setFabricaVehiculosTipo1(true);
                        System.out.println("Fabrica de Vehiculos Tipo 1 creada");
                        J2.setRecurso2(J2.getRecurso2() - 1000);
                        J2.setRecurso3(J2.getRecurso3() - 600);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
                        menuCreacionEdificiosJ2();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ2();

                        break;

                    }

                case 4:
                    System.out.println("Creando Fabrica de Vehiculos Tipo2");
                    if (J2.getRecurso1() >= 4000 && J2.getRecurso2() >= 2000 && J2.getRecurso3() >= 600) {
                        J2.setFabricaVehiculosTipo2(true);
                        System.out.println("Fabrica de Vehiculos Tipo 2 creada");
                        J2.setRecurso1(J2.getRecurso1() - 4000);
                        J2.setRecurso2(J2.getRecurso2() - 2000);
                        J2.setRecurso3(J2.getRecurso3() - 600);

                        System.out.println("Recursos actuales:");
                        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
                        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
                        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
                        menuCreacionEdificiosJ2();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuCreacionEdificiosJ2();

                        break;

                    }

                case 5:
                    menuJuegoJ2();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuFabricaRecursosJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("ALMACENES DE RECURSOS");
        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("1.Crear almacen de petroleo. Costo: ");
        System.out.println("Petroleo: 500");
        System.out.println("Metales: 250");
        System.out.println("2. Crear almacen para metales de construccion. Costo: ");
        System.out.println("Metales: 250");
        System.out.println("Uranio: 300");
        System.out.println("3. Crear planta nuclear");
        System.out.println("Petroleo: 1000");
        System.out.println("Metales: 500");
        System.out.println("Uranio: 300");
        System.out.println("4. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion:");
            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:

                    System.out.println("Creando Almacen de Petroleo");
                    System.out.println("...");
                    System.out.println("...");
                    if (J1.getRecurso1() >= 500 && J1.getRecurso2() >= 250) {
                        J1.setFabricaRecursosTipo1(true);
                        System.out.println("ALMACEN DE PETROLEO CREADO.");
                        J1.setRecurso1(J1.getRecurso1() - 500);
                        J1.setRecurso2(J1.getRecurso2() - 250);
                        menuFabricaRecursosJ1();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ1();
                        break;

                    }

                case 2:
                    System.out.println("Creando Almacen para Metales de construccion");
                    if (J1.getRecurso2() >= 250 && J1.getRecurso3() >= 300) {
                        J1.setFabricaRecursosTipo2(true);
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("ALMACEN PARA METALES DE CONSTRUCCION CREADO");
                        J1.setRecurso2(J1.getRecurso2() - 250);
                        J1.setRecurso3(J1.getRecurso3() - 300);
                        menuFabricaRecursosJ1();
                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ1();
                        break;

                    }
                case 3:
                    System.out.println("Creando Planta Nuclear");
                    if (J1.getRecurso1() >= 1000 && J1.getRecurso2() >= 500 && J1.getRecurso3() >= 300) {
                        J1.setFabricaRecursosTipo3(true);
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("PLANTA NUCLEAR CREADA");
                        J1.setRecurso1(J1.getRecurso1() - 1000);
                        J1.setRecurso2(J1.getRecurso2() - 500);
                        J1.setRecurso3(J1.getRecurso3() - 300);
                        menuFabricaRecursosJ1();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ1();
                        break;

                    }

                case 4:
                    menuJuegoJ1();

                default:
                    System.out.println("Solo números entre 1 y 4");

            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

        return 0;
    }

    public int menuFabricaRecursosJ2() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("ALMACENES DE RECURSOS");
        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("1.Crear almacen de petroleo");
        System.out.println("2. Crear almacen para metales de construccion");
        System.out.println("3. Crear planta nuclear");
        System.out.println("4. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion: ");
            opc1 = sn.nextInt();

            switch (opc1) {

                case 1:

                    System.out.println("Creando Almacen de Petroleo");
                    if (J2.getRecurso1() >= 500 && J2.getRecurso2() >= 250) {
                        J2.setFabricaRecursosTipo1(true);
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("ALMACEN DE PETROLEO CREADO");
                        J2.setRecurso1(J2.getRecurso1() - 500);
                        J2.setRecurso2(J2.getRecurso2() - 250);
                        menuFabricaRecursosJ2();

                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ2();
                        break;

                    }

                case 2:
                    System.out.println("Creando Almacen para Metales de construccion");
                    if (J2.getRecurso2() >= 250 && J2.getRecurso3() >= 300) {
                        J2.setFabricaRecursosTipo2(true);
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("ALMACEN PARA METALES CREADO");
                        J2.setRecurso2(J2.getRecurso2() - 250);
                        J2.setRecurso3(J2.getRecurso3() - 300);
                        menuFabricaRecursosJ2();
                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ2();
                        break;

                    }
                case 3:
                    System.out.println("Creando Planta Nuclear");
                    if (J2.getRecurso1() >= 1000 && J2.getRecurso2() >= 500 && J2.getRecurso3() >= 300) {
                        J2.setFabricaRecursosTipo3(true);
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("PLANTA NUCLEAR CREADA");
                        J2.setRecurso1(J2.getRecurso1() - 1000);
                        J2.setRecurso2(J2.getRecurso2() - 500);
                        J2.setRecurso3(J2.getRecurso3() - 300);
                        menuFabricaRecursosJ2();
                        break;
                    } else {
                        System.out.println("No dispones de recursos suficientes");
                        menuFabricaRecursosJ2();
                        break;

                    }

                case 4:
                    menuJuegoJ2();

                default:
                    System.out.println("Solo números entre 1 y 4");

            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();
        }

        return 0;
    }

    public int menuCreacionSoldadoJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("CREAR SOLDADOS");
        System.out.println("Recurso 1 de " + ":" + J1.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J1.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J1.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("1.Crear Escuadron");
        System.out.println("2. Crear Soldado Especialista");
        System.out.println("3. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion:");
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
                    menuCreacionSoldadoJ1();

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
                    menuCreacionSoldadoJ1();

                    break;

                case 3:
                    menuJuegoJ1();
                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuCreacionSoldadoJ2() {
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("CREAR SOLDADOS");
        System.out.println("Recurso 1 de " + ":" + J2.getRecurso1());
        System.out.println("Recurso 2 de " + ":" + J2.getRecurso2());
        System.out.println("Recurso 3 de " + ":" + J2.getRecurso3());
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("Jugadores Creado");
        System.out.println("1.Crear Escuadron");
        System.out.println("2. Crear Soldado Especialista");
        System.out.println("3. Regresar");
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");

        try {
            System.out.println("Opcion:");
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
                    menuCreacionSoldadoJ2();
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
                    menuCreacionSoldadoJ2();
                    break;
                case 3:
                    menuJuegoJ2();

                    break;

                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuAtaqueJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("MENU DE ATAQUE");
        System.out.println("Fase #" + J1.getFase() + "del juego");
        System.out.println("1.Atacar con Milicia");
        System.out.println("2.Atacar a edificios");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");

        try {
            System.out.println("Opcion: ");
            opc1 = sn.nextInt();

            switch (opc1) {
                case 1:
                    if (SoldadosJ2.isEmpty()) {
                        System.out.println("No hay soldados para atacar.");
                        menuAtaqueJ1();
                        break;
                    } else {

                        menuAtaqueEdificiosJ1();

                    }

                case 2:

                    if (SoldadosJ2.isEmpty()) {
                        System.out.println("No hay soldados para atacar.");
                        menuAtaqueJ1();
                        break;
                    } else {

                        menuAtaqueMiliciaJ1();

                    }
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;

                    System.exit(0);
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuAtaqueMiliciaJ1() {

        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("MENU DE ATAQUE");
        System.out.println("Fase #" + J1.getFase() + "del juego");
        System.out.println("1.Atacar a Milicia enemiga");
        System.out.println("2.Atacar edificios enemigos");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");

        try {
            System.out.println("Opcion: ");
            opc1 = sn.nextInt();

            switch (opc1) {
                case 1:
                    System.out.println(J1.getNombre() + ", tienes " + SoldadosJ1.size() + " soldados bajo tu mando.");

                    Iterator<Soldado> IteradorSoldadosJ1 = SoldadosJ1.iterator();
                    Iterator<Soldado> IteradorSoldadosJ2 = SoldadosJ2.iterator();
                    Iterator<Soldado> IteradorSoldadosVivosJ2 = SoldadosJ2.iterator();

                    IteradorSoldadosJ1 = SoldadosJ1.iterator();
                    while (IteradorSoldadosJ1.hasNext()) {
                        Soldado elemento1 = IteradorSoldadosJ1.next();
                        if (elemento1.getLP() == 0) {
                            SoldadosJ1Muertos.add(elemento1);
                        }

                        if (elemento1.getLP() > 0) {
                            SoldadosJ1Vivos.add(elemento1);
                        }
                    }

                    IteradorSoldadosJ2 = SoldadosJ2.iterator();
                    while (IteradorSoldadosJ2.hasNext()) {
                        Soldado elemento2 = IteradorSoldadosJ2.next();

                        if (elemento2.getLP() > 0) {
                            SoldadosJ2Vivos.add(elemento2);
                        }

                        System.out.println("Tienes " + SoldadosJ1Vivos.size() + "soldados disponibles");
                        System.out.println("Tienes " + SoldadosJ1Muertos.size() + "soldados caidos");

                    }
                    IteradorSoldadosVivosJ2 = SoldadosJ2Vivos.iterator();
                    while (IteradorSoldadosJ2.hasNext()) {
                        Soldado elemento3 = IteradorSoldadosJ2.next();

                        if (elemento3.getLP() > 0) {
                            System.out.println("SoldadosJ1Vivos.get(LP)");
                        }

                    }
                    break;

                case 2:

                    System.out.println("Has seleccionado la opcion 2");

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;

                    System.exit(0);
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuAtaqueEdificiosJ1() {
        System.out.println("");
        System.out.println(".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:");
        System.out.println("MENU DE ATAQUE");
        System.out.println("Fase #" + J1.getFase() + "del juego");
        System.out.println("1.Atacar Almacen de Petroleo");
        System.out.println("2.Atacar edificios enemigos");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");

        try {
            System.out.println("Opcion: ");
            opc1 = sn.nextInt();

            switch (opc1) {
                case 1:
                    System.out.println(J1.getNombre() + ", tienes " + SoldadosJ1.size() + " soldados bajo tu mando.");

                    Iterator<Soldado> IteradorSoldadosJ1 = SoldadosJ1.iterator();
                    Iterator<Soldado> IteradorSoldadosJ2 = SoldadosJ2.iterator();
                    Iterator<Soldado> IteradorSoldadosVivosJ2 = SoldadosJ2.iterator();

                    IteradorSoldadosJ1 = SoldadosJ1.iterator();
                    while (IteradorSoldadosJ1.hasNext()) {
                        Soldado elemento1 = IteradorSoldadosJ1.next();
                        if (elemento1.getLP() == 0) {
                            SoldadosJ1Muertos.add(elemento1);
                        }

                        if (elemento1.getLP() > 0) {
                            SoldadosJ1Vivos.add(elemento1);
                        }
                    }

                    IteradorSoldadosJ2 = SoldadosJ2.iterator();
                    while (IteradorSoldadosJ2.hasNext()) {
                        Soldado elemento2 = IteradorSoldadosJ2.next();

                        if (elemento2.getLP() > 0) {
                            SoldadosJ2Vivos.add(elemento2);
                        }

                        System.out.println("Tienes " + SoldadosJ1Vivos.size() + "soldados disponibles");
                        System.out.println("Tienes " + SoldadosJ1Muertos.size() + "soldados caidos");

                    }
                    IteradorSoldadosVivosJ2 = SoldadosJ2Vivos.iterator();
                    while (IteradorSoldadosJ2.hasNext()) {
                        Soldado elemento3 = IteradorSoldadosJ2.next();

                        if (elemento3.getLP() > 0) {
                            System.out.println("SoldadosJ1Vivos.get(LP)");
                        }

                    }
                    break;

                case 2:

                    System.out.println("Has seleccionado la opcion 2");

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;

                    System.exit(0);
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

        }

        return 0;
    }

    public int menuAtaqueJ2() {

        for (int i = 1; i != 0; i++) {

            System.out.println(J2LP);
            J2LP = J2.getLP();

            while (opc1 != 4 || salir != false) {

                J1LP = J1.getLP();
                J2LP = J2.getLP();

                System.out.println("Fase #" + fase + "del juego");
                System.out.println("1.Atacar Jugador");
                System.out.println("2. Opcion 2");
                System.out.println("3. Opcion 3");
                System.out.println("4. Salir");

                try {

                    opc1 = sn.nextInt();

                    switch (opc1) {
                        case 1:
                            while (opc1 != 4) {
                                SoldadosJ1.get(0);

                                SoldadosJ1.get(0).atacar();

                                SoldadosJ1.get(i)

                                J2.setAtaque(SoldadosJ1.get(0).atacar()); //*Setea ataque//

                                J2.atacarLP();

                                System.out.println("LP" + J2.getLP());

                                J2LP = J2.getLP();

                                System.out.println("VARIABLE J2LP" + J2LP);

                                System.out.println("Soldado creado");

                                fase = fase + 1;

                                if (J1.getLP() <= 0 || J2.getLP() <= 0) {
                                    finJuego();

                                }
                                break;

                            }
                            break;

                        case 2:

                            System.out.println("Has seleccionado la opcion 2");

                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            break;
                        case 4:
                            salir = true;

                            System.exit(0);
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();

                }
            }

        }
        return 0;
    }

    public int finJuego() {

        System.out.println("FIIIN!");
        System.exit(0);
        return 0;
    }

}
