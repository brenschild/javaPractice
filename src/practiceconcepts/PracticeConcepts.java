package practiceconcepts;

/**
 *
 * @author Brennan
 */

import Helper.*;
import java.util.*;
public class PracticeConcepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Find Sum of two linked lists:");
        // Find sum of two linked lists
        LinkedList list1 = new LinkedList(); 
        LinkedList list2 = new LinkedList(); 
        list1.add("5");
        list1.add("2");
        list2.add("5");
        list2.add("7");
        
        System.out.println("Linked list 1 : " + list1);
        System.out.println("Linked list 2: " + list2);
        
        LinkedListPractice.Sum2Lists(list1,list2);
        LinkedListPractice.Sum2ListsIncriment(list1, list2);
        
        System.out.println("\n");
        
        
        System.out.println("Find origin and destination from list of pairs");
        // Find origin and destination from list of pairs
        List<Pair> travelList = new LinkedList();
        Pair a = new Pair("LAX", "DCA");
        Pair b = new Pair("JFK", "MIA");
        Pair c = new Pair("MIA", "DCA");
        Pair d = new Pair("DCA", "LAX");

        travelList.add(a);
        travelList.add(b);
        travelList.add(c);
        travelList.add(d);
        
        Travel.GetOriginDestination(travelList);
        
        //findMedianSortedArrays
        System.out.println("Find Median sorted arrays:");
        int arrayA[] = new int[]{1,2};
        int arrayB[] = new int[]{3,4};
        
        Arrays.findMedianSortedArrays(arrayA,arrayB);
        
        //Find longestCommonPrefix
        System.out.println(" Find longestCommonPrefix");
        String[] s = new String[0];
        Strings.longestCommonPrefix(s);
        
        s = new String[]{"kale","kyle","byle"};
        Strings.longestCommonPrefix(s);
        
        s = new String[]{"florida", "flower", "flea"};
        Strings.longestCommonPrefix(s);
    }
    
}
