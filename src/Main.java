
import Jugador.Jugador;
import Milicia.Escuadron;
import Milicia.FabricaSoldadosEscuadron;
import Milicia.RazaSoldadoEscuadron;

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
        Escuadron E1 = FabricaSoldadosEscuadron.getEscuadron(RazaSoldadoEscuadron.R1);
        
    
        
        Jugador J1= new Jugador();
        
        J1.setAtaque(E1.atacar());
        
        System.out.println("f"+J1.getLP());
        
        
        
       
}
       
   }

