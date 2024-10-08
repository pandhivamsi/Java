package org.example;

public class LinearBinarySearch {
    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 5, 8};
        int target = 8;

        int result = linearSearch(nums, target);
        int result1 = binarySearch(nums, target, 0, nums.length - 1);
        if (result1 != -1) {
            System.out.println("Element found at " + result);
        } else {
            System.out.println("not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {

        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println(steps);
                return i;
            }
        }
        System.out.println(steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {

        // 2,3,4,5,8
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
}