// Clase Enfermero
public class Enfermero extends Persona {
    private String especialidad;

    public Enfermero(String nombre, String identificacion, String direccion, String especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "nombre='" + getNombre() + '\'' +
                ", identificacion='" + getIdentificacion() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
