/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;


/**
 *
 * @author Lemmon
 */
public class CursoService {
        Scanner leer = new Scanner(System.in);
    public void cargarAlumnos(Curso curso){
    
    String[]alumnos = new String[5];
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno N°: " + (i+1));
            alumnos[i]= leer.next();
        }
    curso.setAlumnos(alumnos);
    }
     public Curso crearCurso(){
        Curso curso1 = new Curso();
         System.out.println("Ingrese el nombre del curso");
         curso1.setNombreCurso(leer.next());
         System.out.println("Ingrese cantidad de horas por día");
         curso1.setCantidadHorasPorDia(leer.nextDouble());
         System.out.println("Ingrese cantidad de días por semana");
         curso1.setCantidadDiasPorSemana(leer.nextDouble());
         System.out.println("Ingrese si es turno mañana o tarde");
         curso1.setTurno(leer.next());
         System.out.println("Ingrese el precio de la hora");
         curso1.setPrecioPorHora(leer.nextDouble());
         
        cargarAlumnos(curso1);
      return curso1;
         }
     public void calcularGananciaSemanal(Curso curso){
         double ganancia = curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*5*curso.getCantidadDiasPorSemana();
         System.out.println("la ganancia es: "+ganancia);
     }
    
    
    
}
