package observacion;

public class ListaObservaciones {
  private NodoObservacion inicio;

  public ListaObservaciones() {
    inicio = null;
  }

  public void insertarAlInicio(Observacion observacion) {
    NodoObservacion nuevoNodoObservacion = new NodoObservacion(observacion);
    nuevoNodoObservacion.setNodoObservacionSiguiente(inicio);
    inicio = nuevoNodoObservacion;
  }

  public void insertarAlFinal(Observacion observacion) {
    NodoObservacion nuevoNodoObservacion = new NodoObservacion(observacion);
    NodoObservacion actual = inicio;

    while (actual.getNodoObservacionSiguiente() != null) {
      actual = actual.getNodoObservacionSiguiente();
    }

    actual.setNodoObservacionSiguiente(nuevoNodoObservacion);
  }

  public void insertarPorPocicion(int posicion, Observacion observacion) {
    NodoObservacion nuevoNodoObservacion = new NodoObservacion(observacion);

    if (posicion == 0) {
      insertarAlInicio(observacion);
      return;
    }

    NodoObservacion actual = inicio;
    int indice = 0;

    while (actual.getNodoObservacionSiguiente() != null && indice < posicion - 1) {
      actual = actual.getNodoObservacionSiguiente();
      indice++;
    }

    nuevoNodoObservacion.setNodoObservacionSiguiente(actual.getNodoObservacionSiguiente());

    actual.setNodoObservacionSiguiente(nuevoNodoObservacion);
  }

  public Observacion buscarPorNumero(int numeroObservacion) {
    NodoObservacion actual = inicio;
    while (actual != null) {
      if (actual.getObservacion().getId() == numeroObservacion) {
        return actual.getObservacion(); // Retornamos si encontramos la observación
      }
      actual = actual.getNodoObservacionSiguiente();
    }
    return null; // Si no se encuentra, retornamos null
  }

  public void mostrarObservaciones() {
    NodoObservacion actual = inicio;
    while (actual != null) {
      System.out.print(actual.getObservacion() + " ");
      actual = actual.getNodoObservacionSiguiente();
    }
    System.out.println();
  }
}
