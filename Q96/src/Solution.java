import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数 n，求以?1 ...?n?为节点组成的二叉搜索树有多少种？
 * 示例:
 * 输入: 3
 * 输出: 5
 * 解释:
 * 给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 *
 * @author WuTong
 * @create 2019-09-03 10:10
 */
public class Solution {
    public static int numTrees(int n) {
        int[] res = new int[n + 1];
        res[0]=1;
        res[1]=1;
        for (int i =2;i<=n;i++){
            for (int j =0;j<i;j++){
                res[i] += res[j]*res[i-1-j];
            }
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(5));
    }
}
