package com.neeraj;

import java.util.ArrayList;
import java.util.List;

public class Problem_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                ans.add(index);
            }
        }
        return ans;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
