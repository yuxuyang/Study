
import java.util.*;
import java.util.Map;
import java.util.HashMap;
/*
1
	Question:
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	Explanation：
		when you are searching in a array with the target value, pretend the answer is already in the hashmap, if you can't 
		find it, put value that the current pointer pointed to into the map,

*/

class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if (map.containsKey(complement)) {
            	return new int[] { map.get(complement), i };
        	}
        	map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
	}


	public static int[] twoSumTwo(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i< nums.length; i++){
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i){
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void test1(){
		int[] a = {1,2,3,4,5,6};
		int target = 5; 
		System.out.println(Arrays.toString(twoSumTwo(a, 5)));
	}

	public static void main (String[] args){
		test1();
	}
}
