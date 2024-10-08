package org.example;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 9, 4, 6};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
