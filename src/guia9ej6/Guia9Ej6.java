/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author Lemmon
 */
public class Guia9Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoService curso = new CursoService();
        Curso objeto = curso.crearCurso();
        curso.calcularGananciaSemanal(objeto);
        
    }
    
}
