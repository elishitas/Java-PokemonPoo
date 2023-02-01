package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola! Soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola! Soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola! Soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola! Soy Pikachu y este es mi ataque Impacto Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola! Soy Pikachu y este es mi ataque Puño Trueno");
    }
    
}
