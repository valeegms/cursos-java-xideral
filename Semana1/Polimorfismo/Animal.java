package Polimorfismo;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public abstract void comer();

    public void mostrarInfo() {
        System.out.println("Mi nombre es: " + nombre + " y soy un " + this.getClass().getSimpleName());
    }
}
