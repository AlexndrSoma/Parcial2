/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Milicia.SoldadoEscuadron.SER1;
import Milicia.SoldadoEscuadron.SER2;
import Milicia.SoldadoEscuadron.SER3;

/**
 *
 * @author alex
 */
public class FabricaSoldadosEscuadron {
    
    public static Escuadron getEscuadron(RazaSoldadoEscuadron type) {
        switch (type) {
            case R1:
                return new SER1();
            case R2:
                return new SER2();
            case R3:
                return new SER3();
        }
        return null;
}
    
}
