package Polimorfismo;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo atún...");
    }

}
