package InyectorDependencias;

public class Cardiologo implements Doctor {
    String nombre;

    public Cardiologo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void tratarPaciente(String paciente) {
        System.out.println("El cardiologo trata al paciente " + paciente);
    }

}
