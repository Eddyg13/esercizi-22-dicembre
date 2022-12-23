import java.util.Scanner;
/*Scrivere un programma che, dato un certo tempo in secondi (es: 84932) restituisca il
        numero di giorni, ore, minuti e secondi (senza usare condizioni). Si prega di osservare che un
        giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi. */
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Inserisci i secondi");
        int secondi= input.nextInt();

        int giorni= secondi/86400;
        int restog= secondi %86400;
        System.out.println("I giorni sono"+ giorni);

        int ore= secondi/3600;
        int restoO= secondi%3600;
        System.out.println("Le ore sono"+ore);

        int minuti= secondi/60;
        int restoM= secondi %60;
        System.out.println("I minuti sono"+ minuti);

        int secondo= secondi/1;
        int restoS= secondi%1;
        System.out.println("I secondi sono" + restoM);
    }
}