package ico.david.obj;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariok David
 */
public class Semestre {
    private String idCuenta;
    private String noSemestre;
    private String materia;
    private String profesor;
    private float calificacion;

    public Semestre() {
    }

    public Semestre(String idCuenta, String noSemestre, String materia, String profesor, float calificacion) {
        this.idCuenta = idCuenta;
        this.noSemestre = noSemestre;
        this.materia = materia;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNoSemestre() {
        return noSemestre;
    }

    public void setNoSemestre(String noSemestre) {
        this.noSemestre = noSemestre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    //Metodo para guardar calificaciones en la base de datos txt nueva
    
    public void aniadirArchivo (String cuenta, String semestre, String materiaa, String profesorr, String calificacionn){
        String nuevaMateria = "";
        nuevaMateria = cuenta + "-" + semestre + "-" + materiaa + "-" + profesorr + "-" + calificacionn;
        
        //A continuacion se guardaran los datos en el archivo txt
        
        FileWriter fichero;
        PrintWriter pw;
        try {
            fichero = new FileWriter("Materias.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(nuevaMateria);
            pw.close();
            fichero.close();
            JOptionPane.showConfirmDialog(null, "La materia de : " + materiaa + " se ha guardado correctamente.", "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No ha sido posible añadir la materia, porfavor revise si ha ingresado los datos correctamente", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
