import java.util.Scanner;

/*Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi,
 restituisca il numero totale di */
//secondi. NB un giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci i giorni");
        int giorni= input.nextInt();
        System.out.println("Inserisci le ore");
        int ore= input.nextInt();
        System.out.println("Inserisci i minuti");
        int minuti= input.nextInt();
        System.out.println("Inserisci i secondi");
        int secondi= input.nextInt();
        int seconditot=(giorni*86400) + (ore*3600) + (minuti*60);
        System.out.println("I secondi totali sono"+ seconditot);

    }
}