package InyectorDependencias;

public class Hospital {
    private final Doctor doctor;

    public Hospital(Doctor doctor) {
        this.doctor = doctor;
    }

    public void tratarPaciente(String paciente) {
        doctor.tratarPaciente(paciente);
    }
}
