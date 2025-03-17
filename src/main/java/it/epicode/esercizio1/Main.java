package it.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static int[] creaArrayCasuale() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;

    }

    public static void stampaArray(int[] stampa) {
        for (int i = 0; i < stampa.length; i++) {
            System.out.print(stampa[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creare un array di 5 elementi con valori casuali tra 0 e 10
        int[] array = creaArrayCasuale();
        // Stampare l'array
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
    boolean richiedi = true;

    while(richiedi){

        System.out.println("-- Inserisci la posizione tra 1 e 5, 0 per uscire");
        try {
            int posizione = scanner.nextInt();

            if(posizione==0){
                richiedi = false;
                break;
            }
            System.out.println("-- Inserisci il numero compreo tra 1 e 10");
            int numero = scanner.nextInt();

            if(numero > 10 ){
                logger.error("Il numero non può essere maggiore di 10");
                scanner.nextLine();
                continue;
            }
            array[posizione-1] = numero;
            stampaArray(array);

        } catch (Exception e) {
            logger.error("Errore: il numero inserito non è corretto");
            scanner.nextLine();
        }


    }






    }
}
