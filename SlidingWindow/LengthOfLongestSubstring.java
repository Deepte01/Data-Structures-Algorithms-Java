package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        //without repeating characters
        int left =0;
        int maxLength = 0;
         Set<Character> set = new HashSet();
         for(int right =0; right < s.length(); right++)
         {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
            }
            else{
                while(set.contains(s.charAt(right)))
                {
                    set.remove(s.charAt(left));
                    left +=1;
                }
                set.add(s.charAt(right));
            }
            maxLength=Math.max(maxLength,right-left+1);

         }
         return maxLength;
    }
    public static void main(String args[])
    {
        System.out.println(lengthOfLongestSubstring("dvfv"));
    }
}