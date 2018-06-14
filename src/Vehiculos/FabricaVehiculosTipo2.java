/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;


import Vehiculos.VehiculosTipo2.VT2R2;
import Vehiculos.VehiculosTipo2.VT2R3;
import Vehiculos.VehiculosTipo2.VT2R1;

/**
 *
 * @author alex
 */
public class FabricaVehiculosTipo2 {
   
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
            case VT2R1:
                return new VT2R1();
            case VT2R2:
                return new VT2R2();
            case VT2R3:
                return new VT2R3();
        }
        return null;
}
    
   
}