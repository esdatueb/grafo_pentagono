package co;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by alejandro on 31/05/17.
 */
public class Postmangraph extends Graph {

    PentagonGraph out;
    PentagonGraph in;

    public PentagonGraph getIn() {
        return in;
    }

    public PentagonGraph getOut() {
        return out;
    }

    public Postmangraph(PentagonGraph out, PentagonGraph in){
        this.out=out;
        this.in=in;
        Set<Node> sout=out.getNodos();
        Set<Node> sin=in.getNodos();
        Iterator<Node> it=sin.iterator();
        //Create Internal paths
        for(Node node_out : sout){
            Node node_in=it.next();
            Path p=new Path();
            p.setOrigen(node_out);
            p.setDestino(node_in);
            this.addPath(p);
        }
        //Add lateral paths
        this.addPaths(out.getPaths());
        this.addPaths(in.getPaths());
    }
}
