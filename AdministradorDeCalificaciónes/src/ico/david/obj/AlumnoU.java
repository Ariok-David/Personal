package ico.david.obj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariok David
 */
public class AlumnoU {
    private String cuentaUNAM;
    private String cntrsn;
    private String nombre;
    private String apellidos;
    private String institucion;
    private String carrera;

    public AlumnoU() {
    }

    public AlumnoU(String cuentaUNAM, String cntrn, String nombre, String apellidos, String institucion, String carrera) {
        this.cuentaUNAM = cuentaUNAM;
        this.cntrsn = cntrn;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.institucion = institucion;
        this.carrera = carrera;
    }

    public String getCuentaUNAM() {
        return cuentaUNAM;
    }

    public void setCuentaUNAM(String cuentaUNAM) {
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
        nuevoAlumno = cuentaT + "-" + cntrsnT + "-" + nombreT + "-" + apellidosT + "-" + institucionT + "-" + carrera;
        
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
    
    public String iniciarSesion(String noCuenta, String contra){
        String entro = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Vector fila = new Vector();
        
        try {
            archivo = new File("Usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String filaLeidaArchivo;
            String[] cadenaSeparada;
            while ((filaLeidaArchivo = br.readLine()) != null) {                
                System.out.println(filaLeidaArchivo);
                cadenaSeparada = filaLeidaArchivo.split("-");
                System.out.println(cadenaSeparada[0]);
                System.out.println(cadenaSeparada[1]);
                System.out.println(cadenaSeparada[2]);
                System.out.println(cadenaSeparada[3]);
                System.out.println(cadenaSeparada[4]);
                System.out.println(cadenaSeparada[5]);
                //Editar despues ya tu sabe gg
                String cuentaUNAMt = cadenaSeparada[0];
                String cntrsnt = cadenaSeparada[1];
                String nombret = cadenaSeparada[2];
                String apellidost = cadenaSeparada[3];
                String instituciont = cadenaSeparada[4];
                String carrerat = cadenaSeparada[5];
                if ((cuentaUNAMt.equals(noCuenta)) && (cntrsnt.equals(contra))) {
                    fila.removeAllElements();
                    fila.add(cuentaUNAMt);
                    fila.add(cntrsnt);
                    fila.add(nombret);
                    fila.add(apellidost);
                    fila.add(instituciont);
                    fila.add(carrerat); 
                }
            }
            entro = fila.elementAt(0) + "-" + fila.elementAt(1) + "-" + fila.elementAt(2) + " " + fila.elementAt(3) + "-" + fila.elementAt(4) + "-" + fila.elementAt(5);
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "no es posible iniciar sesion", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
        return entro;
    }
    
}
