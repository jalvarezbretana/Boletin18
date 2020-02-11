/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_01;

/**
 *
 * @author jalvarezbretana
 */
public class Metodos {

    int[] numeros = new int[6];

    public void Aleatorio() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * (50 - 1) + 1));
            System.out.println(numeros[i]);
        }

    }

    public void AleatorioReverso() {
        System.out.println("\n");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
