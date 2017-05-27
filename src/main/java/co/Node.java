package co;

import java.util.ArrayList;

/**
 * Created by alejandro on 26/05/17.
 */
public class Node {

    String name;
    ArrayList<Path> paths;

    public Node(String s) {
        this.name=s;
    }

    @Override
    public String toString() {
        return name;
    }
}
