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
import Recursos.FabricaRecursos;
import Recursos.Recurso;
import Recursos.TipoRecurso;
import Vehiculos.Vehiculo;
import static java.time.Clock.system;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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
    int J1LP;
    int J2LP;

    Jugador J1 = new Jugador();
    Jugador J2 = new Jugador();

    ArrayList<Soldado> SoldadosJ1 = new ArrayList<>();
    ArrayList<Soldado> SoldadosJ2 = new ArrayList<>();
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

            System.out.println("1. Iniciar Juego");
            System.out.println("2. Putorial");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opc1 = sn.nextInt();

                switch (opc1) {
                    case 1:

                        J1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del primer jugador:"));
                        J2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador:"));
                        menuRazaJugador1();
                        break;

                    case 4:

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
                System.out.println(J1.getNombre() + ", elige tu raza:");
                System.out.println("1.R1");
                System.out.println("2. R2");
                System.out.println("3. R3");
                System.out.println("4. Salir");

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

        while (opc1 != 4) {

            try {
                System.out.println(J2.getNombre() + "ELige tu raza");
                System.out.println("1.R1");
                System.out.println("2. R2");
                System.out.println("3. R3");
                System.out.println("4. Salir");

                opc1 = sn.nextInt();
                switch (opc1) {
                    case 1:
                        J2.setRaza(1);
                        menuCreacionEdificiosJ1();
                        break;

                    case 2:
                        J2.setRaza(2);
                        menuCreacionEdificiosJ1();
                        break;

                    case 3:
                        J2.setRaza(3);
                        menuCreacionEdificiosJ1();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

        return 0;
    }

    public int menuCreacionEdificiosJ1() {
        while (opc1 != 4) {

            System.out.println("Recurso 1 de " + J1.getNombre() + ":" + J1.getRecurso1());
            System.out.println("Recurso 2 de " + J1.getNombre() + ":" + J1.getRecurso2());
            System.out.println("Recurso 3 de " + J1.getNombre() + ":" + J1.getRecurso3());
            System.out.println("Jugadores Creado");
            System.out.println("1.Crear Fabrica de Escuadron");
            System.out.println("2. Crear Fabrica de Soldados Especialistas");
            System.out.println("3. Crear Fabrica de Vehiculos");
            System.out.println("4. Salir");

            try {

                opc1 = sn.nextInt();

                switch (opc1) {

                    case 1:

                        System.out.println("Creando Fabrica de Escuadron");
                        if(J1.getRecurso1()>=5000||J1.getRecurso3()>=3000){
                        J1.setFabricaSoldados(true);
                            System.out.println("Fabrica de Escuadron creada");
                            break;
                        }else{
                            System.out.println("No dispones de recursos suficientes");
                            
                        }
                        
                       
                        

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
                        menuAtaqueJ1();
                        break;

                    case 3:
                        System.out.println("Creando Vehiculo");

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
                        menuAtaqueJ1();
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

    public int menuCreacionSoldadoJ1() {
        while (opc1 != 4) {
            System.out.println("Jugadores Creado");
            System.out.println("1.Crear Escuadron");
            System.out.println("2. Crear Soldado Especialista");
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
                        menuAtaqueJ1();
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
                        menuAtaqueJ1();
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

    public int menuAtaqueJ1() {

        for (int i = 1; i != 0; i++) {

            System.out.println(J2LP);
            J2LP = J2.getLP();

            while (opc1 != 4 || salir != false) {

                J1LP = J1.getLP();
                J2LP = J2.getLP();

                System.out.println("Soldado Creado");
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
