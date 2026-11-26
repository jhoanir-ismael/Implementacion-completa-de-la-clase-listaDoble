/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Ismael Flores
 */
public class nodoD {
    private int dato;
    private nodoD ant;
    private nodoD sig;

    public nodoD(int dato) {
        this.dato = dato;
        ant = null;
        sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoD getAnt() {
        return ant;
    }

    public void setAnt(nodoD ant) {
        this.ant = ant;
    }

    public nodoD getSig() {
        return sig;
    }

    public void setSig(nodoD sig) {
        this.sig = sig;
    }
}
