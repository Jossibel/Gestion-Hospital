public class ExpedienteMedico {
    private String historialMedico;

    public ExpedienteMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void agregarDiagnostico(String diagnostico) {
        this.historialMedico += "\nDiagnóstico: " + diagnostico;
    }

    public void agregarTratamiento(String tratamiento) {
        this.historialMedico += "\nTratamiento: " + tratamiento;
    }

    public void agregarPrescripcion(String prescripcion) {
        this.historialMedico += "\nPrescripción: " + prescripcion;
    }

    @Override
    public String toString() {
        return "ExpedienteMedico{" +
                "historialMedico='" + historialMedico + '\'' +
                '}';
    }
}
