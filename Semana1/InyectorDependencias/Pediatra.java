package InyectorDependencias;

public class Pediatra implements Doctor {
    String nombre;

    public Pediatra(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void tratarPaciente(String paciente) {
        System.out.println("El pediatra trata al paciente " + paciente);
    }

}
