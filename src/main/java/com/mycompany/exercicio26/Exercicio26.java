package com.mycompany.exercicio26;

import javax.swing.JOptionPane;

public class Exercicio26 {

    public static void main(String[] args) {

        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i <= numeros.length; i++) {
            JOptionPane.showMessageDialog(null, "Os números em ordem crescente: " + numeros[i]);

        }
    }
}
