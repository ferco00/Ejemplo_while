/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplowhile;

import java.util.Scanner;

public class Ejemplo2 {

    public void Formato2() {
        int fin, contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el inicio del contador: ");
        contador = entrada.nextInt();
        System.out.print("Introduce el final del contador: ");
        fin = entrada.nextInt();
        while (contador <= fin) {
            System.out.println("Valor actual de la iteracion " + contador);
            contador++;
        }

    }

    public static void main(String[] args) {
        Ejemplo2 formato2 = new Ejemplo2();
        formato2.Formato2();
    }

}
