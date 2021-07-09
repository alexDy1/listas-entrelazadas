public class Nodo {
    private Nodo circulo;
    private Nodo siguiente;
    private Object dato;

    public Nodo(Object dato, Nodo siguiente,Nodo circulo) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.circulo=circulo;

    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getCirculo() {
        return circulo;
    }

    public void setCirculo(Nodo circulo) {
        this.circulo = circulo;
    }
}
