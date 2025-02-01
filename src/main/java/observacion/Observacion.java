package observacion;

import java.util.Date;

public class Observacion {
  // Atributos
  private int id;
  private int idestudiante;
  private Date fecha;
  private String autor;
  private String descripcion;

  // Constructor
  public Observacion(int idobservacion, int idestudiante, String autor, String descripcion) {
    this.id = idobservacion;
    this.idestudiante = idestudiante;
    this.autor = autor;
    this.descripcion = descripcion;
    this.fecha = new Date();
  }

  // Métodos
  // Getters y Setters para los atributos básicos
  public int getId() {
    return id;
  }

  public void setId(int idobservacion) {
    this.id = idobservacion;
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

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Date getFecha() {
    return fecha;
  }

  // Métodos adicionales
  @Override
  public String toString() {
    return "Id de Observacion= " + id +
        "	Id de estudiante= " + idestudiante +
        "	Autor= " + autor +
        "	Fecha= " + fecha +
        "	Descripcion= " + descripcion;
  }
}