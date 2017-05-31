/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

import java.util.Iterator;

/**
 *
 * @author alejandro
 */
public class PostmanGraph extends Graph{
    
    

    public PostmanGraph(PentagonGraph p_out, PentagonGraph p_in) {
        Iterator iin=p_in.getNodos().iterator();
        for(Node origen:p_out.getNodos()){
            Node destino=(Node)iin.next();
            Path p=new Path();
            p.setOrigen(origen);
            p.setDestino(destino);
            this.addPath(p);
        }
    }
    
    
    
}
