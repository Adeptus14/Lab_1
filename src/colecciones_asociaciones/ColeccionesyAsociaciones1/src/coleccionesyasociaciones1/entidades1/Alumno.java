/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesyasociaciones1.entidades1;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Alumno {
    
     private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public double calcularPromedio() {
        double sum = 0;
        for (Nota nota : this.notas) {
            sum += nota.getNotaExamen();
        }
        return sum / this.notas.size();
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public long getLegajo() {
        return this.legajo;
    }

    public ArrayList<Nota> getNotas() {
        return this.notas;
    }
    
    
    
}
