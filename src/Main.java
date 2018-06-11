
import Jugador.Jugador;
import Menus.Menu;
import Milicia.FabricaSoldados;
import Milicia.TipoSoldado;
import Milicia.Soldado;
import Milicia.SoldadoEscuadron.SER1;
import Vehiculos.FabricaVehiculos;
import Vehiculos.TipoVehiculo;
import Vehiculos.Vehiculo;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc1;

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
                        Jugador J1 = new Jugador();
                        Jugador J2 = new Jugador();

                        J1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del primer jugador:"));
                        J2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador:"));

                        Menu M1 = new Menu();

                        M1.menuRazaJugador();

                        J1.setRaza(M1.getRaza());
                        
                        
                        
                        
                        

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

                                        J1.setAtaque(E1.atacar());
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

                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }
    }

}
