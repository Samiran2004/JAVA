"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function findMaxConsecutiveOnes(nums) {
    var left = 0, sum = 0, ans = 0;
    for (var right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (!(sum == right - left + 1 || sum == right - left)) {
            sum -= nums[left];
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}
var arr = [1, 1, 0, 1, 0, 1];
console.log(findMaxConsecutiveOnes(arr));
