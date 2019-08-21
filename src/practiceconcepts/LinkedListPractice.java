package practiceconcepts;

/**
 *
 * @author Brennan
 */

import java.util.*;

public class LinkedListPractice {
    private static String str1 = new String();
    private static String str2 = new String();
    
    public static void Sum2Lists(LinkedList list1, LinkedList list2){
        
        while( !list1.isEmpty())
        {
            str1 += list1.pollLast();
        }    
        
        while(!list2.isEmpty())
        {
            str2 += list2.pollLast();
        }
        System.out.println("String 1 = " + str1 + "\nString 2 = " + str2);
        
        System.out.println("Sum of 2 linked lists  = " + (Integer.parseInt(str1) + Integer.parseInt(str2)));
    }
    
    public static void Sum2ListsIncriment(LinkedList list1, LinkedList list2){
        
        
        System.out.println("Linked list 1 : " + list1);
        System.out.println("Linked list 2: " + list2);
        int sum = 0;
        int carry = 0;
        if(list1.size() > list2.size())
        {
            for(int i=0; i<list1.size(); i++)
            {
                
                sum = Integer.parseInt(list1.get(i).toString()) + Integer.parseInt(list2.get(i).toString());
                
                if(carry == 1)
                {
                    sum++;
                    carry = 0;
                    if(i == list1.size()-1)
                    {
                        list1.add(1);
                    }
                }
                
                if(sum > 10)
                {
                    sum -= 10;
                    carry = 1;
                }
                list1.set(i, sum);
            }
        }
        
        else
        {
            for(int i=0; i<list2.size(); i++)
            {
                
                sum = Integer.parseInt(list1.get(i).toString()) + Integer.parseInt(list2.get(i).toString());
                
                if(carry == 1)
                {
                    sum++;
                    carry = 0;
                    if(i == list2.size()-1)
                    {
                        list2.add(1);
                    }
                }
                
                if(sum > 10)
                {
                    sum -= 10;
                    carry = 1;
                }
                list2.set(i, sum);
                
                if(carry == 1){
                    
                }
            }
        }
        
        System.out.println("String 1 = " + list1 + "\nString 2 = " + list2);
        
        System.out.println("Sum of 2 linked lists  = " + list1);
    }
    
    
}
