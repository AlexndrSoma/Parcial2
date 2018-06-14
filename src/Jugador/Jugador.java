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
    int recurso1=10000;
    int recurso2=5000;
    int recurso3=3000;
    boolean fabricaSoldados=false;
    boolean fabricaVehiculosTipo1=false;
    boolean fabricaVehiculosTipo2=false;
    int fase=1;

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

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }

    public boolean isFabricaSoldados() {
        return fabricaSoldados;
    }

    public void setFabricaSoldados(boolean fabricaSoldados) {
        this.fabricaSoldados = fabricaSoldados;
    }

    public boolean isFabricaVehiculosTipo1() {
        return fabricaVehiculosTipo1;
    }

    public void setFabricaVehiculosTipo1(boolean fabricaVehiculosTipo1) {
        this.fabricaVehiculosTipo1 = fabricaVehiculosTipo1;
    }

    public boolean isFabricaVehiculosTipo2() {
        return fabricaVehiculosTipo2;
    }

    public void setFabricaVehiculosTipo2(boolean fabricaVehiculosTipo2) {
        this.fabricaVehiculosTipo2 = fabricaVehiculosTipo2;
    }


    
    

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

}
