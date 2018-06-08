/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Milicia.SoldadoEscuadron.SER1;
import Milicia.SoldadoEscuadron.SER2;
import Milicia.SoldadoEscuadron.SER3;
import Milicia.SoldadoEspecialista.SESR1;
import Milicia.SoldadoEspecialista.SESR2;
import Milicia.SoldadoEspecialista.SESR3;

/**
 *
 * @author alex
 */
public class FabricaSoldados {
   
    int LP=5000;
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
    
    
    public static Soldado getEscuadron(TipoSoldado type) {
        switch (type) {
            case ER1:
                
                return new SER1();
            case ER2:
                return new SER2();
            case ER3:
                return new SER3();
        }
        return null;
}
    
        public static Soldado getEspecialista(TipoSoldado type) {
        switch (type) {
            case ESR1:
                return new SESR1();
            case ESR2:
                return new SESR2();
            case ESR3:
                return new SESR3();
        }
        return null;
        }
        
}

        
    
    
    

