/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Vehiculos.VehiculosTipo1.VT1R1;
import Vehiculos.VehiculosTipo1.VT1R2;
import Vehiculos.VehiculosTipo1.VT1R3;

/**
 *
 * @author alex
 */
public class FabricaVehiculosTipo1 {
   
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
    
    
    public static Vehiculo getVehiculo(TipoVehiculo type) {
        switch (type) {
            case VT1R1:
                return new VT1R1();
            case VT1R2:
                return new VT1R2();
            case VT1R3:
                return new VT1R3();
        }
        return null;
}
    
   
}