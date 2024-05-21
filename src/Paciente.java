// Clase Paciente
public class Paciente extends Persona {
    private ExpedienteMedico expedienteMedico;

    public Paciente(String nombre, String identificacion, String direccion, ExpedienteMedico expedienteMedico) {
        super(nombre, identificacion, direccion);
        this.expedienteMedico = expedienteMedico;
    }

    public ExpedienteMedico getExpedienteMedico() {
        return expedienteMedico;
    }

    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + getNombre() + '\'' +
                ", identificacion='" + getIdentificacion() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", expedienteMedico=" + expedienteMedico +
                '}';
    }
}