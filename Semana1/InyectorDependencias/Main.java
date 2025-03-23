package InyectorDependencias;

public class Main {
    public static void main(String[] args) {
        Hospital hospitalGeneral = InyectorDeDoctor.getDoctor("Dr. Filologo", "general");
        hospitalGeneral.tratarPaciente("Juan");

        Hospital hospitalCardiologo = InyectorDeDoctor.getDoctor("Dr. Corazon", "cardiologo");
        hospitalCardiologo.tratarPaciente("Maria");

        Hospital hospitalPediatra = InyectorDeDoctor.getDoctor("Dr. Andronico", "pediatra");
        hospitalPediatra.tratarPaciente("Pedro");
    }
}
