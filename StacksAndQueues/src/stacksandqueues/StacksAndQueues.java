/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;

import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class StacksAndQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Stacks..");
        Stacks<String> s = new StacksQueues<>();
        s.push("First");
        s.push("Second");
        s.push("Third");
        s.pop();
        s.show();
        System.out.println("| size = " + s.size());
        if (s.isEmpty()) {
            System.out.println("Empty.");
        } else
            System.out.println("Not Empty.");
        
        System.out.println("-------------------------");
        
        System.out.println("Queues..");
        Queues<String> q = new StacksQueues<>();
        q.enQueue("First");
        q.enQueue("Second");
        q.enQueue("Third");
        q.deQueue();
        q.show();
        System.out.println("| size = " + q.size());
        if (q.isEmpty()) {
            System.out.println("Empty.");
        } else
            System.out.println("Not Empty.");
        
    }
    
}
