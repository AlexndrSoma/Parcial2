/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author alex
 */
public class FabricaRecursos3 {

    int LP = 5000;
    int recurso3;
    int ataque;

    public void setLP(int LP) {

        this.LP = LP;

    }

    public int atacarLP() {

        LP = LP - getAtaque();

        return LP;

    }

    public int getLP() {

        return LP;
    }



    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }


        public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

}
