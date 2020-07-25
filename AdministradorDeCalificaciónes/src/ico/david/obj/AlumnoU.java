package ico.david.obj;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariok David
 */
public class AlumnoU {
    private int cuentaUNAM;
    private String cntrsn;
    private String nombre;
    private String apellidos;
    private String institucion;
    private String carrera;

    public AlumnoU() {
    }

    public AlumnoU(int cuentaUNAM, String cntrn, String nombre, String apellidos, String institucion, String carrera) {
        this.cuentaUNAM = cuentaUNAM;
        this.cntrsn = cntrn;
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

    public String getCntrsn() {
        return cntrsn;
    }

    public void setCntrsn(String cntrsn) {
        this.cntrsn = cntrsn;
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
    
    //Metodo para guardar datos en el archivo txt(mini base de datos gg)
    
    public void escribirArchivo(String cuentaT, String cntrsnT, String nombreT, String apellidosT, String institucionT, String carrera){
        String nuevoAlumno = "";
        nuevoAlumno = cuentaT + "*" + cntrsnT + "*" + nombreT + "*" + apellidosT + "*" + institucionT + "*" + carrera;
        
        //A continuación se guardan los datos en el archivo
        
        FileWriter fichero;
        PrintWriter pw;
        try {
            fichero = new FileWriter("Usuarios.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(nuevoAlumno);
            pw.close();
            fichero.close();
            JOptionPane.showConfirmDialog(null, "El usuario " + cuentaT + " se ha guardado correctamente.", "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No ha sido posible registrarlo, porfavor revise que ha llenado los campos correctamente", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);            
        }
    }
}
