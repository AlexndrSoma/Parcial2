/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author alex
 */
public class Jugador {

    String nombre;
    int raza;
    int LP = 5000;
    int ataque;
    int recurso1;
    int recurso2;
    int recurso3;
    int fase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {

        if (raza <= 3) {

            this.raza = raza;
        } else {
            System.out.println("Opción incorrecta");

        }

    }

    public void setLP(int LP) {
        this.LP = LP;

    }

    public int getLP() {

        return LP;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public int atacarLP() {

        LP = LP - getAtaque();

        return LP;

    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

}
