import java.util.Scanner;
//Calcolare il perimetro e area di un rettangolo, triangolo, cerchio, quadrato, chiedendo i valori necessari
public class Main {
    public static void main(String[] args) {
        //rettangolo
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo");
        int base = input.nextInt();
        System.out.println("Inserisci l'altezza del rettangolo");
        int altezza = input.nextInt();
        //Perimetro
        int perimetro = (base * 2) + (altezza * 2);
        System.out.println("Il perimetro del rettangolo è" + perimetro);
        //Area
        int Area = (base * altezza);
        System.out.println("L'area del rettangolo è" + Area);
        //triangolo
        System.out.println("Inserisci il primo lato del triangolo");
        int latoT = input.nextInt();
        System.out.println("Inserisci il secondo lato del triangolo");
        int altezzaT = input.nextInt();
        System.out.println("Inserisci il terzo lato del triangolo");
        int latob=input.nextInt();
        //perimetro triangolo
        int perimetroT = latoT + altezzaT+ latob ;
        System.out.println("Il perimetro del triangolo è" + perimetroT);
        //area triangolo
        int AreaT = (latoT* altezzaT/ 2);
        System.out.println("L'area del triangolo è" + AreaT);
        //Cerchio
        System.out.println("Inserisci il diametro");
        int diametro= input.nextInt();
        //perimetro cerchio
        double perimetroc= diametro* 3.14;
        System.out.println("Il perimetro del cerchio è" + perimetroc);
        //area cerchio
        System.out.println("Inserisci il raggio del cerchio");
        int raggio= input.nextInt();
        int AreaC= raggio*raggio;
        System.out.println("L'area del cerchio è " + AreaC);
        //quadrato
        System.out.println("Inserisci un lato del quadrato");
        int latoq=input.nextInt();
        //perimetro quadrato
        int perimetroq= latoq*4;
        System.out.println("Il perimetro del quadrato è"+ perimetroq);
        //area quadrato
        int Areaq= latoq*latoq;
        System.out.println("L'area del quadrato è"+ Areaq);
        input.close();
    }
}