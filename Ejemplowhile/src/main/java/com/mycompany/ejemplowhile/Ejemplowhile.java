/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplowhile;

/**
 *
 * @author Luis Fernando
 */
public class Ejemplowhile {

    public void Formato() {
        int numero = 0;
        System.out.println("Este programa te pondra los numeros de 1 al 9");
        while (numero < 10) {
            System.out.println("El valor de contador es: " + numero);
            numero++;
        }

        System.out.println("Bucle while finalizado");
    }

    public static void main(String[] args){
        Ejemplowhile formato  = new Ejemplowhile();
        formato.Formato();
    }
}
