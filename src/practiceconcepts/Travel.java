/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceconcepts;

/**
 *
 * @author Brennan
 */
import Helper.Pair;
import java.util.*;

public class Travel {
        
    public static void GetOriginDestination(List<Pair> Schedule)
    {
        List<String> o = new ArrayList();
        List<String> d = new ArrayList();
        String origin = new String();
        String destination = new String();
        for(Pair a : Schedule)
        {    
            o.add((String) a.getLeft());
            d.add((String) a.getRight());
        }
        
        System.out.println(o);
        System.out.println(d);
        
        for(String str : o)
        {
            if(!d.contains(str))
            {
                origin = str;
            }
            
        }
        
        for(String str : o)
        {
            if(d.contains(str))
            {
                d.remove(str);
            }
        }
        destination = d.get(0);
        System.out.println("Origin:" + origin + "\nDestination: " + destination);
    }
} 
