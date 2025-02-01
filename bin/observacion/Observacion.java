
package clase;
import java.util.Date;
public class Observacion {
    // Atributos
    private int idobservacion;
    private int idestudiante; 
    private Date fecha;
    private String autor; 
    private String descripcion;

    // Constructor
    public Observacion(int idobservacion, int idestudiante, String autor, String descripcion) {
        this.idobservacion = idobservacion;
        this.idestudiante = idestudiante;
        this.autor = autor;
        this.descripcion = descripcion;
        fecha= new Date();
    }

    // Métodos
    // Getters y Setters para los atributos básicos
    public int getIdobservacion() {
        return idobservacion;
    }

    public void setIdobservacion (int idobservacion) {
        this. idobservacion = idobservacion;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }
   public Date getFecha() {
    return fecha;
   }
    // Métodos adicionales
   @Override
   public String toString() {
        return "Id de Observacion= "+idobservacion+ "Id de estudiante= "+idestudiante+" Autor="+autor+"Fecha="+fecha+" Descripcion= "+descripcion;
    }
}
