package observacion;

public class NodoObservacion {
  private Observacion personaValor;
  private NodoObservacion nodoObservacionSiguiente;

  public NodoObservacion(Observacion personaValor) {
    this.personaValor = personaValor;
    nodoObservacionSiguiente = null;
  }

  public Observacion getPersonaValor() {
    return personaValor;
  }

  public void setPersonaValor(Observacion personaValor) {
    this.personaValor = personaValor;
  }

  public NodoObservacion getNodoObservacionSiguiente() {
    return nodoObservacionSiguiente;
  }

  public void setNodoObservacionSiguiente(NodoObservacion nodoObservacionSiguiente) {
    this.nodoObservacionSiguiente = nodoObservacionSiguiente;
  }
}
