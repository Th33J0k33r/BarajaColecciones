package BarajaDePoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    protected Card card;

    public Deck(Card card){
        this.card = card;
    }

    //======================================= Valores de las cartas =======================================
    private static final String[] paloCarta = {"Corazones", "Diamantes", "Trebol", "Picas"};
    private static final String[] colorCarta = {"Rojo", "Negro"};
    private static final String[] valorCartas = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    //======================================= Generar la Baraja =======================================
    private static ArrayList<Card> deck;

    public Deck() {
    }

    //public ArrayList<Card> Deck() {
    public static void CreateDeck() {
        deck = new ArrayList<Card>();

        //Cartas Rojas (Corazones[0] & Diamentes[1])
        for (int palo = 0; palo < 2; palo++)
            for (int valor = 0; valor < valorCartas.length; valor++)
                deck.add(new Card(paloCarta[palo], colorCarta[0], valorCartas[valor]));

        //Cartas Negras (Trebol[2] & Picas[3])
        for (int palo = 2; palo < 4; palo++)
            for (int valor = 0; valor < valorCartas.length; valor++)
                deck.add(new Card(paloCarta[palo], colorCarta[1], valorCartas[valor]));
        //return deck;
    }

    //======================================= Getters =======================================
    public static int getSize() {
        return deck.size();
    }

    //======================================= Funciones/Metodos =======================================

    public static void shuffle(){
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
    }

    public static void head(){
        System.out.println(deck.get(0).getPalo() + ", " + deck.get(0).getColor() + ", " + deck.get(0).getValor());
        deck.remove(0);
        System.out.println("Quedan: " + getSize() + " cartas en el Deck");
    }

    public static void pick(){
        Random random_method = new Random();
        int index = random_method.nextInt(deck.size());
        System.out.println(deck.get(index).getPalo() + ", " + deck.get(index).getColor() + ", " + deck.get(index).getValor());
        deck.remove(index);
        System.out.println("Quedan: " + getSize() + " cartas en el Deck");
    }
    public static void hand(){
        for (int i = 0; i <= 4; i++) {
            System.out.println(deck.get(0).getPalo() + ", " + deck.get(0).getColor() + ", " + deck.get(0).getValor());
            deck.remove(0);
        }
        System.out.println("Quedan: " + getSize() + " cartas en el Deck");
    }
}
