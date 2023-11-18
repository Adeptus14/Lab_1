/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1y6.entidad;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Matriz {
    
    
   public ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
    
    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }
    
    
    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    
}
}