package practiceconcepts;

/**
 *
 * @author Brennan
 */
public class Strings {
    
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            System.out.println("Empty List");
            return "";
        } 
        
        String Prefix = new String();
        // go through each string and check current letter
        boolean OneMatch = false;
        int flag;
        int min = Integer.MAX_VALUE;
        int shortestStringPos = 0;
        
        //find shortest string
        for(int i=0; i<strs.length; i++)
        {
            if(strs[i].length() < min)
            {
                min = strs[i].length();
                shortestStringPos = i;
            }
        }

        // go through the strings
        for(int i=0; i<strs[shortestStringPos].length(); i++)
        {
            char c = strs[shortestStringPos].charAt(i);  
            flag = 0;
            
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    if(OneMatch)
                    {
                        System.out.println(Prefix);
                        return Prefix;
                    }
                    else
                    {
                        System.out.println("No Matches");
                        return "";
                    }
                }
            }
            if(flag == 0)
            {
                Prefix += c;
            }
            OneMatch = true;
        }
        System.out.println(Prefix);
        return Prefix;
    }
}
