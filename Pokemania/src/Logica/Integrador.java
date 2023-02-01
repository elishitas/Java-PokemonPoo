package Logica;


public class Integrador {

    public static void main(String[] args) {
        Squirtle squi = new Squirtle();
        Charmander charm = new Charmander();
        Bulbasaur bul = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        squi.atacarAraniazo();
        squi.atacarHidroBomba();
        charm.atacarAraniazo();
        charm.atacarLanzaLlamas();
        bul.atacarAraniazo();
        bul.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpacTrueno();
    }
    
}
