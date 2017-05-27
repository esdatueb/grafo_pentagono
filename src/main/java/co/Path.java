package co;

/**
 * Created by alejandro on 26/05/17.
 */
public class Path {

    private Node origen;
    private Node destino;


    public Node getOrigen() {
        return origen;
    }

    public void setOrigen(Node origen) {
        this.origen = origen;
    }

    public Node getDestino() {
        return destino;
    }

    public void setDestino(Node destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "{"+origen+","+destino+"}";
    }
}
