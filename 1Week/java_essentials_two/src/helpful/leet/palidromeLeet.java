class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > 0; i--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
            
class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
        } 
    }
}
