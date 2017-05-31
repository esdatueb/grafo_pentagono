/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

import jdk.nashorn.internal.objects.NativeRegExp;

import java.util.*;

/**
 *
 * @author casadocentes
 */
public class Walker extends Observable{

    public Walker(){
        rta=new Stack<Node>();
    }

    public static void main(String[] args) {
        //Building the graph
        PentagonGraph p = new PentagonGraph("Out");
        PentagonGraph p2 = new PentagonGraph("In");
        System.out.println(p.getNodos());
        System.out.println(p.getPaths());
        System.out.println(p2.getNodos());
        System.out.println(p2.getPaths());
        Postmangraph postm = new Postmangraph(p, p2);
        System.out.println(postm.getNodos());
        System.out.println(postm.getPaths());
        Walker k = new Walker();
        k.setInicial(p.getNodos().iterator().next());
        Stack<Node> rta = k.walk(k.getInicial(),null);
        System.out.println(rta);
    }
    
    private Stack<Node> rta;
    private Node inicial;

    public void setInicial(Node inicial) {
        this.inicial = inicial;
    }

    public Stack<Node> walk(Node startingNode,Path actual){
        Iterator<Path> paths=startingNode.getPaths().iterator();
        Path tmp=null;
        if(rta.isEmpty()) {
            rta.add(startingNode);
            do {
                 tmp= paths.next();
                walk(tmp.getDestino(),tmp);
            }while(paths.hasNext() && tmp==actual);

        }
        if(rta.size()<10 && !rta.contains(startingNode) && paths.hasNext()){
            rta.add(startingNode);
            tmp=null;
            do {
                tmp = paths.next();
                walk(tmp.getDestino(),tmp);
            }while(paths.hasNext() && tmp==actual);

        }
        if(rta.size()<10 && tmp!=null && rta.contains(tmp.getDestino())  && tmp.getDestino()==inicial){

             if(paths.hasNext())
                 tmp = paths.next();
            walk(tmp.getDestino(),tmp);

        }else if(rta.size()<10 && tmp!=null){
           // rta.pop();
            if(paths.hasNext())
                tmp = paths.next();
            walk(tmp.getDestino(),tmp);
        }
        System.out.println("Rata "+rta);
        return rta;
    }

    public Node getInicial() {
        return inicial;
    }
}
