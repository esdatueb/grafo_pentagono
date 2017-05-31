package co;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by alejandro on 26/05/17.
 */
public class Node {

    String name;
    Set<Path> paths;

    public Node(String s) {
        this.name=s;
        this.paths=new LinkedHashSet<Path>();
    }

    public void addPath(Path p){
        this.paths.add(p);
    }

    @Override
    public String toString() {
        return name;
    }

    public Set<Path> getPaths() {
        return paths;
    }
}
