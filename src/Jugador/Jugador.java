/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;




/**
 *
 * @author alex
 */
public class Jugador {
    
    public int LP=5000;
    int ataque;

    
   
  

    public void setLP(int LP) {
        this.LP = LP;
        
    }
    
    

    public int getLP() {
        
        LP=LP-ataque;
        
        return LP;
    }

    public void setAtaque(int ataque) {
        this.ataque=ataque;
    }

    public int getAtaque() {
        return ataque;
    }
    
    
    
    
    
    
   
}
