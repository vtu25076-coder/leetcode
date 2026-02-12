import java.util.*;

class Solution {
    public boolean halvesAreAlike(String s) {
        
        Set<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
        
        int mid = s.length() / 2;
        int countA = 0;
        int countB = 0;
        
        for (int i = 0; i < mid; i++) {
            if (vowels.contains(s.charAt(i))) {
                countA++;
            }
        }
        
        for (int i = mid; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                countB++;
            }
        }
        
        return countA == countB;
    }
}
