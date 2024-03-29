
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例?1:
 * 给定 nums = [1,1,1,2,2,3],
 * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例?2:
 * 给定 nums = [0,0,1,1,1,1,2,3,3],
 * 函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为?0, 0, 1, 1, 2, 3, 3 。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author WuTong
 * @create 2019-08-24 10:52
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j, size = nums.length - 2, temp, num1, num2;
        for (; i < size; i++) {
            j = i + 2;
            if (nums[i] == nums[j]) {
                for (; j < nums.length - 1; j++) {
                    if (nums[j] == nums[j + 1]) {
                        continue;
                    }
                    break;
                }
                if (j==nums.length-1)
                    return i+2;
                num1 = i;
                num2 = j;
                for (; num2 < nums.length-1; num2++) {
                    temp = nums[num1 + 2];
                    nums[num1 + 2] = nums[num2+1];
                    nums[num2+1] = temp;
                    num1++;
                }
                size -= (j - i - 1);
            }
        }
        return size + 2;
    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0,1,2,2,2};
        System.out.println(removeDuplicates(a));

    }
}
