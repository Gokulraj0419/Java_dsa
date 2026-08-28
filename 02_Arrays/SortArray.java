/* 
Given an unsorted array arr[] of numbers, sort the array in ascending order. 
*/

class Solution {
    void sortArr(int[] arr) {
      Arrays.sort(arr);
    }
}


/*
Example:

Input: arr[] = [1, 5, 3, 2]
Output: [1, 2, 3, 5]
Explanation: After sorting, array will be like [1, 2, 3, 5].
Input: arr[] = [3, 1]
Output: [1, 3]
Explanation: After sorting, array will be like [1, 3].
Input: arr[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation: It's already sorted in ascending order.

*/