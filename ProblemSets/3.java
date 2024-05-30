import java.util.HashSet;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // initialise an empty string
        // loop through each possible substring (not sequence) and add
        // each character to a hashset
        if(s.length() == 1) {
            return 1;
        } else if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) return 1;
            else return 2;
        }
        String longestSubstring = "";
        for(int i=0; i<s.length()-1; i++) {
            HashSet<String> chars = new HashSet<>();
            int count = i;
            String tempString = "";
            while(chars.add(s.substring(count, count+1)) && count+1 < s.length()) {
                tempString+=s.substring(count, count+1);
                count++;
            }
            if(!tempString.contains(String.valueOf(s.charAt(count))))
            tempString+=String.valueOf(s.charAt(count));
            if(tempString.length() > longestSubstring.length()) {
                longestSubstring = tempString;
            }
        }
        return longestSubstring.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}