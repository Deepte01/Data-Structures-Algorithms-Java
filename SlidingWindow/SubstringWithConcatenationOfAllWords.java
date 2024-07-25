package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords {
    static List<Integer> findSubString(String s, String [] words)
    {
        List<Integer> result  = new ArrayList<Integer>();
        if(s == null || words.length == 0)
        {
            return result;
        }
        int wordLength = words[0].length();
        int inputLength = words.length;
        int totalLength = wordLength * inputLength;

        //create a word count map
        Map<String, Integer> wordMap= new HashMap<String, Integer>();
        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0)+1);
        }

        for(int i=0; i < wordLength; i++)
        {
           int right;
           int left = right = i;
           int count = 0;
           Map<String, Integer> windowMap = new HashMap<>();

           while (right + wordLength <= s.length()) {
              String word = s.substring(right, right + wordLength);
              right += wordLength;

              if(wordMap.containsKey(word))
              {
                 windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                 count++;
   
                 while (windowMap.get(word) > wordMap.get(word)) 
                 {
                    String leftWord = s.substring(left, left + wordLength);
                    windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                    left += wordLength;
                    count --;
                 }
                 if(count == inputLength)
                 {
                   result.add(left);
                 }
              }
              else{
                 windowMap.clear();
                 count = 0;
                 left = right;
              }
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        System.out.println(findSubString("barfoofoobarthefoobarman", 
        new String[]{"bar","foo","the"}));
    }
}
