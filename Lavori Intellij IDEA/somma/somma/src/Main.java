import java.util.Scanner;
/*Scrivere un programma che chiede all’utente l’inserimento da tastiera di due valori numerici
ed effettuare la loro somma. Visualizzare come output il risultato ottenuto */
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int numerou= input.nextInt();
        System.out.println("Inserisci il secondo numero");
        int numerod= input.nextInt();
        int somma= numerou+numerod;
        System.out.println("La somma dei due numeri è "+ somma);
    }
}