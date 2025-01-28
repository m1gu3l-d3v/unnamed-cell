package observacion;

public class NodoObservacion {
  private Observacion observacion;
  private NodoObservacion nodoObservacionSiguiente;

  public NodoObservacion(Observacion personaValor) {
    this.observacion = personaValor;
    nodoObservacionSiguiente = null;
  }

  public Observacion getObservacion() {
    return observacion;
  }

  public void setObservacion(Observacion personaValor) {
    this.observacion = personaValor;
  }

  public NodoObservacion getNodoObservacionSiguiente() {
    return nodoObservacionSiguiente;
  }

  public void setNodoObservacionSiguiente(NodoObservacion nodoObservacionSiguiente) {
    this.nodoObservacionSiguiente = nodoObservacionSiguiente;
  }
}
