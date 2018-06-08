/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import static Vehiculos.TipoVehiculo.VR1;
import static Vehiculos.TipoVehiculo.VR2;
import static Vehiculos.TipoVehiculo.VR3;
import Vehiculos.Vehiculos.VR1;
import Vehiculos.Vehiculos.VR2;
import Vehiculos.Vehiculos.VR3;

/**
 *
 * @author alex
 */
public class FabricaVehiculos {
   
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
            case VR1:
                return new VR1();
            case VR2:
                return new VR2();
            case VR3:
                return new VR3();
        }
        return null;
}
    
   
}

        
    
    
    
