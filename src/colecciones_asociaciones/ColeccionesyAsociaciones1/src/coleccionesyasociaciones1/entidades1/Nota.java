/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesyasociaciones1.entidades1;

/**
 *
 * @author Administrador
 */
public class Nota {
    
    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public String getCatedra() {
        return this.catedra;
    }

    public double getNotaExamen() {
        return this.notaExamen;
    }
    
    
}
