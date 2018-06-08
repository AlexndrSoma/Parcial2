
import Jugador.Jugador;
import Milicia.FabricaSoldados;
import Milicia.TipoSoldado;
import Milicia.Soldado;

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
       
       
           // crear un SER1
        Soldado E1 = FabricaSoldados.getEscuadron(TipoSoldado.ER2);
        
        Soldado E2 = FabricaSoldados.getEspecialista(TipoSoldado.ESR1);
        
    
        
        Jugador J1= new Jugador();
        
        Jugador J2= new Jugador();
        
        J1.setAtaque(E1.atacar()); //Seteando Ataque de E1.
        
        System.out.println("f"+J1.getLP());
        
        J1.atacarLP();
        
        System.out.println("f"+J1.getLP());
        
        J1.setAtaque(E1.atacar()+E2.atacar());
        
        J1.atacarLP();
        
        System.out.println("f"+J1.getLP());
        
        
        
       
}
       
   }

