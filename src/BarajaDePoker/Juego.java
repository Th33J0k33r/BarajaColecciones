package BarajaDePoker;

import java.util.Scanner;

public class Juego {
    static String[] menuOpt = {"1. Shuffle", "2. Head", "3. Pick", "4. Hand", "5. Exit"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mVal = true;
        Deck.CreateDeck();

        System.out.println("Bienvenido, por favor selecciona una opcion: ");
        printMenu();
        int selectedOpt = 0;

        while (selectedOpt != 5) {
            selectedOpt = sc.nextInt();
            switch (selectedOpt){
                case 1:
                    Deck.shuffle();
                    break;
                case 2:
                    Deck.head();
                    break;
                case 3:
                    Deck.pick();
                    break;
                case 4:
                    Deck.hand();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida, selecciona otra opcion");
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        for (int i = 0; i <=3; i++) {
            System.out.println(menuOpt[i]);
        }
    }
}
