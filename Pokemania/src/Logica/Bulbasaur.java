
package Logica;


public class Bulbasaur extends Pokemon implements IPlanta{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola! Soy Bulbasur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola! Soy Bulbasur y este es mi ataque Arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola! Soy Bulbasur y este es mi ataque Mordisco");
        
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola! Soy Bulbasur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola! Soy Bulbasur y este es mi ataque Paralizar");
    }
    
}
