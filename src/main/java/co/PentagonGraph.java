package co;

import java.util.Iterator;

/**
 * Created by alejandro on 26/05/17.
 */
public class PentagonGraph extends Graph{

    public PentagonGraph(){
        this("Node");
    }
    public PentagonGraph(String prefix){
        //Creating Nodes
        for (int i = 0; i < 5; i++) {
            this.addNode(new Node(prefix+(i+1)));
        }
        //Creating Paths
        Iterator<Node> it=this.getNodos().iterator();
        Node firstNode=null;
        Node previousNode=null;
        while (it.hasNext()){
            Node tmp=it.next();
            if(firstNode==null){
                firstNode=tmp;
                previousNode=tmp;
                continue;
            }
            Path p=new Path();
            p.setOrigen(previousNode);
            p.setDestino(tmp);
            previousNode=tmp;
            this.addPath(p);
        }
        Path p=new Path();
        p.setOrigen(previousNode);
        p.setDestino(firstNode);
        this.addPath(p);
    }

    public static void main(String[] args) {
        PentagonGraph p=new PentagonGraph("Out");
        PentagonGraph p2=new PentagonGraph("In");
        System.out.println(p.getNodos());
        System.out.println(p.getPaths());
    }
}
