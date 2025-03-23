package Polimorfismo;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo croquetas...");
    }

}
