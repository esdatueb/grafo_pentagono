package co;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by alejandro on 26/05/17.
 */
public class Graph {
    private Set<Node> nodos;
    private ArrayList<Path> paths;

    Graph(){
        nodos=new LinkedHashSet<Node>();
        paths=new ArrayList<Path>();
    }

    public void addNode(Node newNode){
        this.nodos.add(newNode);
    }

    public void addPath(Path p){
        this.paths.add(p);
        this.nodos.add(p.getOrigen());
        this.nodos.add(p.getDestino());
    }

    public Set<Node> getNodos() {
        return nodos;
    }

    public void setNodos(Set<Node> nodos) {
        this.nodos = nodos;
    }

    public ArrayList<Path> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<Path> paths) {
        this.paths = paths;
    }
}
