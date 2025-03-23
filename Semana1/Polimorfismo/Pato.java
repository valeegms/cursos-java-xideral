package Polimorfismo;

public class Pato extends Animal {
    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Cuack cuack!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo migajas de pan...");
    }

}
