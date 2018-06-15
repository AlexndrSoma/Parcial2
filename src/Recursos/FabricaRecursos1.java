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
public class FabricaRecursos1 {

    int LP = 5000;
    int recurso1;
    int ataque;
    int fase;
    boolean activada = false;
    
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

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;

    }



    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }
    
    

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {

        this.fase = fase;

    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }
    
    

}
