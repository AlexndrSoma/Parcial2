
import Jugador.Jugador;
import Milicia.FabricaSoldados;
import Milicia.TipoSoldado;
import Milicia.Soldado;
import Vehiculos.FabricaVehiculos;
import Vehiculos.TipoVehiculo;
import Vehiculos.Vehiculo;
import java.util.InputMismatchException;
import java.util.Scanner;

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
    
   public static void main(String []args){
       
 

 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc1;
        int opc2;
 
        while (!salir) {
 
            System.out.println("1. Crear Soldado");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opc1 = sn.nextInt();
                opc2=0;
 
                switch (opc1) {
                    case 1:
                        while(opc2!=4){
            System.out.println("Soldado Creado");                
            System.out.println("1.Atacar");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
          
            opc2=sn.nextInt();
                                
            switch(opc2){
                        case 1:
                        Jugador J1= new Jugador();
                        System.out.println("");
                        break;
                        }
                        }
                    case 2:
                        while(opc!=4){
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
            }
             catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    
 

       
       
           // crear un SER1
        Soldado E1 = FabricaSoldados.getEscuadron(TipoSoldado.ER2);
        
        Soldado E2 = FabricaSoldados.getEspecialista(TipoSoldado.ESR1);
        
        Vehiculo V2= FabricaVehiculos.getVehiculo(TipoVehiculo.VR1);
        
    
        
        Jugador J1= new Jugador();
        
        Jugador J2= new Jugador();
        
        J1.setAtaque(E1.atacar()); //Seteando Ataque de E1.
        
        
        
        System.out.println("f"+J1.getLP());
        
        J1.atacarLP();
        
        System.out.println("f"+J1.getLP());
        
        J1.setAtaque(E1.atacar()+E2.atacar());
        
        J1.atacarLP();
        
        System.out.println("f"+J1.getLP());
        
        J1.setAtaque(V2.atacar());
        
         J1.atacarLP();
  
        System.out.println("f"+J1.getLP());        
        
        
       
}
}
}
       
   

