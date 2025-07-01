package org.dsa.array;

import java.util.Arrays;
import java.util.List;

public class Largest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int second = findSecondLargest(nums);
        int third = findThirdLargest(nums);
        System.out.println(second);
        System.out.println(third);
    }

    static int findThirdLargest(List<Integer> nums) {
        int largest = nums.get(0);
        int secondlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;

        for(int i =1; i<nums.size(); i++){
            if(largest < nums.get(i)){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = nums.get(i);
            }
            else if (largest > nums.get(i) && secondlargest < nums.get(i)) {
                thirdlargest = secondlargest;
                secondlargest = nums.get(i);
            }
            else if (largest > nums.get(i) && secondlargest > nums.get(i) && nums.get(i) > thirdlargest) {
                thirdlargest = nums.get(i);
            }
        }

        return thirdlargest;
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
