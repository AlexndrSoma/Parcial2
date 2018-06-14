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
    int recurso1=1000;
    int generarRecurso1 = 1000;
    int recurso2=500;
    int generarRecurso2 = 500;
    int recurso3=300;
    int generarRecurso3 = 300;
    boolean fabricaSoldados=false;
    boolean fabricaVehiculosTipo1=false;
    boolean fabricaVehiculosTipo2=false;
    boolean fabricaRecursosTipo1=false;
    boolean fabricaRecursosTipo2=false;
    boolean fabricaRecursosTipo3=false;
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

    public int getGenerarRecurso1() {
        return generarRecurso1;
    }

    public void setGenerarRecurso1(int generarRecurso1) {
        this.generarRecurso1 = generarRecurso1;
    }

    public int getGenerarRecurso2() {
        return generarRecurso2;
    }

    public void setGenerarRecurso2(int generarRecurso2) {
        this.generarRecurso2 = generarRecurso2;
    }

    public int getGenerarRecurso3() {
        return generarRecurso3;
    }

    public void setGenerarRecurso3(int generarRecurso3) {
        this.generarRecurso3 = generarRecurso3;
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

    public boolean isFabricaRecursosTipo1() {
        return fabricaRecursosTipo1;
    }

    public void setFabricaRecursosTipo1(boolean fabricaRecursosTipo1) {
        this.fabricaRecursosTipo1 = fabricaRecursosTipo1;
    }

    public boolean isFabricaRecursosTipo2() {
        return fabricaRecursosTipo2;
    }

    public void setFabricaRecursosTipo2(boolean fabricaRecursosTipo2) {
        this.fabricaRecursosTipo2 = fabricaRecursosTipo2;
    }

    public boolean isFabricaRecursosTipo3() {
        return fabricaRecursosTipo3;
    }

    public void setFabricaRecursosTipo3(boolean fabricaRecursosTipo3) {
        this.fabricaRecursosTipo3 = fabricaRecursosTipo3;
    }


    
    

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

}
