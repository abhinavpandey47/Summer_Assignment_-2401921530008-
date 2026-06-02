import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int s[] = new int[set.size()];
        int i =0;
        for(int num:set){
            s[i++] = num;
        }
        Arrays.sort(s);
    for(int k=0;k<set.size();k++){
        nums[k] = s[k];
    }
        return set.size();
    }
}