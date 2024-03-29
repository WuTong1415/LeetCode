package com.wt.Q48;


//给定一个 n × n 的二维矩阵表示一个图像。
//
//将图像顺时针旋转 90 度。
//
//说明：
//
//你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
//
//示例 1:
//
//给定 matrix = 
//[
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//],
//
//原地旋转输入矩阵，使其变为:
//[
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//]
//示例 2:
//
//给定 matrix =
//[
//  [ 5, 1, 9,11],
//  [ 2, 4, 8,10],
//  [13, 3, 6, 7],
//  [15,14,12,16]
//], 
//
//原地旋转输入矩阵，使其变为:
//[
//  [15,13, 2, 5],
//  [14, 3, 4, 1],
//  [12, 6, 8, 9],
//  [16, 7,10,11]
//]

public class Solution {
	public static void rotate(int[][] matrix) {
		int size = matrix.length-1;
		for (int i = 0; i < matrix.length/2; i++) {
			for (int j = i; j < matrix.length-i-1; j++) {
				change(i, j, j, size-i, matrix);
				change(i, j, size-i, size-j, matrix);
				change(i, j, size-j, i, matrix);
			}
		}
		System.out.println(matrix.length);
	}
	public static void change(int x1,int y1,int x2,int y2,int[][] matrix) {
		int temp = matrix[x1][y1];
		matrix[x1][y1] = matrix[x2][y2];
		matrix[x2][y2] = temp;
	}
	public static void main(String[] args) {
		int [][] a= {{1}};/*{{ 5, 1, 9,11},
				  { 2, 4, 8,10},
				  {13, 3, 6, 7},
				  {15,14,12,16}}*/
		rotate(a);
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}
}
