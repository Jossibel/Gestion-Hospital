public class Main {
    public static void main(String[] args) {
        // Instanciación de clases
        Persona persona = new Persona(null, null, null);
        Enfermero enfermero = new Enfermero(null, null, null, null);
        ExpedienteMedico expedienteMedico = new ExpedienteMedico(null);
        Paciente paciente = new Paciente(null, null, null, expedienteMedico);
        Doctor doctor = new Doctor(null, null, null, null);
        CitaMedica citaMedica = new CitaMedica(null, null, null, null, paciente, doctor);

        // Definición de atributos y métodos
        // ...
    }
}
