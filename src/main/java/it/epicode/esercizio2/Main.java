package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserire il numero di kilometri percorsi"  );
            int km = scanner.nextInt();

            System.out.println("Inserire il numero di litri consumati"  );
            int l = scanner.nextInt();

            if(l==0) {
                logger.error("Il numero di litri non può essere 0");
                return;
            }

            double consumo = km / l;
            logger.info("Il consumo medio e' di " + consumo + " km/l");

        } catch (Exception e) {
                logger.error("Errore: il numero inserito non è corretto: " + e.getMessage());
        }


    }
}
