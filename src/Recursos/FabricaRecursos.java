/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import Recursos.Recursos.RR1;
import Recursos.Recursos.RR2;
import Recursos.Recursos.RR3;


/**
 *
 * @author alex
 */
public class FabricaRecursos { //CENTRO DE MANDO//
   
    int LP=5000;
    int recurso1;
    int recurso2;
    int recurso3;
    int ataque;

    
    public void setLP(int LP) {
        this.LP = LP;
        
    }
    
    public int atacarLP(){
        
        LP=LP-getAtaque();
        
        return LP;
        
    }

    public int getLP() {
        
        return LP;
    }
    
        public void setAtaque(int ataque) {
        this.ataque=ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    
    
    public static Recurso getRecurso(TipoRecurso type) {
        switch (type) {
            case RR1:
                return new RR1();
            case RR2:
                return new RR2();
            case RR3:
                return new RR3();
        }
        return null;
}
}

    
     
    
    
    

