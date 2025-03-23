package Polimorfismo;

public class RefugioAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Pato("Donald");
        animales[1] = new Gato("Tom");
        animales[2] = new Perro("Pluto");

        System.out.println("Bienvenidos al refugio de animales");
        System.out.println("----------------------------------\n");
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            animal.comer();
            System.out.println();
        }
    }
}
