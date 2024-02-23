class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int a = i; a<words.length; a++) {
                if (isPrefixAndSuffix(words[i], words[a]) && a != i) {
                    count += 1;
                }
            }
            
        }
        return count;
    }

    
    public boolean isPrefixAndSuffix(String one, String two) {
        
        if (two.length() >= one.length()) {
            
        
            if (two.substring(0, one.length()).equals(one) && two.substring(two.length()-one.length()).equals(one)) {
                return true;
            }
            
        }
        return false;
        
    }
}
