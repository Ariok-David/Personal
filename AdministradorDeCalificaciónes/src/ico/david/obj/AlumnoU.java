package ico.david.obj;

/**
 *
 * @author Ariok David
 */
public class AlumnoU {
    private int cuentaUNAM;
    private String nombre;
    private String apellidos;
    private String institucion;
    private String carrera;

    public AlumnoU() {
    }

    public AlumnoU(int cuentaUNAM, String nombre, String apellidos, String institucion, String carrera) {
        this.cuentaUNAM = cuentaUNAM;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.institucion = institucion;
        this.carrera = carrera;
    }

    public int getCuentaUNAM() {
        return cuentaUNAM;
    }

    public void setCuentaUNAM(int cuentaUNAM) {
        this.cuentaUNAM = cuentaUNAM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
