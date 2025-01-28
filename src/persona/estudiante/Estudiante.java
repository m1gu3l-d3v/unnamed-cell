// Este codigo esta mal (las partes con codigo comentado son las partes q se deben corregir por Marquinhos)
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

  // // Métodos para manejar observaciones
  // public void agregarObservacion(Observacion nuevaObservacion) {
  //   NodoObservacion nuevoNodo = new NodoObservacion(nuevaObservacion);
  //   if (listaObservaciones == null) {
  //     listaObservaciones = nuevoNodo;
  //   } else {
  //     NodoObservacion actual = listaObservaciones;
  //     while (actual.getNodoObservacionSiguiente() != null) {
  //       actual = actual.getNodoObservacionSiguiente();
  //     }
  //     actual.setNodoObservacionSiguiente(nuevoNodo);
  //   }
  // }

  // public void eliminarObservacion(int idObservacion) {
  //   if (listaObservaciones == null) {
  //     System.out.println("No hay observaciones para eliminar.");
  //     return;
  //   }
  //   if (listaObservaciones.getNodoObservacionSiguiente().getId() == idObservacion) {
  //     listaObservaciones = listaObservaciones.getSiguiente();
  //     return;
  //   }
  //   NodoObservacion actual = listaObservaciones;
  //   while (actual.getSiguiente() != null && actual.getSiguiente().getObservacion().getId() != idObservacion) {
  //     actual = actual.getSiguiente();
  //   }
  //   if (actual.getSiguiente() != null) {
  //     actual.setSiguiente(actual.getSiguiente().getSiguiente());
  //   } else {
  //     System.out.println("Observación no encontrada.");
  //   }
  // }

  // public void mostrarObservaciones() {
  //   NodoObservacion actual = listaObservaciones;
  //   if (actual == null) {
  //     System.out.println("No hay observaciones registradas.");
  //     return;
  //   }
  //   while (actual != null) {
  //     System.out.println(actual.getObservacion());
  //     actual = actual.getSiguiente();
  //   }
  // }

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
    // mostrarObservaciones();
  }

  public boolean buscarPorMatricula(int matriculaBuscada) {
    return this.matricula == matriculaBuscada;
  }
}