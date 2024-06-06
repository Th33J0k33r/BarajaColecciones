package BarajaDePoker;

public class Card extends Deck{

    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    //======================================= Getters =======================================
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public String getColor() {
        return color;
    }

    //======================================= Setters =======================================
    public void setColor(String color) {
        this.color = color;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
