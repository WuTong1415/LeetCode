package com.wt.Q40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * 
 * candidates 中的每个数字在每个组合中只能使用一次。
 * 
 * 说明：
 * 
 * 所有数字（包括目标数）都是正整数。 解集不能包含重复的组合。  示例 1:
 * 
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8, 所求解集为: [ [1, 7], [1, 2, 5],
 * [2, 6], [1, 1, 6] ] 示例 2:
 * 
 * 输入: candidates = [2,5,2,1,2], target = 5, 所求解集为: [   [1,2,2],   [5] ]
 * 
 * @author Wutong
 *
 */
public class Solution {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		for (int i : candidates) {
			System.out.println(i);
		}
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		choosenumber(candidates, target, 0, re, list);
		return re;
	}

	private static void choosenumber(int[] candidates, int target, int i, List<List<Integer>> re, List<Integer> list) {
		if (target == 0) {
			re.add(new ArrayList<Integer>(list));
			return;
		}
		if (target < candidates[0]) {
			return;
		}

		for (int num = i; num < candidates.length; num++) {
			if (candidates[num] > target) {
				return;
			}
			list.add(candidates[num]);
			choosenumber(candidates, target - candidates[num], num+1, re, list);
			if (num==candidates.length-1) {
				list.remove(list.size() - 1);
				break;
			}
			while (candidates[num+1]==candidates[num]) {
				num++;
				if (num==candidates.length-1) {
					break;
				}
			}
			list.remove(list.size() - 1);
		}

	}
	
	public static void main(String[] args) {
		int a[] = {1,1,1,1,1};
		System.out.println(combinationSum2(a, 1));
	}
}
