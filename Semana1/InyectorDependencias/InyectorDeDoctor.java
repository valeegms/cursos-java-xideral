package InyectorDependencias;

public class InyectorDeDoctor {
    public static Hospital getDoctor(String nombre, String tipoDoctor) {
        switch (tipoDoctor) {
            case "general":
                return new Hospital(new DoctorGeneral(nombre));
            case "cardiologo":
                return new Hospital(new Cardiologo(nombre));
            case "pediatra":
                return new Hospital(new Pediatra(nombre));
            default:
                return null;
        }
    }
}
