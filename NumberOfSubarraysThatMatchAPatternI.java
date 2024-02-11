//PROBLEM LINK: https://leetcode.com/contest/weekly-contest-384/problems/number-of-subarrays-that-match-a-pattern-i/ 
class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        for (int i = 0; i<nums.length-pattern.length; i++) {
            int currI = i; 
            for (int a = 0; a<pattern.length; a++) {
                if (pattern[a] == 1 && nums[i+1] <= nums[i]) {

                    break;
                }
                else if (pattern[a] == 0 && nums[i+1] != nums[i]) {
                    
                    break;
                } else if (pattern[a] == -1 && nums[i+1] >= nums[i]){
                    
                    break;
                }
                
                if (a == pattern.length - 1) {
                    count += 1;
                    
                }
                i++;
            }
            i = currI;
        }
        return count;
        
    }
   
    

}
