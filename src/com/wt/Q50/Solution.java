package com.wt.Q50;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * 
 * 示例 1:
 * 
 * 输入: 2.00000, 10 输出: 1024.00000 示例 2:
 * 
 * 输入: 2.10000, 3 输出: 9.26100 示例 3:
 * 
 * 输入: 2.00000, -2 输出: 0.25000 解释: 2-2 = 1/22 = 1/4 = 0.25 说明:
 * 
 * -100.0 < x < 100.0 n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 * 
 * @author Wutong
 *
 */
/* 二分法 */
public class Solution {
	public static double myPow(double x, int n) {
		long d = n;
		if (d < 0) {
			return newpow(1 / x, -d);
		}
		return newpow(x, d);
	}

	private static double newpow(double x, long d) {
		if (d == 0) {
			return 1;
		}
		if (d == 1) {
			return x;
		}
		long num = d / 2;
		double re = newpow(x, num);
		if (d % 2 == 0) {
			return re * re;
		}
		return re * re * x;
	}

	public static void main(String[] args) {
		System.out.println(myPow(1.00000, -2147483648));
		System.out.println(Math.pow(0.2, 5));
	}
}
