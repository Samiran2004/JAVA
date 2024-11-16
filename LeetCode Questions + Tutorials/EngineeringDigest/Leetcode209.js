"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function minSubArrayLen(target, nums) {
    var left = 0, window = 0, ans = nums.length + 1;
    for (var right = 0; right < nums.length; right++) {
        window += nums[right];
        while (window >= target) {
            ans = Math.min(ans, right - left + 1);
            window -= nums[left++];
        }
    }
    return ans == nums.length + 1 ? 0 : ans;
}
var nums = [2, 3, 1, 2, 4, 3];
var target = 7;
console.log(minSubArrayLen(target, nums));
