package searchinRotatedSortedArray;

/**
 * @title Search in Rotated Sorted Array
 * @description Suppose an array sorted in ascending order is rotated at some
 *              pivot unknown to you beforehand.
 * 
 *              (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 *              You are given a target value to search. If found in the array
 *              return its index, otherwise return -1.
 * 
 *              You may assume no duplicate exists in the array.
 * @author Cun Shi
 * @date: 2017��11��9�� ����9:40:01
 */
class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums!=null||nums.length!=0) {
			for (int i = 0; i < nums.length; i++) {
				if(target == nums[i]){
					return i;
				}
			}
		}
		return -1;
	}
}
