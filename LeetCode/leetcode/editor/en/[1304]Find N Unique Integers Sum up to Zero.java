//Given an integer n, return any array containing n unique integers such that th
//ey add up to 0. 
//
// 
// Example 1: 
//
// 
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: [-1,0,1]
// 
//
// Example 3: 
//
// 
//Input: n = 1
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// 
// Related Topics Array 
// 👍 411 👎 243


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        int[] h = new int[n];
        h[0] = ((n-2)*((n-2) + 1))/2;
        int counter = 0;
        for (int i = 1; i < n; i++) {
            h[i] = counter*(-1);
            counter ++;
        }
        return h;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
