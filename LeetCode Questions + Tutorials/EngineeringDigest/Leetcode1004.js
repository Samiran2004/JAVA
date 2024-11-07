"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function longestOnes(nums, flips) {
    var left = 0, ans = 0, count = 0;
    for (var right = 0; right < nums.length; right++) {
        if (nums[right] == 0) {
            count++;
        }
        while (count > flips) {
            if (nums[left] == 0) {
                count--;
            }
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}
var arr = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1];
var flips = 3;
console.log(longestOnes(arr, flips));
