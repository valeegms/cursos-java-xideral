package InyectorDependencias;

public class DoctorGeneral implements Doctor {
    String nombre;

    public DoctorGeneral(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void tratarPaciente(String paciente) {
        System.out.println("El doctor general trata al paciente " + paciente);
    }

}
