package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    static String minWindow(String s, String t) {
        int l=0; 
        String minWindow = "";
        HashMap<Character, Integer> targetMap = new HashMap<Character, Integer>();
        for(int i=0; i< t.length(); i++)
        {
           targetMap.put(t.charAt(i), 0);
        }
        for(int i=0; i< s.length(); i++)
        {
            int sum =0;
            if(t.contains(s.substring(i, i+1)))
            {
              //  System.out.println(s.substring(i, i+1) + " index: " + i);
                targetMap.put(s.charAt(i), targetMap.getOrDefault(s.charAt(i), 0)+1);
                System.out.println(targetMap);
            }
            for (int f : targetMap.values()) {
               sum += f;
            }
            if(!t.contains(s.substring(i, i+1)) && sum == 0)
            {
              l=i+1;
            }
            if(sum > t.length())
            {
                System.out.println("sum is greater than t.length "+ sum);
            }
            if(sum == t.length())
            {
                System.out.println("L: "+ l +" i: "+ i);
                minWindow = s.substring(l, i+1);
                l = i+1;
                targetMap.clear();
            }
        }
        return minWindow;
    }

    public static void main(String args[])
    {
       System.out.println(minWindow("bdab", "ab"));
    }
}
