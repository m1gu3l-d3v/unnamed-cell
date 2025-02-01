package persona.estudiante;

import observacion.ListaObservaciones;
import observacion.NodoObservacion;
import observacion.Observacion;

public class Estudiante {

  // Atributos básicos
  private int matricula;
  private String nombre;
  private int edad;
  private String direccion;
  private String telefono;
  private String correo;

  // Perfiles
  private PerfilAcademico perfilAcademico;
  private PerfilPsicologico perfilPsicologico;

  // Lista enlazada de observaciones
  private ListaObservaciones listaObservaciones;

  // Constructor
  public Estudiante(int matricula, String nombre, int edad, String direccion, String telefono, String correo,
      PerfilAcademico perfilAcademico, PerfilPsicologico perfilPsicologico) {
    this.matricula = matricula;
    this.nombre = nombre;
    this.edad = edad;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correo = correo;
    this.perfilAcademico = perfilAcademico;
    this.perfilPsicologico = perfilPsicologico;
    this.listaObservaciones = null; // Inicialmente sin observaciones
  }

  // Métodos
  // Getters y Setters para los atributos básicos
  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  // Getters y Setters para los perfiles
  public PerfilAcademico getPerfilAcademico() {
    return perfilAcademico;
  }

  public void setPerfilAcademico(PerfilAcademico perfilAcademico) {
    this.perfilAcademico = perfilAcademico;
  }

  public PerfilPsicologico getPerfilPsicologico() {
    return perfilPsicologico;
  }

  public void setPerfilPsicologico(PerfilPsicologico perfilPsicologico) {
    this.perfilPsicologico = perfilPsicologico;
  }

  // Métodos para manejar observaciones
  public void agregarObservacion(Observacion nuevaObservacion) {
    listaObservaciones.insertarAlFinal(nuevaObservacion);
  }

  public void eliminarObservacion(int idObservacion) {
    // Metodo para agregar en listaObservaciones
    listaObservaciones.eliminarObservacionPorId(idObservacion);
  }

  public void mostrarObservaciones() {
    listaObservaciones.mostrarObservaciones();
  }

  // Métodos adicionales
  public void mostrarInformacionCompleta() {
    System.out.println("Matrícula: " + matricula);
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Dirección: " + direccion);
    System.out.println("Teléfono: " + telefono);
    System.out.println("Correo: " + correo);
    System.out.println("Perfil Académico: " + perfilAcademico);
    System.out.println("Perfil Psicológico: " + perfilPsicologico);
    System.out.println("Observaciones: ");
    mostrarObservaciones();
  }

  public boolean buscarPorMatricula(int matriculaBuscada) {
    return this.matricula == matriculaBuscada;
  }

}