import java.ut
import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {

    }

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
    return false;
    }
}

// <https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html>

public boolean hasDuplicatePro(int[] nums) {
    Set<Integer> uniques = new HashSet<>();
    for(int i =0; i < nums.length; i++) {
        if (uniques.contains(nums[i])) {
            return true;
        }
        uniques.add(nums[i]);
    }
}

