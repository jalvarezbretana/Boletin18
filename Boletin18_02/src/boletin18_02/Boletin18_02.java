/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_02;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin18_02 {

    public static void main(String[] args) {
        Metodos a = new Metodos();
        a.crearArrayRandom();
//a.amosarArrayNotas();
        a.contarAprobadosSuspensos();
        System.out.println("Nota media: " + a.calcularNotaMedia());
        a.amosarNotaAlta();

        a.crearArrayNomes();
//a.amosarArrayNomes();
        a.amosarArrays();
        /*
a.visualizarNotaAlumno();
a.visualizarAlumnosAprobados();
a.ordencrecenteArrays();
a.amosarArrays();
a.amosarListaAprobados();
         */
        a.hacerMenu();

    }

}
