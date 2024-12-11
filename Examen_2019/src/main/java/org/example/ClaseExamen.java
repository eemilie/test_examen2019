package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
    // metodo que devuelve la decomposición en muneros primos del numero pasado como argumento
    public static List<Integer> primos(int n){
        if (n<=1){
            throw new IllegalArgumentException("Entrada inválida: n debe ser mayor que 1.");
        }

        List<Integer> factoresPrimos = new ArrayList<>();
        // Descomposición en factores primos
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factoresPrimos.add(i);
                n /= i;
            }
        }

        return factoresPrimos;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int n = 13;
        System.out.println("Factores primos de " + n + ": " + primos(n)); // Debería devolver [2, 2, 3]
    }
}
