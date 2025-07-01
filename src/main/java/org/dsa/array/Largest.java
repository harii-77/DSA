package org.dsa.array;

import java.util.Arrays;
import java.util.List;

public class Largest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int second = findSecondLargest(nums);
        System.out.println(second);
    }

    static int findSecondLargest(List<Integer> nums) {
        int largest = nums.get(0);
        int secondlargest = Integer.MIN_VALUE;

        for(int i =1; i<nums.size(); i++){
            if(largest < nums.get(i)){
                secondlargest = largest;
                largest = nums.get(i);
            }
            else if (largest > nums.get(i) && nums.get(i) > secondlargest) {
                secondlargest = nums.get(i);
            }
        }

        return secondlargest;
    }
}
