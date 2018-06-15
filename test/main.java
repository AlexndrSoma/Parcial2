
import Milicia.Soldado;
import java.util.ArrayList;
import java.util.Iterator;
import Milicia.FabricaSoldados;
import Milicia.Soldado;
import Milicia.SoldadoEscuadron.SER1;
import Milicia.TipoSoldado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alex
 */
public class main {

    

    public static void main(String[] args) {
        
        ArrayList<Soldado> SoldadosJ1 = new ArrayList<>();

        Iterator<Soldado> IteradorSoldados = SoldadosJ1.iterator();

        IteradorSoldados = SoldadosJ1.iterator();
        while (IteradorSoldados.hasNext()) {
            Soldado elemento = IteradorSoldados.next();
            if (SER1.getLP().equals(0)) {
                IteradorSoldados.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
            }
        }

    }

}
