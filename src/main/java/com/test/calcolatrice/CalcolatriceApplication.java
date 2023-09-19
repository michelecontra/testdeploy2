package com.test.calcolatrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalcolatriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcolatriceApplication.class, args);
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("*Calcolatore Media*");

            System.out.println("Inserisci il numero totale di elementi di cui vuoi calcolare la media:");
            int i = input.nextInt();

            if (i > 0) {
                float somma = 0;
                int c = 0;

                System.out.println("Inserisci i valori di cui vuoi calcolare la media");

                while (c < i) {
                    System.out.print("Nuova cifra: ");
                    float x = input.nextFloat();
                    somma += x;
                    c++;
                }

                float media = somma / i;
                System.out.println("La media aritmetica dei numeri inseriti vale: " + media);
            } else {
                System.out.println("Numero di elementi non valido.");
            }
        }
    }
}
