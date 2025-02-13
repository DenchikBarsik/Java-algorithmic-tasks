//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n)  runtime complexity.

package org.example;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Избегаем переполнения
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // Позиция для вставки
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 7));
    }

}
