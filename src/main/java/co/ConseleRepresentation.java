/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

import java.util.Observable;
import java.util.Observer;
import java.util.Stack;

/**
 *
 * @author casadocentes
 */
public class ConseleRepresentation implements Observer{

    public void update(Observable o, Object arg) {
        Stack<Node> stack=(Stack)(arg);
        System.out.println("Respuesta "+stack);
    }
    
}
