/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Milicia.SoldadoEspecialista.SESR1;
import Milicia.SoldadoEspecialista.SESR2;
import Milicia.SoldadoEspecialista.SESR3;



/**
 *
 * @author alex
 */
public class FabricaSoldadosEspecialista {
    
    public static Especialista getEspecialista(RazaSoldadoEspecialista type) {
        switch (type) {
            case R1:
                return new SESR1();
            case R2:
                return new SESR2();
            case R3:
                return new SESR3();
        }
        return null;
}
    
}
